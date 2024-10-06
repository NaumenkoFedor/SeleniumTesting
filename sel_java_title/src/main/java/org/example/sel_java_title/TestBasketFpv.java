

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
 * Осуществляет вызов бокового меню, ручной поиск компонентов для
 * сборки базового FPV-набора
 *
 *
 * @author Fedor Naumenko
 * @version 1.0.0
 */

public class TestBasketFpv {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, осуществляет вызов бокового меню, ручной поиск товара для
     * последующего составления набора комплектующих для FPV полетов

     */


    public static void main(String[] args) throws InterruptedException {


        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://coptertime.ru/");  // Открываем главную страницу сайта

        // 1. Находим кнопку "Согласен" и нажимаем ее
        WebElement sendKeyAgree = driver.findElement(By.xpath("/html/body/div[2]/button"));
        sendKeyAgree.click();

        // 2. Вызываем боковое меню наведением указателя мыши
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[3]/a/span[1]/img"))).perform();

        // 3. Находим кнопку "Happymodel Tiny Whoop" и кликаем на нее
        WebElement sendKey = driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[3]/div/ul/li[3]/div/ul/li[4]/a/span[2]"));
        sendKey.click();

        // 4. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(500);

        // 5. Находим кнопку "Квадрокоптер Happymodel Mobula7 SPI (ELRS) (1S)" и кликаем на нее
        WebElement sendKeyHappy = driver.findElement(By.xpath("//*[@id=\"bx_3966226736_104315_7e1b8e3524755c391129a9d7e6f2d206\"]/div/div[3]/a"));
        sendKeyHappy.click();

        // 6. Находим кнопку "Купить" и кликаем на нее
        WebElement buyItemHappy = driver.findElement(By.xpath("//*[@id=\"bx_117848907_104315_add_basket_link\"]/span"));
        buyItemHappy.click();

        // 7. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(500);

        // 8. Вызываем боковое меню наведением указателя мыши
        Actions action2 = new Actions(driver);
        action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[3]/a/span[1]/img"))).perform();

        // 9. Находим кнопку "Пульты RadioMaster" и кликаем на нее
        WebElement sendKeyPult = driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[3]/div/ul/li[5]/div/ul/li[1]/a/span[2]"));
        sendKeyPult.click();

        // 10. Находим кнопку "Аппаратура управления RadioMaster TX12 MKII (CC2500) EdgeTX" и кликаем на нее
        WebElement sendKeyPult2 = driver.findElement(By.xpath("//*[@id=\"bx_3966226736_54042_7e1b8e3524755c391129a9d7e6f2d206\"]/div/div[3]/a"));
        sendKeyPult2.click();

        // 11. Находим кнопку "Купить" и кликаем на нее
        WebElement buyItemPult = driver.findElement(By.xpath("//*[@id=\"bx_117848907_54042_add_basket_link\"]"));
        buyItemPult.click();

        // 12. Вызываем боковое меню наведением указателя мыши
        Actions action3 = new Actions(driver);
        action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[3]/a/span[1]/img"))).perform();

        // 13. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(500);

        // 14. Находим кнопку "Очки/шлемы Skyzone" и кликаем на нее
        WebElement sendKeyGoggles = driver.findElement(By.xpath("//*[@id=\"catalog-menu-obbx_92906147_g8taYv\"]/ul/li[3]/div/ul/li[9]/div/ul/li/a/span[2]"));
        sendKeyGoggles.click();

        // 15. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(500);

        // 16. Находим кнопку "Видеошлем Skyzone COBRA X V4" и кликаем на нее
        WebElement sendKeyGoggles2 = driver.findElement(By.xpath("//*[@id=\"bx_3966226736_103360_7e1b8e3524755c391129a9d7e6f2d206\"]/div/div[3]/a"));
        sendKeyGoggles2.click();

        // 17. Находим кнопку "Купить" и кликаем на нее
        WebElement buyItemGoggles = driver.findElement(By.xpath("//*[@id=\"bx_117848907_103360_add_basket_link\"]/i"));
        buyItemGoggles.click();

        // 18. Находим кнопку "Корзина" с добавленными товарами и кликаем на нее
        WebElement goToCartButton = driver.findElement(By.xpath("//*[@id=\"bx_basketh3CV5Q\"]/a[2]/i"));
        goToCartButton.click();

        // 19. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(500);

        // 20. Находим кнопку "Оформить заказ" и кликаем на нее
        WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/form/div[3]/div[2]/button[2]/span[1]"));
        checkoutButton.click();
    }
}
