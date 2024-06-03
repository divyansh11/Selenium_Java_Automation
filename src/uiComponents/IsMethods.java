package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1= driver.findElement(By.xpath("//*[@type='checkbox'][1]"));
		WebElement checkbox2= driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
		
		
			System.out.println(checkbox1.isSelected());
			System.out.println(checkbox2.isSelected());
			
			System.out.println(checkbox1.isDisplayed());
			System.out.println(checkbox1.isEnabled());
			
	

	}

}
