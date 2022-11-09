package tests.day13_testNGFramework;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_testNGIlktest extends TestBase {

    /*
    TestNG test methodlarını isim sırasana göre çalıştırır.
    eğer sıralamayı değiştirmek isterseniz priority kullanabiliriz.

    priorty yazan methodlar küçükten büyüğe göre sıralanır
    eğer priorty belirtilmeyen method varsa priority=0 kabul edilir.

    aynı priority değerine sahip değer varsa bunlar harf sırasına göre çalışır
     */

    @Test(priority = 10)
    public void ilkTest(){
        driver.get("https://www.amazon.com");
    }

    @Test
    public void ikinciTest (){
        driver.get("https://www.youtube.com");
    }

    @Test (priority = 12)

    public void ucuncuTest(){
        driver.get("https://www.wisequarter.com");
    }
}
