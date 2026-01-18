package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.example.BasePage;

public class yourInformationPage extends BasePage {
    public yourInformationPage() {
        super(driver);
    }

    private static String informationTitle ="//span[@class='title']";//xpath
    private static String firstNameField = "first-name";// id
    private static String lastNameField = "last-name";// id
    private static String postalCodeField = "postal-code";// id
    private static String continueButton = "continue";

    public static void inputShippingInformation() {
        WebElement informationTitlePagElement = driver.findElement(By.xpath(informationTitle));
        Assert.assertTrue(informationTitlePagElement.isDisplayed());
        WebElement firstNameFieldElement = driver.findElement(By.id(firstNameField));
        firstNameFieldElement.sendKeys("Mike");
        WebElement lastNameFieldElement = driver.findElement(By.id(lastNameField));
        lastNameFieldElement.sendKeys("Serra");
        WebElement postalCodeFieldElement = driver.findElement(By.id(postalCodeField));
        postalCodeFieldElement.sendKeys("45138");
        WebElement continueButtonElement = driver.findElement(By.id(continueButton));
        continueButtonElement.click();
    }

}
