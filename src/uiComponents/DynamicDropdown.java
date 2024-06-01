package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		
		driver.findElement(By.xpath("//*[contains(@class,'-selection--multiple')]")).sendKeys("new");
		
		
		List<WebElement> states= driver.findElements(By.xpath("//*[contains(@class,'-results__option--')]"));
		
		for(WebElement state:states) {
			if(state.getText().equalsIgnoreCase("New York")) {
				state.click();
				// we are using this break such that that state element reference exception error won't come, and it would break after selecting an element
				break;
				
			};
		}
	}

}
