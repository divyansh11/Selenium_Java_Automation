package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//opens a url
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement textBox= driver.findElement(By.id("single-input-field"));
		WebElement btn = driver.findElement(By.id("button-one"));
		
		js.executeScript("arguments[0].value='Divyansh here';", textBox);
		js.executeScript("arguments[0].click();", btn);
		
		
//		WebElement valuea=driver.findElement(By.id("value-a"));
//		WebElement valueb=driver.findElement(By.id("value-b"));
//		WebElement btn2 = driver.findElement(By.id("button-two"));
//		
//		
//		js.executeScript("arguments[0].value='4';", valuea);
//		js.executeScript("arguments[0].value='8';", valueb);
//		js.executeScript("arguments[0].click();", btn2);
		
		driver.navigate().to("https://www.noon.com/uae-en/");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0, 4000);");
		
		WebElement desiredElement =driver.findElement(By.xpath("//*[contains(text(),'Recommended for you')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
		
		
		
//		#Homework 2- Coming at the Botton directly
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	

}
