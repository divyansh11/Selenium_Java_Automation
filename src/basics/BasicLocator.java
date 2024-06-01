package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
//		/** since thier were two classes so it would fail" **/
//		driver.findElement(By.className("input_error form_input")).click();
//		
		driver.findElement(By.className("bm-burger-button")).click();
//		
		Thread.sleep(2000);
//		
		driver.findElement(By.linkText("About")).click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("bm-burger-button")).click();
		Thread.sleep(1000);
//		driver.findElement(By.partialLinkText("Log")).click();
		
		
;
		
	}

}

