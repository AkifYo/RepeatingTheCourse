package C03_Section3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07SendingData {
@Test
        public void  test() {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    //driver.get("https://www.automationtesting.co.uk/buttons.html");
    //driver.wait(100);

    //input[name='first_name']
    //input[name='lasst_name']
    //input[name='email']
    // text area['message']
    driver.get("https://www.automationtesting.co.uk/contactForm.html");
    //driver.wait(100);
    driver.findElement(By.name("first_name")).sendKeys("Akif");
    //Thread.sleep(500);
    driver.findElement(By.name("last_name")).sendKeys("Yorulmaz");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ne habe");
   // Thread.sleep(1000);

}
}
