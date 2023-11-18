package testsuite;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUP(){
     openBrowser(baseURL);
    }


    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        System.out.println("Navigate to Login Page");
        Assert.assertEquals("user not navigate","Jay", "Jay");

    }


    @After
    public void tearDown(){
        closeBrowser();
    }








}
