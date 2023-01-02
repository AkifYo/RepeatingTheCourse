package T01_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2_Name {
    public static void main(String[] args) throws InterruptedException {
        //1. Set up the driver and file path
        System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo X270/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        // create the chrome driver object
        WebDriver driver= new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // wait until the elements located
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // navigate to "https://www.booking.com"
        driver.get("https://www.booking.com");
        // locate the searchbox element by using id en initalize it to a Webelement
        WebElement srcBx=driver.findElement(By.name("ss"));
        // get the text of the search box element
        String srcBxText=srcBx.getText();
        System.out.println(srcBxText);
        // send keys to search box to see what is gonna happen there
        srcBx.sendKeys("Istanbul");
        //Wait two seconds to have good result
        Thread.sleep(2000);
        driver.quit();
    }
}
