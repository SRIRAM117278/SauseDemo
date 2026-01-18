package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.example.BasePage;

public class yourCartPage extends BasePage {

    public yourCartPage() {
        super(driver);        
    }

    private static String cartPageTitle ="//span[@class='title' and contains (text(), 'Your Cart')]"; 
    private static String productTitle ="//div[@class='inventory_item_name' and contains (text(), 'Sauce Labs Bike Light')]";
    private static String checkoutButton ="checkout";//id
    


    public static void proceedToCheckout() throws InterruptedException {
        Thread.sleep(2000);
       WebElement carPageTitleElement = driver.findElement(By.xpath(cartPageTitle));
       String carPageTitleString = carPageTitleElement.getText();
       String expectedCarPageTitleString= "Your Cart"; 
       System.out.println(carPageTitleString);
       Assert.assertEquals(carPageTitleString, expectedCarPageTitleString);
       WebElement productTitleElement = driver.findElement(By.xpath(productTitle));
       String productTitleElementString = productTitleElement.getText();
       System.out.println(productTitleElementString);
       String expectedProductTitleString= "Sauce Labs Bike Light"; 
       Assert.assertEquals(productTitleElementString, expectedProductTitleString);
       WebElement checkoutButtonElement = driver.findElement(By.id(checkoutButton));
       Assert.assertTrue(checkoutButtonElement.isDisplayed());
       checkoutButtonElement.click();
    }




}
