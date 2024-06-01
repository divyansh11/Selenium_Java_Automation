package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		String text0= driver.findElement(By.xpath("//*[@class='main-heading']")).getText();
		System.out.println(text0);
		
		
		String text1= driver.findElement(By.xpath("//*[@class='selc-flight-options']/li[2]/a")).getAttribute("text");
		System.out.println(text1);
	}

}
