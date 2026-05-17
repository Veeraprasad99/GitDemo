package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		System.out.println("I will execute lasttttttt");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am the no 1 from last");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}

}
