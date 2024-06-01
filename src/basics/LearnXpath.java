package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("divyanshsankhla2000@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Demo1!");
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("(//div[@class='buttons']//input[@class='button-1 login-button']")).click();
//		driver.findElement(By.xpath("(//div[@class='buttons']//input[@class='login-button']")).click();
		driver.findElement(By.xpath("//*[@class='buttons']//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[4]/a")).click();
		
		
//		#Homework 1
		
		List<WebElement> title= driver.findElements(By.xpath("//*[@class='product-grid']//*[@class='product-title']//a[1]"));
//		System.out.println(title.size());
		
		for(int i=0;i<title.size();i++) {
			System.out.println(title.get(i).getText());
		}
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Blue Jean')]")).click();
//		WebElement qtyBox=driver.findElement(By.xpath("//*[contains(@id,'addtocart_36_EnteredQuantity')]"));
//		
//		Thread.sleep(1000);
//		qtyBox.clear();
//		qtyBox.sendKeys("28");
//		
//		driver.findElement(By.xpath("//*[@id='add-to-cart-button-36']")).click();
//		
//		driver.findElement(By.xpath("//*[@id='topcartlink']")).click();
//
//		WebElement dropDown=driver.findElement(By.xpath("//*[@class='country-input']"));
//		
//		Thread.sleep(1000);
//		
//		Select dropdown=new Select(dropDown);
//		dropdown.selectByVisibleText("India");
//		
//		
//		driver.findElement(By.xpath("//*[@id='ZipPostalCode']")).sendKeys("312001");
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//*[@id='termsofservice']")).click();
//		
//		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		
		

	}

}
