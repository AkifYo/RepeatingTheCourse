package C03_Section3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L10DropDownsMenu {
@Test
        public void  test() {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.automationtesting.co.uk/dropdown.html");
    //driver.wait(100);
    WebElement dropElement= driver.findElement(By.cssSelector("select#cars"));
    Select select= new Select(dropElement);

    //select.selectByVisibleText("Honda");
    select.selectByValue("jeep");
}
}
