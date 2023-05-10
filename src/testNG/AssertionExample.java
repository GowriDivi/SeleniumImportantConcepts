package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	String name="Gowri";
	boolean value=true;
	
	
	@Test
	public void checkEqual()
	{
		Assert.assertTrue(value, "This should not be True...");
	}
}
