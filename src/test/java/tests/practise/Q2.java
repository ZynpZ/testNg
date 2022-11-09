package tests.practise;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Q2 extends TestBase {
    /*
    -birbirine bağımlı testler oluşturun
    - beforeClass oluşturup setUp ayarlarını yapın
    - birbirine bağımlı testler oluşturarak;
        ilk önce facebooka gidin
        sonra facebook'a bağımlı olarak google'a gidin
        sonra da google bağlı olarak amazon'a gidin
    - driver'ı kapatın
        */

    @Test(dependsOnMethods = "test02")
    public void test01() {
        driver.get("https://www.google.com");
    }

    @Test (enabled = false)
    public void test02() {
        driver.get("https://www.facebook.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test03() {
        driver.get("https://www.amazon.com");
    }
}
