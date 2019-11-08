package org.india.Testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
	
	@BeforeClass
	private void LanchBrowser() {
		System.out.println("Browser");

	}
	@BeforeMethod
	private void StartTime() {

		System.out.println("Before");
	}

	@AfterMethod
	private void endTime() {
		System.out.println("after");

	}

	@Test
	private void Tc1() {
		System.out.println("Test1");

	}
	
	

	@AfterClass
	private void QuiteBrowser() {

		System.out.println("QuitBrowser");
		System.out.println("Git checkup");
		
		
		
		
	}

}
