package C01_Udemy_Selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {
    @Test
            public void  firstExample (){
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/");
}
}
