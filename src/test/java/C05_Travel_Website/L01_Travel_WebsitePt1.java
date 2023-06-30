package C05_Travel_Website;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class L01_Travel_WebsitePt1 {
    @Test
    public void  firstexample () throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easyjet.com/en");
        Thread.sleep(4000);
        driver.findElement(By.id("ensCloseBanner")).click();
        driver.findElement(By.cssSelector("input[name='origin']")).click();
        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");

        List<WebElement> origins=driver.findElements(By.cssSelector("#ui-id-1 li>a>span"));
        for (WebElement origin:origins  ) {

            if (origin.getText().contains("Stansted")) {
                origin.click();
            }


            System.out.println(origin.getText());

        }
    }
}
