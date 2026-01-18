package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.example.BasePage;

public class loginDemoPage extends BasePage {
    private static String sDemoTitle = "//div[@class='login_logo' and contains (text(),'Swag Labs')]";
    private static String sDemoUserField ="user-name";
    private static String sDemoPwdField ="password";
    private static String sDemoLoginButton ="login-button";
    private static String sDemoProductsTitle = "//span[@class='title' and contains (text(), 'Products')]";
    private static String sDemoErrorMessage = "//h3[@data-test='error']";
    public loginDemoPage(){
        super(driver);
    }
    private static String baseUrl = "https://www.saucedemo.com/";

    public static void navigateToSaucePage() {
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

   

    public static void verifyTitle() {
        WebElement suaceDemoPageTitlte = driver.findElement(By.xpath(sDemoTitle));
        String sTitle = suaceDemoPageTitlte.getText();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(sTitle, expectedTitle);
        System.out.println(sTitle);
    }

    public static void inputCorrectCredentials() {
        WebElement userFieldElement = driver.findElement(By.id(sDemoUserField));
        userFieldElement.sendKeys("standard_user");
        WebElement passwordFieldElement = driver.findElement(By.id(sDemoPwdField));
        passwordFieldElement.sendKeys("secret_sauce");
    }

    public static void clickOnLoginButton() {
        WebElement loginButtonElement = driver.findElement(By.id(sDemoLoginButton));
        loginButtonElement.click();
    }
    public static void verifyLoggedIn() {
       WebElement productsTitlElement = driver.findElement(By.xpath(sDemoProductsTitle));
       String prodTitle = productsTitlElement.getText();
       String expectedProdTitle ="Products";
       System.out.println(prodTitle);
       Assert.assertEquals(prodTitle, expectedProdTitle);
    }
    //Login with wrong Credentials
    public static void inputWrongCredentials() {
        WebElement userFieldElement = driver.findElement(By.id(sDemoUserField));
        userFieldElement.sendKeys("standard");
        WebElement passwordFieldElement = driver.findElement(By.id(sDemoPwdField));
        passwordFieldElement.sendKeys("secret_sa");
    }
    public static void verifyErrorMessage() {
       WebElement errorMessagElement = driver.findElement(By.xpath(sDemoErrorMessage));
       String errorMessageString = errorMessagElement.getText();
       System.out.println(errorMessageString);
       Assert.assertTrue(errorMessagElement.isDisplayed());

    }

    public static void quitBrowser() {
        closeBrowser();
        }







  

    
}
