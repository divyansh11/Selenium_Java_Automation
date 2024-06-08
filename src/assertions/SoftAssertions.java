package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	
	@Test
	public void verifyhardAssert() {
		
		SoftAssert softassert=new SoftAssert();
		
		String actualName="Prashant";
		String expectedName="Prashan";
		
		System.out.println("we are here");
		
		softassert.assertEquals(actualName, expectedName);
		
		System.out.println("hello world");
		
		softassert.assertTrue(true);
		
		softassert.assertAll();
	}

}
