package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.linkText("Computers")); //click on the "computer"
        //This is form requirement
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Computers']")); //verify text "computer"
        //Validate actual and expected message
        Assert.assertEquals("Not navigate to Computers", expectedMessage, actualMessage);
    }


    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        clickOnElement(By.linkText("Electronics")); //click on "Electonics"
        //This is form requirement
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='page-title']/h1 [text() = 'Electronics']"));//verify "electronics" text
        //Validate actual and expected message
        Assert.assertEquals("Not navigate to Electronic", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        clickOnElement(By.linkText("Apparel")); //click on "Apparel"
        //This is form requirement
        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='page-title']/h1 [text() = 'Apparel']"));//verify "Apparel" text
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Apparel", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        clickOnElement(By.linkText("Digital downloads")); //click on "Digital downloads"
        //This is form requirement
        String expectedMessage = "Digital downloads";
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='page-title']/h1 [text() = 'Digital downloads']"));//verify "Digital downloads" text
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Digital downloads", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        clickOnElement(By.linkText("Books")); //click on "Books"
        //This is form requirement
        String expectedMessage = "Digital downloads";
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='page-title']/h1 [text() = 'Books']"));//verify "Books" text
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Digital downloads", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        clickOnElement(By.linkText("Jewelry")); //click on "Jewelry"
        //This is form requirement
        String expectedMessage = "Jewelry";
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='page-title']/h1 [text() = 'Jewelry']"));//verify "Jewelry" text
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Jewelry", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        clickOnElement(By.linkText("Gift Cards")); //click on "Gift cards"
        //This is form requirement
        String expectedMessage = "Gift Cards";
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='page-title']/h1 [text() = 'Gift Cards']"));//verify "Gift cards" text
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Gift Cards", expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        closeBrowser();

    }
}