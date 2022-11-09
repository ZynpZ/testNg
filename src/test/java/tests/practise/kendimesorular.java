package tests.practise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class kendimesorular {

    /*
     Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Logout' button
10. Verify that user is navigated to login page
     */

    @Test
    public void test1(){
        Driver.getDriver().get("http://automationexercise.com");

        SoftAssert softAssert=new SoftAssert();

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="http://automationexercise.com";

        softAssert.assertEquals(actualUrl,expectedUrl,"ana sayfadasınız");

    }

}
