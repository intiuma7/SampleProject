package bnkproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class bnktesting {
	
	App ap=new App();
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, ap.userLogin("abc", "abc@123"));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(0, ap.userLogin("abc", "abc123"));
	}
}
