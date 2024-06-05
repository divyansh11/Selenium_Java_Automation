package uiComponents;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LearnScreenshot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		
		File srcfile= scrShot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshot//screenshot"+getdatetime()+".png");
		
//		FileUtils.moveFile(srcfile, dest);
		
		Files.copy(srcfile, dest);
		
		
		// To directly write the directory, use System.getProperty("user.dir")
		
//		Files.copy(srcfile, new File("C:\\Users\\divya\\git\\repository2\\trial\\"+ getdatetime() +"sample.jpg"));
//		getdatetime();
		
	}
	
	public static String getdatetime() {
		Calendar cal=Calendar.getInstance();
		
		java.util.Date time=cal.getTime();
		
		String timestamp=time.toString().replace(":","").replace(" ", "");
		
		return(timestamp);
	}

}
