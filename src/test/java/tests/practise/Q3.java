package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class Q3 extends TestBase {

    /*
    - go to url: https:/www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
    - task1 : find dropdown on multi selection
    - task2: find all dropdown elements
    - task3: printout dropdown elements' number
    - task4: choose all dropdown elements and printout dropdown elements' name on Multi selection
    - task5: check until choice 6
     */

    @Test
    public void test1() {
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        WebElement dropDown = driver.findElement(By.xpath("//input[@id='justAnInputBox']"));

        dropDown.click();

        List<WebElement> dropList = driver.findElements(By.className("ComboTreeItemChlid"));

        System.out.println("Dropdownlardaki element sayisi = " + dropList.size());

        // for (int i = 0; i < dropList.size(); i++) {
//
        //     String text = dropList.get(i).getText();
        //     System.out.println("text = " + text);
//
        //     if (!text.isEmpty()){
        //         dropList.get(i).click();
        //     }
//
        //     if (text.equals("choice 5")){
        //         break;
        //     }
        // }

        Select select = new Select(dropDown);
        for (int i = 0; i < dropList.size(); i++) {

            select.selectByIndex(i);

            String text = dropList.get(i).getText();
            if (!text.isEmpty()){
                dropList.get(i).click();
            }
            if (text.equals("choice 5")){
                break;
            }
        }
    }
}
