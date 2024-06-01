package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleBrowser {
	
	public static void main(String[] args) {
		
		String browserName="Chrome";
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("msedge")) {
			driver= new EdgeDriver();
		}
		else {
			driver.manage().window().maximize();
			System.out.println("hi divyansh here");
		}
	}

}
