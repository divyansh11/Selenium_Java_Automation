package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//opens a url
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		
		Alert alert=driver.switchTo().alert()	;
		Thread.sleep(1000);
		alert.accept();	
		
		driver.findElement(By.xpath(" //*[@class='btn btn-warning']")).click();
		Thread.sleep(1000);
		alert.dismiss();
		
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		alert.sendKeys("divyansh");
		alert.accept();
		
	}

}
