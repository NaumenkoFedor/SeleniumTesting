

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 /*
       ______     __
      / ____/__  / /__  ____  (_)_  ______ ___
      \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
    ___/ /  __/ /  __/ / / / / /_/ / / / / / /
    /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
    ------------------------------------------

 */

/**
 * Класс представляет собой автотест функциональности веб-страницы.
 * Осуществляет поиск информации о презентации DJI
 *
 *
 * @author Fedor Naumenko
 * @version 1.0.0
 */

public class TestFotoDji {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, осуществляет вызов меню "О компании",
     * поиск фотогалерии с презентации Dji

     */


    public static void main(String[] args) throws InterruptedException {


        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://coptertime.ru/");  // Открываем главную страницу сайта

        // 1. Находим кнопку "Согласен" и нажимаем ее
        WebElement sendKey = driver.findElement(By.xpath("/html/body/div[2]/button"));
        sendKey.click();

        // 2. Вызываем меню "О компании" наведением указателя мыши
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"horizontal-multilevel-menu-obbx_3951543183_LkGdQn\"]/li[8]/a"))).perform();

        // 3. Находим пункт "Фотогалерея" и кликаем на него
        WebElement sendKeyFoto = driver.findElement(By.xpath("//*[@id=\"horizontal-multilevel-menu-obbx_3951543183_LkGdQn\"]/li[8]/ul/li[7]/a"));
        sendKeyFoto.click();

        // 4. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(600);

        // 5. Находим кнопку "2016-12-14 Презентация DJI Inspire 2 и Phantom 4 Pro в России" и кликаем на нее
        WebElement DjiItem = driver.findElement(By.xpath("//*[@id=\"bx_1847241719_4188\"]/a/div[2]/div"));
        DjiItem.click();
    }
}