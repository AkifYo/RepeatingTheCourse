package C02_Locating;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03LocatingByLinkText {
    @Test
            public void  firstexample () throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/");
        //driver.wait(100);
        driver.findElement(By.linkText("ACTIONS")).click();
        Thread.sleep(500);
        //driver.findElement(By.name("last_name")).sendKeys("Yorulmaz");
        Thread.sleep(1000);
}
}
