package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo2 extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUP(){
        openBrowser(baseURL);
    }

    @Test
    public void locatorDemo2(){
       //class name locator to find multiple elements
       List<WebElement> slider = driver.findElements(By.className("nivo-imageLink"));
        System.out.println(slider.size());

        // tag name locator  to find multiple elements
        List<WebElement> tags = driver.findElements(By.tagName("a"));  // find links
        System.out.println(tags.size());  // number of links


        // from list get details like text or links
        for (WebElement text : tags){
            System.out.println(text.getText());
            System.out.println(text.getAttribute("href"));
        }

    }

    @After
    public void tearDown(){
        closeBrowser();


}
}