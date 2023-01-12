package T01_Selenium_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4_Tagname {
    @Test
    public void test01(){
        // we are ganna find a page that we can locate it with tag name
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://ing.nl");
    }
}
