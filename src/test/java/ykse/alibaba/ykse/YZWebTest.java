package ykse.alibaba.ykse;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ykse.help.YZWebBizHelper;
import ykse.util.Log;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class YZWebTest {
    private static Logger logger = Log.logger;
    private static WebDriver driver;
    private static String baseUrl;
    // "E:\firefox\Mozilla Firefox\firefox.exe"
    // "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"
    @BeforeClass
    @Parameters({ "brower", "Path","Url" })
    public static void setUp(String brower, String Path, String Url) throws Exception {

        System.setProperty(brower,"D:\\chromedriver\\chromedriver.exe");
		System.setProperty(brower, Path);
		logger.info(brower+Path);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseUrl = Url;
        /*
        System.setProperty(brower, "D:\\chromedriver\\chromedriver.exe");
        System.setProperty(brower, Path);
        DesiredCapabilities dc = DesiredCapabilities.chrome(); // 设置需要驱动的浏览器，其他的浏览器都是以此类推
        driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseUrl = Url;
        */
    }
    @AfterClass
    public static void tearDown() throws Exception {
        // driver.close();
    }
    @Test
    public void TC_login1() throws InterruptedException{
        driver.get("http://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("dddd");
    }
}
