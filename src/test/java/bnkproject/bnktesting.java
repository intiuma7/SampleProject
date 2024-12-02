package bnkproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class bnktesting {
	
	
	
	@Test
	public void test1()
	{
		App ap=new App();
		Assert.assertEquals(1, ap.userLogin("abc", "abc@123"));
	}
	@Test
	public void test2()
	{
		App ap=new App();
		Assert.assertEquals(0, ap.userLogin("abc", "abc123"));
	}
}
