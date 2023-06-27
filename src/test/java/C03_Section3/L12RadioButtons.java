package C03_Section3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L12RadioButtons {
@Test
        public void  test() throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.automationtesting.co.uk/dropdown.html");

    driver.findElement(By.cssSelector("//[for='demo-priority-low']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("//[for='demo-priority-normal']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("//[for='demo-priority-high']")).click();
    Thread.sleep(2000);

    driver.switchTo().alert().accept();


}
}
