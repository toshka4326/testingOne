package ru.raspYandex;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneTest extends WebDriverSettings {

    @Test
    public void oneTest () {

        driver.get("https://rasp.yandex.ru/");

        WebElement form = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div/div[5]/form"));

        WebDriverWait wait = new WebDriverWait(driver, 10);

        form.findElement(By.id("from")).sendKeys("Кемерово");

        form.findElement(By.id("to")).sendKeys("Москва");

        form.findElement(By.id("when")).sendKeys("7 июля");

        form.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div/div[5]/form/button[2]")).click();
    }

    /*@Test
    public void twoTest () {






    }*/


}
