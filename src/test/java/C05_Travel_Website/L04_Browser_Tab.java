package C05_Travel_Website;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class L04_Browser_Tab {
    @Test
    public void  firstexample () throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/browserTabs.html");
        Thread.sleep(2000);
        //driver.findElement(By.id("ensCloseBanner")).click();
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.cssSelector("form[target='_blank'] > input[value='Open Tab']")).click();
        }


        ArrayList<String> handlesTab= new ArrayList<>(driver.getWindowHandles());

        System.out.println("There are "+ handlesTab.size()+" tabs open");

        for (String each:handlesTab ) {
            Thread.sleep(1500);
            driver.switchTo().window(each);

        }
        Thread.sleep(2000);
        driver.switchTo().window(handlesTab.get(0));
    }
}
