package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String urlname)
	{
		//selenium
		System.out.println("WebloginHome");
		System.out.println(urlname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginApiHomeLoan()
	{
		//Rest API automation
		System.out.println("ApiloginHome");
	}

}
