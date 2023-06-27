package C03_Section3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L09isEnabled {
@Test
        public void  test() {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.automationtesting.co.uk/buttons.html");
    //driver.wait(100);

    System.out.println(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
    System.out.println(driver.findElement(By.cssSelector("button#btn_three")).isEnabled());

}
}
