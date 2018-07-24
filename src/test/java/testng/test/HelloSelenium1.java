package testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HelloSelenium1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }
    @Test
    public void TestNgLearn(){
        System.setProperty("webdriver.firefox.bin","D:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("鹿晗");
        driver.quit();
    }
    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}
