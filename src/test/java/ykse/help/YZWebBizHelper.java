package ykse.help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YZWebBizHelper {
    public static int sleepBase = 1;
    public static void start_and_login1(WebDriver driver) throws Exception{
    String baseUrl = "https://lark.yuekeyun.com/";
    driver.get(baseUrl);
        WebFunHelper.sendKeysById("text_login_loginId1", "loginId1", driver);
        WebFunHelper.sendKeysById("text_login_password1", "passWord1", driver);
        driver.findElement(By.id("login")).click();
    }
    public static void baidutest(WebDriver driver){
        driver.get("http://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("鹿晗");
    }
}
