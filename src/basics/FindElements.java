package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		// TODO Auto-generated method stub
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		WebElement loginBtn=driver.findElement(By.className("submit-button"));
		loginBtn.click();
		
		List<WebElement> addToCartBtns= driver.findElements(By.className("btn_inventory"));
		System.out.println(addToCartBtns.size());
		
		for(int i=0;i<addToCartBtns.size();i++) {
			addToCartBtns.get(i).click();
		}
		
		Thread.sleep(2000);
		
		List<WebElement> removeBtns=driver.findElements(By.className("btn_inventory"));
		
		for(int i=0;i<removeBtns.size();i++) {
			removeBtns.get(i).click();
		}
		
		
//	    for(WebElement addToCartBtn : addToCartBtns) {
//	    	addToCartBtn.click();
//	    }
	    
//	    addToCartBtns.forEach(element->{
//	    	element.click();
//	    });
	    

	}

}
