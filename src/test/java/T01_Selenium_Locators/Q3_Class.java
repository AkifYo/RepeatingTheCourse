package T01_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3_Class {
    public static void main(String[] args) throws InterruptedException {
        //1. Set up the driver and file path
        System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo X270/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        // create the chrome driver object
        WebDriver driver= new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // wait until the elements located
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // navigate to "https://www.airbnb.com"
        driver.get("https://www.airbnb.com");
        // locate thean element by using class name en initalize it to a Webelement
        WebElement persMenu=driver.findElement(By.className("_upim4d"));
        // get the text of this  element
        System.out.println(persMenu.getText());

        // try to interact with this elemnet  to see what is ganna happen there
        //persMenu.click();
        //Wait two seconds to have good result
        Thread.sleep(3000);
        driver.quit();
    }
}
