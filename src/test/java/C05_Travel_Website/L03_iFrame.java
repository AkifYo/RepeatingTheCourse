package C05_Travel_Website;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class L03_iFrame {
    @Test
    public void  firstexample () throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/iframes.html");
        Thread.sleep(2000);
        //driver.findElement(By.id("ensCloseBanner")).click();

        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".toogle")).click();


        driver.switchTo().parentFrame();

        driver.findElement(By.cssSelector(".toogle")).click();

        // after the
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("[aria-label='Play']")).click();


    }
}
