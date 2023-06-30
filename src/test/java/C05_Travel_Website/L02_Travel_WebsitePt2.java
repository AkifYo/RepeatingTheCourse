package C05_Travel_Website;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class L02_Travel_WebsitePt2 {
    @Test
    public void  firstexample () throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easyjet.com/en");
        Thread.sleep(4000);
        driver.findElement(By.id("ensCloseBanner")).click();
        driver.findElement(By.cssSelector("input[name='origin']")).click();
        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("Lon");

        List<WebElement> origins=driver.findElements(By.cssSelector("#ui-id-1 li>a>span"));
        for (WebElement origin:origins  ) {

            if (origin.getText().contains("Stansted")) {
                origin.click();
            }


            System.out.println(origin.getText());

        }
        driver.findElement(By.cssSelector("input[name='destination']")).click();
        driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("a");
        List<WebElement> destinations=driver.findElements(By.cssSelector("#ui-id-2 li>a>span"));
        for (WebElement destination:destinations  ) {

            if (destination.getText().contains("Antalya")) {
                destination.click();
            }


            System.out.println(destination.getText());

        }
    }
}
