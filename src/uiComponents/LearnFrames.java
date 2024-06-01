package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement desiredElement=driver.findElement(By.xpath("//*[@class='totalAmount']"));
		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
		
		String id="courses-iframe";
		driver.switchTo().frame(id);
		
		
//		scroll(desiredElement);
		
		String ul= driver.findElement(By.xpath("//*[@class='clearfix']/li")).getText();
		System.out.println(ul);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id='openwindow']")).click();

	}
	
//	public static void scroll(WebElement desiredElement) {
//		JavascriptExecutor js = (JavascriptExecutor )driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
//	}
	
//	public static void  switchFrame(String id) {
//		driver.switchTo().frame(id);
//	}

}
