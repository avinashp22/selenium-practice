package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LocatorDemo1 {

    public static void main(String[] args) {
        String baseURL = "https://demo.nopcommerce.com/"; //store url
        WebDriver driver = new FirefoxDriver(); // to launch chrome or change to firefox
        driver.get(baseURL); // launch url from stored
        driver.manage().window().maximize(); // maximise the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //give implicit wait to driver

        //find element , id and name
        WebElement searchID = driver.findElement(By.id("small-searchterms"));
        // type into box, action
        searchID.sendKeys("mobile");

        //by name
       // WebElement searchName = driver.findElement(By.name("q")).sendKeys("mobile");




    }


}
