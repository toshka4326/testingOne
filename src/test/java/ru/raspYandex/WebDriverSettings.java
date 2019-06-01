package ru.raspYandex;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSettings {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void preTest () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver74.0.3729.6.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        System.out.println("Тест запущен");
    }

    /*@After
    public void quit() {
        System.out.println("Тест окончен");
        driver.quit();
    }*/
}
