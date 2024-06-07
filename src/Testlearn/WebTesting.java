package Testlearn;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {
	
	@BeforeMethod
	public void beforetestmethod(){
		System.out.println("xxxxxxx");
		}

	
	@Test
	public void SirstWebtest(){
		System.out.println("sankhla ivyansh");
		}

	@Test(priority=0)
	public void FirstWebtest(){
		System.out.println("divyansh");
		}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("hello");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("doodod");
	}

}
