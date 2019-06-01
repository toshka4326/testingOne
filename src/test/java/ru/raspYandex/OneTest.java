package ru.raspYandex;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class OneTest extends WebDriverSettings {

    @Test
    public void oneTest () {

        //1. Пользователь открывает сайт https://rasp.yandex.ru
        driver.get("https://rasp.yandex.ru/");
        WebElement form = driver.findElement(By.cssSelector("[class=\"SearchForm\"]"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"SearchForm\"]")));

        //2. Вводит пункт отправления «Кемерово»
        form.findElement(By.id("from")).sendKeys("Кемерово");

        //3. Вводит пункт назначения «Москва»
        form.findElement(By.id("to")).sendKeys("Москва");

        //4. Вводит дату 7 июля
        form.findElement(By.id("when")).sendKeys("7 июля");

        //5. Нажимает Найти
        form.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div/div[5]/form/button[2]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("section")));

        //6. Проверяет, что отображается название рейса.

        //7. Проверяет, что у направления есть время в пути.
        //8. Проверяет, что у всех рейсов есть иконка транспорта.

        //9. Проверяет, что рейсов отобразилось 5.
        int count = driver.findElements(By.cssSelector("h3")).size();
        Assert.assertEquals(5,count);
    }
}


