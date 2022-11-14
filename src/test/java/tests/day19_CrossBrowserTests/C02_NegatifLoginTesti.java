package tests.day19_CrossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C02_NegatifLoginTesti extends TestBaseCross {
    @Test
    public void negativeTest(){
        // mycoursedemy anasayfaya gidin
        driver.get(ConfigReader.getProperty("myUrl"));

        //login butonuna basın
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        // email ve password için geçersiz değerler girin
        driver.findElement(By.xpath("//input[@id='login-email']")).
                sendKeys(ConfigReader.getProperty("myYanlisEmail"));

        driver.findElement(By.xpath("//input[@id='login-password']")).
                sendKeys(ConfigReader.getProperty("myYanlisPassword"));

        // login butonuna basın
        ReusableMethods.bekle(2);
        driver.findElement(By.xpath("//*[text()='Accept']")).click();
        ReusableMethods.bekle(2);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        // giriş yapılamadığını test edin
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log in']")).isDisplayed());
    }
}
