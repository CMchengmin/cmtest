package testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HelloSelenium {
    public static WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void TestNgLearn(WebDriver driver){

        driver.get("http://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("鹿晗");
        driver.quit();
    }
    @Test
    public void TestNgLearn1(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("dddd");
        driver.quit();
    }
    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}
