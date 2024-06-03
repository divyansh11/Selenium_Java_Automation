package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://selenium.qabible.in/table-pagination.php");
		Actions act=new Actions(driver);
//		WebElement others= driver.findElement(By.xpath("//*[@id='others']"));
//		
//		act.moveToElement(others).perform();
	
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.xpath("//*[@id='single-input-field']"));
		act.moveToElement(message).click().sendKeys("divyansh").perform();
		
		WebElement btn=driver.findElement(By.xpath("//*[@id='button-one']"));
		act.doubleClick(btn).perform(); // for double click
		act.contextClick(btn).perform();  // for right click
		
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/droppable");
//		Actions act=new Actions(driver);
//		
//		WebElement draggable=driver.findElement(By.xpath("//*[@id='draggable']"));
//		WebElement droppable=driver.findElement(By.xpath("//*[@id='droppable']"));
//		act.dragAndDrop(draggable, droppable).perform();
		
		
		
	}

}
