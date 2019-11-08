package org.india.Testng1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingAuto {
	
	static WebDriver driver;

	@BeforeClass
	private void launch() {
		System.setProperty("webdriver.chrome.driver", "");
	}

	@BeforeMethod
	private void bm() {
		System.out.println("before");
	}

	@Test
	public void t1() {
		System.out.println("t1");
	}

	@AfterMethod
	private void am() {
		System.out.println("after");
	}

	@AfterClass
	private void closeBrowser() {
		System.out.println("close");
	}
}
