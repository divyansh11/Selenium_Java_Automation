package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingAssertions {
	
	@Test
	public void assettions() {
		String expectedstring="Fiction";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		
		String stringmain= driver.findElement(By.cssSelector(".product-name")).getText();
		
		Assert.assertEquals(stringmain,expectedstring);
		System.out.println("pass");
	}

}
