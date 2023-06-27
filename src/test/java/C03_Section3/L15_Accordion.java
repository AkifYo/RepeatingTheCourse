package C03_Section3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class L15_Accordion {
@Test
        public void  test() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    Actions actions= new Actions(driver);
    driver.manage().window().maximize();
    driver.get("https://www.automationtesting.co.uk/popups.html");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
    String mainWindow= driver.getWindowHandle();
    Set<String> handles= driver.getWindowHandles();
    Thread.sleep(2000);
    Iterator<String> iterate= handles.iterator();
    while (iterate.hasNext()){
        String child= iterate.next();
        if (!mainWindow.equalsIgnoreCase(child)){
            Thread.sleep(2000);
            driver.switchTo().window(child);
            driver.close();
        }
    }

}
}
