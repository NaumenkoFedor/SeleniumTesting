

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
 * Осуществляет вызов бокового меню, ручной поиск товара для
 * последующего изучения информации о товаре
 *
 * @author Fedor Naumenko
 * @version 1.0.0
 */

public class TestSetFimi {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, осуществляет вызов бокового меню, ручной поиск товара для
     * последующего изучения комплектности этого самого товара

     */

    public static void main(String[] args) throws InterruptedException {

        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://coptertime.ru/");  // Открываем главную страницу сайта

        // 1. Вызываем боковое меню наведением указателя мыши
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[1]/a/span[1]/img"))).perform();

        // 2. Находим кнопку "дроны 249гр" и кликаем на нее
        WebElement sendKey249 = driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[1]/div/ul/li[1]/div/ul/li[3]/a/span[2]"));
        sendKey249.click();

        // 3. Находим кнопку "Квадрокоптер FIMI Mini 3 Combo" и кликаем на нее
        WebElement sendKeyFimi = driver.findElement(By.xpath("//*[@id=\"bx_3966226736_105796_362ce596257894d11ab5c1d73d13c755\"]/div/div[3]/a"));
        sendKeyFimi.click();

        // 4. Находим кнопку "в комплекте", кликаем на нее и изучаем комплектацию товара
        WebElement sendKeySet = driver.findElement(By.xpath("//*[@id=\"bx_117848907_105796_tabs\"]/div/div/ul/div[1]/div/div[2]/li"));
        sendKeySet.click();

        // 5. Находим кнопку "Согласен" и нажимаем ее
        WebElement sendKeyAgree = driver.findElement(By.xpath("/html/body/div[2]/button"));
        sendKeyAgree.click();



    }
}