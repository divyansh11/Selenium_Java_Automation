package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnHardAssertions {
	
	
	@Test
	public void verifyhardAssert() {
		
		String actualName="Prashant";
		String expectedName="Prashan";
		
		System.out.println("we are here");
		
		Assert.assertEquals(actualName, expectedName);
		
		System.out.println("hello world");
		
		Assert.assertTrue(true);
	}

}
