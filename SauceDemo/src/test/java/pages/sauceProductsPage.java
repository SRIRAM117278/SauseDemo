package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import com.example.BasePage;

public class sauceProductsPage extends BasePage {
    private static String sDemoUserField ="user-name";
    private static String sDemoPwdField ="password";
    private static String sDemoLoginButton ="login-button";
    private static String listProducts ="//div[@class='inventory_item_name ' and contains (@data-test, 'inventory-item-name')]";
private static String prodBackPackBtn  ="add-to-cart-sauce-labs-backpack";
private static String prodBikeLightBtn ="add-to-cart-sauce-labs-bike-light";
private static String prodBoltTShirtBtn ="add-to-cart-sauce-labs-bolt-t-shirt";
private static String prodFleeceJacketBtn ="add-to-cart-sauce-labs-fleece-jacket";
private static String prodOnesieBtn ="add-to-cart-sauce-labs-onesie";
private static String  prodRedTshirtbtn ="add-to-cart-test.allthethings()-t-shirt-(red)";
private static String amountCartIcon = "//span[@class='shopping_cart_badge' and contains (@data-test, shopping_cart_badge)]";
private static String listOfRemoveButtons = "//button[@class='btn btn_secondary btn_small btn_inventory ' and contains (text(), 'Remove')]"; 
private static String secondAddProductButton ="(//button[@class='btn btn_primary btn_small btn_inventory '])[2]";
private static String shoppingCartLink ="//a[@class='shopping_cart_link']";

public sauceProductsPage(){
        super(driver);
    }

    public static void login() {
         WebElement userFieldElement = driver.findElement(By.id(sDemoUserField));
        userFieldElement.sendKeys("standard_user");
        WebElement passwordFieldElement = driver.findElement(By.id(sDemoPwdField));
        passwordFieldElement.sendKeys("secret_sauce");
        WebElement loginButtonElement = driver.findElement(By.id(sDemoLoginButton));
        loginButtonElement.click();
    }

    public static void verifyAmountProducts() {
       List<WebElement> productList = driver.findElements(By.xpath(listProducts));
       int numberOfProducts = productList.size();
       System.out.println("Number of Products displayed: " + numberOfProducts);
 
    }

    public static void verifyDescriptionProducts() {
        List<WebElement> productList = driver.findElements(By.xpath(listProducts));
        for(WebElement product : productList){
            System.out.println(product.getText());

        }
    }

    public static void addAllTheProductsCart() {
       WebElement firstProdBtnElement = driver.findElement(By.id(prodBackPackBtn));
       firstProdBtnElement.click();
       WebElement secProdBtnElement = driver.findElement(By.id(prodBikeLightBtn));
       secProdBtnElement.click();
       WebElement thirdProdBtnElement = driver.findElement(By.id(prodBoltTShirtBtn));
       thirdProdBtnElement.click();
       WebElement fourthProdBtnElement = driver.findElement(By.id(prodFleeceJacketBtn));
       fourthProdBtnElement.click();
       WebElement fifthProdBtnElement = driver.findElement(By.id(prodOnesieBtn));
       fifthProdBtnElement.click();
       WebElement sixthProdBtnElement = driver.findElement(By.id(prodRedTshirtbtn));
       sixthProdBtnElement.click();
    }

    public static void verifyAmountAddedOnIcon() {
        WebElement cartAmountElement = driver.findElement(By.xpath(amountCartIcon));
        String amountCartString = cartAmountElement.getText();
        int amountCartInteger = Integer.parseInt(amountCartString);
        System.out.println("Amount in cart: " + amountCartInteger);
    }

    public static void verifyRemoveButtonOfAll() {
       List<WebElement> removeButtonsList = driver.findElements(By.xpath(listOfRemoveButtons));
        System.out.println("Remove Buttons displayed: " + removeButtonsList.size());

    }

    public static void addTheSecondProductListed() {
       WebElement addSecondProductBtnElement = driver.findElement(By.xpath(secondAddProductButton));
        Assert.assertTrue(addSecondProductBtnElement.isDisplayed());
       addSecondProductBtnElement.click();
       WebElement shoppingCarElement = driver.findElement(By.xpath(shoppingCartLink));
       Assert.assertTrue(shoppingCarElement.isDisplayed());
       shoppingCarElement.click();
    }




    
}
