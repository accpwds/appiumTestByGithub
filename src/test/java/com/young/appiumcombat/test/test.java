package com.young.appiumcombat.test;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
	
	public AndroidDriver<WebElement> driver;
	
	@Test
	public void addContact() {

		// 打开百度首页
		driver.get("https://www.baidu.com");
		// 输入框元素
		WebElement inputBox = driver.findElement(By.id("index-kw"));
		// 输入JAVA关键字
		inputBox.sendKeys("JAVA");
		// 百度一下按钮
		WebElement searchButton = driver.findElement(By.id("index-bn"));
		// 点击百度一下按钮
		searchButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@BeforeClass
	public void startTest() throws MalformedURLException {
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("browserName", "Chrome");
		driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
	}

}
