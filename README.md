![capture_20240808190618980](https://github.com/user-attachments/assets/8b63b04e-1bff-4890-b555-f3d94b19809f)

# Selenium
Selenium — это бесплатная среда для автоматизированного тестирования (с открытым исходным кодом),
которая используется при проверке веб-приложений в
различных браузерах и на разных платформах. Для создания тестовых сценариев Selenium мы можем исполь-
зовать разные языки программирования, такие как Java,
C#, Python, Ruby , PHP и т. д.
Selenium Software — это не просто инструмент, а набор программного обеспечения (набор инструментов),
каждая часть которого удовлетворяет различным потребностям в организации тестирования. Вот список инструментов, которые входят в Selenium Software:
1. Selenium WebDriver,
2. Selenium RC,
3. Selenium Grid,
4. Selenium IDE.

# Инсталяция Selenium
Для установки и настройки Selenium WebDriver на ло-
кальной машине понадобятся:
1. `Java`;
2. `Selenium server`;
3. Среда для разработки тестов (`Eclipse`);
4. `ChromeDriver` (для тестирования в `Google Chrome`).

В этом разделе мы будем устанавливать тестовую среду
на `Windows` машину. Установим `Java`, `Eclipse`, `Selenium`,
`Webdriver` для определения объектов в веб-интерфейсе.

# Установка Java

`JDK` — это полнофункциональный комплект разработки программного обеспечения для `Java`, включающая `JRE`, компиляторы и инструменты
(такие как `JavaDoc` и `Java Debugger`), существующая для создания и компиляции программ. Если вы хотите просто запустить `Java` программу в 
вашем браузере или компьютере, то вам будет достаточно установленного `JRE`. 
Но если же планируете программировать на Java, то вам также понадобится пакет
1. Загрузите `Java Platform JDK` из официального сайта
```
http://www.oracle.com/technetwork/java/javase/downloads/index.html
```
2. Установите `java` с настройками по умолчанию
3. Установите переменную `“Java home”`

3.1. Если машина `Windows` нажмите `Win+R` и наберите `sysdm.cpl` перейдите во вкладку дополнительно/переменные среды.
Создайте переменную: `JAVA_HOME`.
Значение переменной: `<путь куда установлена java>` например 
```
(C:\Program Files\Java\jdk1.8.0_65).
```

3.2. Также нужно добавить значение: `<путь куда установлена java>\bin.` в переменную `PATH` : Нажать `Edit` и добавить: 
```
C:\Program Files\Java\jdk1.8.0_65\bin.
```

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/2988d7c2-a673-4b5f-8165-b4d01acb659c)


После установки переменной следует перезапустить `cmd` консоль. Проверим `java` в `cmd: java –version`.
Если вы видите версию `java` в консоли, значит `java` установлена успешно

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/c57cfaab-4c44-4dd9-8b34-5e2ada4717bf)
# Установка IntelliJ IDEA
Скачать с официального сайта `IntelliJ IDEA`
```
https://www.jetbrains.com/ru-ru/idea/
```
Установка с настройками по умолчанию `IntelliJ IDEA`
# Установка драйвера для браузера: Windows
Опишем пример установки драйвера для браузера 
`Chrome`. Для установки откройте сайт
```
https://sites.google.com/a/chromium.org/chromedriver/ downloads
```
и скачайте ту версию `ChromeDriver`, которая соответствует версии вашего браузера  

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/eda64bb4-60f8-4712-9a65-cb85f6de666d)

Чтобы узнать версию браузера, откройте новое окно 
в `Chrome`, в поисковой строке наберите: 
```
chrome://version/
```
и нажмите `Enter`. В верхней строчке вы увидите информацию про версию браузера 

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/54ef8ec0-9e33-4c8f-a3d5-46c33b1a489d)

Разархивируйте скачанный файл. Создайте на диске 
`C:` папку `webdrivers` и положите разархивированный ранее файл `chromedriver.exe` в папку `C:\webdrivers`.
Добавьте в системную переменную `PATH` папку 
```
C:\webdrivers
```
![image](https://github.com/albnsp/selenium-java-test/assets/144931244/8a79ce44-08d0-462c-8e8e-fe6c1eb73a25)
# Автономный сервер Selenium
Запуск сервера осуществляется одним из выбранных в командной строке (вызов `is` осуществляется путем ввода команды в поиске):w`indows` `command line` `cmd`
```
cd ..
```
`Selenium Grid` — это инструмент, который запускает 
тесты на нескольких физических или виртуальных машинах, чтобы скрипты могли выполняться параллельно. По сути, Selenium Grid — это кластер, состоящий из 
нескольких Selenium-серверов. Он предназначен для организации распределённой сети, позволяющей параллельно запускать несколько браузеров на большом количестве машин. 
`Selenium Grid` имеет топологию «звезда», то есть в его 
составе имеется выделенный сервер, который носит название «хаб» или «концентратор», а остальные сервера 
называются «ноды» или «узлы».

■ `Hub` — это сервер, который выступает в качестве центральной точки, где будут запускаться тесты. Selenium Grid имеет только один концентратор и запускается на одной машине один раз.

■ `Node` — это Selenium экземпляры, которые прикреплены к концентратору, и которые выполняют тесты. 
В сетке может быть один или несколько узлов, которые могут быть любой ОС и могут содержать любой 
из поддерживаемых браузеров.

Сначала мы должны запустить центральный сервер `(hub)`. Это делается с помощью следующей команды: 
```
java -jar selenium-server-standalone.jar -role hub
```
Перед запуском, убедитесь, что находитесь в директории с файлом 
`sselenium-server-standalone.jar.`

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/9539ea82-883e-41e5-af99-2fce44c9e7a3)

`Selenium Server` поддерживает одновременно два набора команд - для новой версии `(WebDriver)` и для старой версии `(Selenium RC)`.
Для запуска теста на удаленной машине нужно запустить на ней сервер, который будет принимать по сети команды, запускать браузер и выполнять их. Предполагается, что Java на машине уже установлена. Запуск сервера выполняется следующей командой, набранной в командной строке (вызов командной строки windows ocyществляется набором команды ст в поиске): 
```
Java — jar selenium-server-standalone-****.jar
```
 где * — версия сервера.

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/2a6c3f80-b4b5-46f1-b8cf-7db54a8d22fe)

В консоли у вас должна появится информация об 
успешном старте hub-a. 
```11:54:52.596 INFO - Nodes should register to
http://192.168.99.1:4444/grid/register/
11:54:52.596 INFO - Selenium Grid hub is up and running
```

Первая строчка означает, что теперь мы можем регистрировать узлы по адресу, где запущен `hub`. Вторая 
строчка означает, что `hub` успешно запущен.
После запуска команды можно перейти на панель администрирования хаба по адресу: 

```
http://localhost:4444/grid/
```

# Подключение Selenium к проекту IntelliJ
Перейдите по ссылке
```
https://www.selenium.dev/downloads/
```
Найдите среди доступных языков и нажмите на `JavaDownload`

Распакуйте файл . Содержание будет примерно таким: `archive`

Откройте свой проект и нажмите `Select`, затем нажмите на плюс справа и выберите `IntelliJFile → Project StructureModules1`. `JARs or directories…`

Перейдите в папку, куда вы только что распаковали архив и выберите все файлы из корня и из подпапки.`jarlibs`

 Нажмите `OK`



# Драйвер браузера Connect
Независимо от того, в чем вы пишете, операция подключения примерно одинакова. `programming `language` `code` `browser driver`

Чтобы убедиться в успешном подключении, вставьте следующий код и скомпилируйте его.
```
Selenium package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        driver.get("https://www.selenium.dev/selenium/web/web-form.html"); //opens the browser and navigates to the URL
        

    }
}
