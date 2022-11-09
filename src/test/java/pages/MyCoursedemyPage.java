package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyCoursedemyPage {
     public MyCoursedemyPage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }
     @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLinki;

     @FindBy(xpath = "//input[@id='login-email']")
     public WebElement emailKutusu;

     @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//a[@onclick=\"cookieAccept();\"]")
    public WebElement myCookies;

    // @FindBy(xpath = "//*[text()='Accept']") ////a[text()='Accept']
    // public WebElement cerezleriKabulEt;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

}


