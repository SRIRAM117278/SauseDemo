package allTests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import pages.checkoutCompletePage;
import pages.loginDemoPage;
import pages.overviewPage;
import pages.sauceProductsPage;
import pages.yourCartPage;
import pages.yourInformationPage;

public class SauceDemoTests {
    @BeforeMethod
    public void setUp() {
        System.out.println("Starting Test");
        
        loginDemoPage.navigateToSaucePage();

    }
        // Login with correct credentials
        @Test(priority = 1)
        public void loginSauceDemo() {
            loginDemoPage.verifyTitle();
            loginDemoPage.inputCorrectCredentials();
            loginDemoPage.clickOnLoginButton();
            loginDemoPage.verifyLoggedIn();
        }

    // Login with invalid credentials
    @Test(priority = 2)
    public void loginInvalidCredentials() {
        loginDemoPage.verifyTitle();
        loginDemoPage.inputWrongCredentials();
        loginDemoPage.clickOnLoginButton();
        loginDemoPage.verifyErrorMessage();

    }

    //Validate Products
    @Test
    public void validateProducts(){
       sauceProductsPage.login();
       sauceProductsPage.verifyAmountProducts();
       sauceProductsPage.verifyDescriptionProducts();
    }
    //Add all the products to the cart
    @Test
    public void addAllTheProducts(){
        sauceProductsPage.login();
        sauceProductsPage.addAllTheProductsCart();
        sauceProductsPage.verifyAmountAddedOnIcon();
        sauceProductsPage.verifyRemoveButtonOfAll();
    }
    //Complete a Purchase
    @Test
    public void completePurchase() throws InterruptedException{
    sauceProductsPage.login();
    sauceProductsPage.addTheSecondProductListed();
    yourCartPage.proceedToCheckout();
    yourInformationPage.inputShippingInformation();
    overviewPage.verifyCorrectInfo();
    overviewPage.finishThePurchase();
    checkoutCompletePage.verifyCompletePurchase();




    }


    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginDemoPage.quitBrowser();
        System.out.println("The End");
    }

}
