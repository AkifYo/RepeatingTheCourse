package C03_Section3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L14_Assertion_2 {
@Test
        public void  test() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    Actions actions= new Actions(driver);
    driver.manage().window().maximize();

    driver.get("https://www.automationtesting.co.uk/");
    Thread.sleep(2000);
    actions.scrollByAmount(0,1000).perform();

    Thread.sleep(2000);
   driver.findElement(By.linkText("TEST STORE")).click();
   driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
   driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
    Thread.sleep(2000);
    WebElement prodcut=driver.findElement(By.cssSelector(".product-total .value"));
    Thread.sleep(2000);
    System.out.println(prodcut.getText());
    Assert.assertEquals("$26.12",prodcut.getText());
}
}
