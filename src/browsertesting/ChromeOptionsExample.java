package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeOptionsExample {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito").addArguments("--disable-notifications");  // opens browser in private window
       options.addArguments("--headless=new"); // run in headless mode

        WebDriver driver = new ChromeDriver(options); // to launch chrome or change to firefox

        String baseURL = "https://justdial.com/"; //store url
        driver.get(baseURL); // launch url from stored
        driver.manage().window().maximize(); // maximise the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //give implicit wait to driver

        System.out.println(driver.getTitle()); // print tile
        System.out.println(driver.getCurrentUrl()); // get current url

       driver.quit();


    }




}
