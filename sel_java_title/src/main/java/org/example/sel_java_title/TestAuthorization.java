

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
 * Осуществляет вход в личный кабинет пользователя
 *
 * @author Fedor Naumenko
 * @version 1.0.0
 */

public class TestAuthorization {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, осуществляет вызов меню авторизации, вводит логин и пароль
     * в соответствующие поля, подтверждает ввод

     */

    public static void main(String[] args) throws InterruptedException {

        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://coptertime.ru/");  // Открываем главную страницу сайта


        // 1. Находим кнопку "Войти" и кликаем на нее
        WebElement sendKeyEnter = driver.findElement(By.xpath("//*[@id=\"user-obfodefn\"]/span/span"));
        sendKeyEnter.click();

        // 2. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(500);

        // 3. Находим поле "Логин", кликаем на него, отправляем в поле "feudorn@mail.ru"
        WebElement sendKeyLogin = driver.findElement(By.xpath("//*[@id=\"system_auth_form6zOYVN_form\"]/div[1]/input"));
        sendKeyLogin.click();
        sendKeyLogin.sendKeys("feudorn@mail.ru");

        // 4. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(500);

        // 5. Находим поле "Пароль", кликаем на него, отправляем в поле "gallardo"
        WebElement sendKeyPassword = driver.findElement(By.xpath("//*[@id=\"system_auth_form6zOYVN_form\"]/div[2]/input"));
        sendKeyPassword.click();
        sendKeyPassword.sendKeys("gallardo");

        // 6. Находим чекбокс "Запомнить меня на этом компьютере" и устанавливаем галочку
        WebElement sendKeyRemember = driver.findElement(By.xpath("//*[@id=\"system_auth_form6zOYVN_form\"]/div[3]/div/label/span/span"));
        sendKeyRemember.click();

        // 7. Находим кнопку "Войти" и кликаем на нее
        WebElement Enter = driver.findElement(By.xpath("//*[@id=\"system_auth_form6zOYVN_btn\"]"));
        Enter.click();
    }
}