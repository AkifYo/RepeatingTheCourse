package C03_Section3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L13_Assertion_1 {
@Test
        public void  test() throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.automationtesting.co.uk/");

    String pageTitle= driver.getTitle();
    Assert.assertEquals("Homepage",pageTitle);


}
}
