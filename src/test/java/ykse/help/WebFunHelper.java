package ykse.help;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ykse.util.Log;
import ykse.util.UItree;
import ykse.util.variables;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebFunHelper {
	private static Logger logger = Log.logger;

	public static void sendKeysById(String key, String content, WebDriver driver) {
		String value = UItree.FindValueInUItree(key);
		String note = UItree.FindNoteInUItree(key);
		String contentValue = variables.FindValueInVariables(content);
		try {

			logger.info("在" + note + "的对应元素:" + value + "中输入" + content);
			driver.findElement(By.id(value)).clear();
			driver.findElement(By.id(value)).sendKeys(contentValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block

			logger.error("在" + key + "对应的" + value + "中输入失败");
			logger.error(e.getMessage());
		} finally {
			// WebFunHelper.PrintScreen(driver);
		}

	}

	public static void clickById(String key, WebDriver driver) {

		String value = UItree.FindValueInUItree(key);
		String note = UItree.FindNoteInUItree(key);
		try {
			// WebFunHelper.PrintScreen(driver);
			logger.info("点击" + note + key + "的对应元素:" + value);
			driver.findElement(By.id(value)).click();

		}

		catch (Exception e) {
			// TODO Auto-generated catch block

			// AndroidFunHelper.PrintScreen(driver);
			if (key != "button_header_back") {

				logger.warn("点击" + note + key + "对应的" + value + "失败");
			}

		} finally {
			WebFunHelper.PrintScreen(driver);
		}
	}

	public static void clickByLinkText(String key, WebDriver driver) {

		String value = UItree.FindValueInUItree(key);
		String note = UItree.FindNoteInUItree(key);
		try {
			// WebFunHelper.PrintScreen(driver);
			logger.info("点击" + note + key + "的对应元素:" + value);
			driver.findElement(By.linkText(value)).click();

		}

		catch (Exception e) {
			// TODO Auto-generated catch block

			// AndroidFunHelper.PrintScreen(driver);
			if (key != "button_header_back") {

				logger.warn("点击" + note + key + "对应的" + value + "失败");
			}

		} finally {
			WebFunHelper.PrintScreen(driver);
		}
	}
	public static void clickByXpath(String key, WebDriver driver) {

		String value = UItree.FindValueInUItree(key);
		String note = UItree.FindNoteInUItree(key);
		try {
			// WebFunHelper.PrintScreen(driver);
			logger.info("点击" + note + key + "对应的Xpath:" + value);
			driver.findElement(By.xpath(value)).click();

		}

		catch (Exception e) {
			// TODO Auto-generated catch block

			// AndroidFunHelper.PrintScreen(driver);
			if (key != "button_header_back") {

				logger.warn("点击" + note + key + "对应的Xpath" + value + "失败");
			}

		} finally {
			WebFunHelper.PrintScreen(driver);
		}
	}
	
	public static void clickClassName(String key, WebDriver driver) {

		String value = UItree.FindValueInUItree(key);
		String note = UItree.FindNoteInUItree(key);
		try {
			// WebFunHelper.PrintScreen(driver);
			logger.info("点击" + note + key + "对应的类:" + value);
			driver.findElement(By.className(value)).click();

		}

		catch (Exception e) {
			// TODO Auto-generated catch block

			// AndroidFunHelper.PrintScreen(driver);
			if (key != "button_header_back") {

				logger.warn("点击" + note + key + "对应的" + value + "失败");
			}

		} finally {
			WebFunHelper.PrintScreen(driver);
		}
	}


	public static void PrintScreen(WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String time = format.format(date);
		try {
			String fileName = "target/"+Log.log4jdir+"/output/picShot/" + time + ".jpg";
			FileUtils.copyFile(scrFile, new File(fileName));
			logger.info("截图已保存到" + fileName);

		} catch (IOException e) {
			logger.error("截图保存失败");

			e.printStackTrace();
		}
	}

}
