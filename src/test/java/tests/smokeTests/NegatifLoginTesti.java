package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NegatifLoginTesti {

    @Test
    public void NegatifLoginTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // login linkine basin
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
        myCoursedemyPage.loginLinki.click();
        myCoursedemyPage.myCookies.click();
        ReusableMethods.bekle(3);

        // uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin

        // 1- yanlis kullanici adi, gecerli password

        // Login butonuna basarak login olmaya calisin

        // Basarili olarak giris yapilamadigini test edin
        // bunun icin hala login linklinin gorunur oldugunu test edelim

        // 2- gecerli kullanici adi, yanlis password

        // Login butonuna basarak login olmaya calisin

        // Basarili olarak giris yapilamadigini test edin

        // 3- yanlis kullanici adi, yanlis password

        // Login butonuna basarak login olmaya calisin

        // Basarili olarak giris yapilamadigini test edin



    }


}



