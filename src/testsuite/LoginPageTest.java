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



    @Test
    public void verifyErrorMessagewithInvalidCredentials(){

        WebElement loginLink = driver.findElement(By.linkText("Log in")); // hover to login button
        loginLink.click(); // click on login link

        //find email field and enter email by ID
        WebElement email = driver.findElement(By.id("Email"));
        // type into box
        email.sendKeys("prime12356@gmail.com");

        //find password field and enter password by name
       driver.findElement(By.name("Password")).sendKeys("prime15623"); // type into box
        driver.findElement(By.xpath("Password"));

        //find and click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]")); //click login button
        loginButton.click();

        //find error message and compare with expected
        String expectedError = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";

        String actualError = driver.findElement(By.xpath( "//div[@class='message-error validation-summary-errors']")).getText();

        Assert.assertEquals("Error Message not Displayed",expectedError, actualError); // verify actual text is same as expected text

    }








    @After
    public void tearDown(){
        closeBrowser();
    }








}
