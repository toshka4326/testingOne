package ru.raspYandex;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void preTest () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver74.0.3729.6.exe");
        driver = new ChromeDriver();
        System.out.println("Тест запущен");
    }

    @After
    public void quit() {
        System.out.println("Тест окончен");
        //driver.quit();
    }
}
