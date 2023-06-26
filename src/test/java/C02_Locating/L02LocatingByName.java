package C02_Locating;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02LocatingByName {
    @Test
            public void  firstexample () throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        //driver.wait(100);
        driver.findElement(By.name("first_name")).sendKeys("Akif");
        Thread.sleep(500);
        driver.findElement(By.name("last_name")).sendKeys("Yorulmaz");
        Thread.sleep(1000);
}
}
