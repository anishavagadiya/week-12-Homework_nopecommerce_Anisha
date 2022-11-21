package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //clicking on login link
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));
        //Verify the text 'Welcome Please Sign In!'
        String expectedMessage = "Welcome Please Sign In";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Welcome, Please Sign In!", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in")); //click on login link
        sendTextToElement(By.id("Email"), "anisha_vagadiya@yahoo.com"); //Enter valid username
        sendTextToElement(By.name("Password"), "test1234"); //Enter valid password
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']")); //click on login button
        //This is form requirement
        String expectedMessage = "Logout button display";
        String actualMessage = getTextFromElement(By.xpath("//a[@class = 'ico-logout']")); //verify logout button display
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Logout button display", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        clickOnElement(By.linkText("Log in")); //click on login link
        sendTextToElement(By.id("Email"), "vagadiya11@gmail.com"); //Enter Invalid username
        sendTextToElement(By.name("Password"), "test123"); //Enter Invalid password
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']")); //click on login button
        //This is form requirement
        String expectedMessage = "error message display";
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")); //verify error message display
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to error message display", expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        closeBrowser();

    }
}