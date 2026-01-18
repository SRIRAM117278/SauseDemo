package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.example.BasePage;

public class checkoutCompletePage extends BasePage{
 public checkoutCompletePage (){
    super(driver);
 }    
 private static String completePageTitle="//*[@id=\'header_container\']/div[2]/span";



public static void verifyCompletePurchase() {
    WebElement completePageTitlElement = driver.findElement(By.xpath(completePageTitle));
    String completePurchaseString = completePageTitlElement.getText();
    System.out.println(completePurchaseString);
    Assert.assertTrue(completePageTitlElement.isDisplayed());
}

}
