package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginTest {

    public static void main(String[] args) {
        String baseURL = "https://demo.nopcommerce.com/"; //store url
        WebDriver driver = new FirefoxDriver(); // to launch chrome or change to firefox
        driver.get(baseURL); // launch url from stored
        driver.manage().window().maximize(); // maximise the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //give implicit wait to driver

        // find login link text element and click on it
        WebElement loginLink = driver.findElement(By.linkText("Log in")); // hover to login button
        loginLink.click(); // click on login link

        //find email field and enter email by ID

        WebElement email = driver.findElement(By.id("Email"));
        // type into box, action
        email.sendKeys("avi@patel.com");

        WebElement password = driver.findElement(By.id("Password"));
        // type into box, action
        password.sendKeys("Halllo123");
    }
}