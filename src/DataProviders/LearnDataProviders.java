package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {
	
	@Test(dataProvider="getData")
	public void mytest(String name, String pass) {
		System.out.println("Heelo Owrld");
		
		System.out.println(name+""+pass);
	}
	
	@DataProvider
	public String[][] getData() {
		
		String [] [] data= new String [2][2];
		data[0][0]="divyansh";
		data[0][1]="24";
		
		data[1][0]="sanjeev";
		data[1][1]="45";
		
		return data;
	}

}
