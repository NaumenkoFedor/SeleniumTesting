

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
 * Осуществляет поиск продукта, добавление его в корзину,
 * переход в корзину и оформления заказа.
 *
 * @author Fedor Naumenko
 * @version 1.0.0
 */

public class TestOrderHub {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, выполняет поиск продукта, добавляет его в корзину,
     * открывает корзину и переходит к оформлению заказа.

     */

    public static void main(String[] args) throws InterruptedException {

        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://coptertime.ru/");      // Открываем главную страницу сайта

        // 1. Находим поле для поиска и вводим запрос "mavic"
        WebElement searchInputField = driver.findElement(By.xpath("//*[@id=\"title-search-input\"]"));
        searchInputField.sendKeys("mavic");
        searchInputField.submit();

        // 2. Находим  товар "Зарядный хаб для DJI Mavic Battery Charging Hub" и кликаем на него
        WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"bx_3966226736_380_7e1b8e3524755c391129a9d7e6f2d206_pict\"]"));
        searchElement.click();

        // 3. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(300);

        // 4. Находим кнопку "купить" в карточке товара
        WebElement buyButton = driver.findElement(By.xpath("//*[@id=\"bx_117848907_380_add_basket_link\"]/i"));
        buyButton.click();

        // 5. Находим кнопку "Корзина" с добавленным товаром и кликаем на нее
        WebElement goToCartButton = driver.findElement(By.xpath("//*[@id=\"bx_basketh3CV5Q\"]/a[2]/i"));
        goToCartButton.click();

        // 6. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(700);

        // 7. Находим кнопку "Оформить заказ" и кликаем на нее
        WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/form/div[3]/div[2]/button[2]/span[1]"));
        checkoutButton.click();
    }
}