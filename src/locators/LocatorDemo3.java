package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorDemo3 extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUP() {openBrowser(baseURL);}

    @Test
    public void locatorDemo2() {

        //xpath with or
        // tagname[@attribute='value']
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms or @name='q']"));
        searchBox.sendKeys("Mobile");

        //xpath with and
        // tagname[@attribute='value']
        WebElement searchBox2 = driver.findElement(By.xpath("//input[@id='small-searchterms and @placeholder='Search store']"));
        searchBox2.sendKeys("Mobile");

        //xpath with contains
        //tagname[contains (@attribute, 'value')]
        driver.findElement(By.xpath("//input[contains(@id, 'sear')]")).sendKeys("Mobile");

        //xpath starts with
        //  tagname [starts-with(@attribute, 'value')]
        driver.findElement(By.xpath("//input[starts-with(@id, 'small')]")).sendKeys("Mobile");

        //xpath with text - find link and click it
        // tagname [text()='value']
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        //chained xpath, 2 xpath one after another combined, and click it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

    }


    @After
    public void tearDown() {closeBrowser();}
}