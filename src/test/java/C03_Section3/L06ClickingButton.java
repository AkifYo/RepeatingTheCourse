package C03_Section3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class L06ClickingButton {
@Test
        public void  test() {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.automationtesting.co.uk/buttons.html");
    //driver.wait(100);
    driver.findElement(By.xpath("//button[@id='button_one']")).click();
}
}
