package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowerTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); // to launch chrome or change to firefox
        driver.get("https://demo.nopcommerce.com/"); // launch url
        //or
        String baseURL = "https://demo.nopcommerce.com/"; //store url
        driver.get(baseURL); // launch url from stored
        driver.manage().window().maximize(); // maximise the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //give implicit wait to driver


        String title = driver.getTitle();  // get the title of web page
        System.out.println(driver.getTitle()); // print tile
        System.out.println("Current URL: " + driver.getCurrentUrl()); // get current url
        System.out.println("Page Source: " + driver.getPageSource()); // get page source mehtod

        String loginURL = "https://demo.nopcommerce.com/login?returnUrl=%2F"; // store url
        driver.navigate().to(loginURL); // tell driver to navigate to this url
        System.out.println("Current URL: " + driver.getCurrentUrl()); // get current url
        driver.manage().window().maximize(); // maximise the window
       driver.navigate().back(); // go back a page
        driver.navigate().forward();// go forward a page
       driver.navigate().refresh(); // refresh url
        driver.quit(); // close browser

    }
}
