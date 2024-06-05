package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		
		driver.findElement(By.cssSelector(".ico-login")).click();
		
		driver.findElement(By.cssSelector("#Email")).sendKeys("divyanshsankhla2000@gmail.com");
		
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Demo1!");
		
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
		driver.findElement(By.cssSelector(".list li:nth-child(4) a")).click();
		
		driver.findElement(By.cssSelector("[class*='ui-autocomplete-input']")).sendKeys("divyansh");

	}

}
