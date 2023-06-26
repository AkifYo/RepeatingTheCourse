package C01_Udemy_Selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
    @Test
            public void  firstexample (){
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/");
}
}
