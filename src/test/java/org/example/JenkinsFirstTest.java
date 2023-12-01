package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsFirstTest {
    WebDriver driver = new ChromeDriver();
    @Test
    public void testEasy(){
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
        driver.quit();
    }
}
