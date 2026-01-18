package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.example.BasePage;

public class overviewPage extends BasePage{
    public overviewPage(){
        super(driver);
    }
private static String overviewTitle="//*[@id=\'header_container\']/div[2]/span";
private static String prodDescription="";
private static String priceProduct="";
private static String totalAmount="";
private static String finishButton="finish";

   
public static void verifyCorrectInfo() {
   WebElement overviewPageTitleElement = driver.findElement(By.xpath(overviewTitle));
   String overviewPageTitleString = overviewPageTitleElement.getText();
   Assert.assertEquals(overviewPageTitleString, "Checkout: Overview");
}
public static void finishThePurchase() {
  WebElement finishButtoElement = driver.findElement(By.id(finishButton));
  finishButtoElement.click();
}




}
