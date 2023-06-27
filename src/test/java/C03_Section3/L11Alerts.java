package C03_Section3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L11Alerts {
@Test
        public void  test() throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.automationtesting.co.uk/popups.html");

    driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
    Thread.sleep(2000);

    driver.switchTo().alert().accept();


}
}
