package testsuite;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUP(){
     openBrowser(baseURL);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        WebElement loginLink = driver.findElement(By.linkText("Log in")); // hover to login button
        loginLink.click(); // click on login link
        String expectedText = "Welcome, Please Sign In!";

        WebElement actualTextElement = driver.findElement(By.xpath("//h1")); // find text displayed on screen
        String actualText = actualTextElement.getText(); // returns string of text being displayed

        Assert.assertEquals(expectedText, actualText); // verify actual text is same as expected text

    }

    @After
    public void tearDown(){
        closeBrowser();
    }








}
