package C03_Section3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class L17_HiddenElement {
@Test
        public void  test() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    Thread.sleep(2000);
         driver.get("https://www.automationtesting.co.uk/hiddenElements.html");
    System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(2)")).isDisplayed());
    System.out.println( driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isDisplayed());


}
}
