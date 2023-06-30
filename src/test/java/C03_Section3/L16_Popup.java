package C03_Section3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class L16_Popup {
@Test
        public void  test() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
    driver.manage().window().maximize();

    Thread.sleep(2000);

    driver.get(" https://www.automationtesting.co.uk/accordion.html");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
    Thread.sleep(2000);

    driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
}
}
