package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        clickOnElement(By.linkText("Register")); //clink on "Register" link
        //This is form requirement
        String expectedMessage = "Register";
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1 [text() = 'Register']")); //verify text "Register"
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Register", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        clickOnElement(By.linkText("Register")); //clink on "Register" link
        clickOnElement(By.xpath("//input[@id = 'gender-female']")); //click on gender radio button
        sendTextToElement(By.id("FirstName"), "Anisha"); // Enter First Name
        sendTextToElement(By.id("LastName"), "Vagadiya"); //Enter Last name
        sendTextToElement(By.xpath("//select[@name = 'DateOfBirthDay']"), "14");
        sendTextToElement(By.id("Email"), "magadiya11@gmail.com"); //Enter Email
        sendTextToElement(By.id("Password"), "test123"); // Enter password
        sendTextToElement(By.id("ConfirmPassword"), "test123"); //Enter Confirm password
        clickOnElement(By.id("register-button")); // click on Register button
        //This is form requirement
        String expectedMessage = "Registration completed";
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'result']")); //verify the text "registration completed"
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Registration completed", expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        closeBrowser();


    }
}
