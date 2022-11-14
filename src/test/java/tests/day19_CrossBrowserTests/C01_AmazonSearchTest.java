package tests.day19_CrossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;

public class C01_AmazonSearchTest extends TestBaseCross {
    @Test
    public void test01(){
        // amazon ana sayfaya gidin
        driver.get(ConfigReader.getProperty("amazonUrl"));

        // nutella için arama yapın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);

        // sonuçların nutella içerdiğini test edin
        String actualSonucyazisi=driver.
                findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")).
                getText();

        String expectedKelime="Nutella";
        Assert.assertTrue(actualSonucyazisi.contains(expectedKelime));

    }

}
