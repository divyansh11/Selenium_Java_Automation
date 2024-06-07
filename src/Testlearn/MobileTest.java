package Testlearn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileTest {
	
	@Test
	public void firstMobileTest(){
		System.out.println("I am in first Mobile Test");
		}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("I am in before class");
		}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("I am in before Test");
		}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("I am in before suite");
		}
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("I am in after class");
		}


}
