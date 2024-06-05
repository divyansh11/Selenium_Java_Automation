package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//opens a url
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		
		driver.findElement(By.cssSelector("#save")).click();
		
		WebElement grab=driver.findElement(By.cssSelector(".card-title"));
		
		driver.findElement(By.cssSelector("#progress-bars")).click();
		
		driver.findElement(By.cssSelector("#downloadButton")).click();
		
		
		//Explicit Wait for a element
		
		WebElement waitcomplete=driver.findElement(By.cssSelector(".progress-label"));
		
		System.out.println(waitcomplete.getText());
		
		WebDriverWait waiting= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		waiting.until(ExpectedConditions.textToBePresentInElement(waitcomplete, "Complete!"));
		
		System.out.println(waitcomplete.getText());
	}

}
