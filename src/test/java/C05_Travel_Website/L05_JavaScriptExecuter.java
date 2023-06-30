package C05_Travel_Website;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class L05_JavaScriptExecuter {
    @Test
    public void  firstexample () throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Akif");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Yorulmaz");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("akif@test.com");
        driver.findElement(By.cssSelector("textarea")).sendKeys("this is comment ");

        WebElement submit=driver.findElement(By.cssSelector("[type='submit']"));
        WebElement resetBtn=driver.findElement(By.cssSelector("[type='reset']"));
        //submit.click();

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click()",submit);
        //js.executeScript("arguments[0].click()",submit);



    }
}
