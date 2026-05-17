package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname,String Key)
	{
		//selenium
		System.out.println("WebloginCar");
		System.out.println(urlname);
		System.out.println(Key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void Afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After executing all methods in the class");
	}
	
	
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan()
	{
		//Appium
		System.out.println("MobileloginCar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobileSigninCarLoan()
	{
		//Appium
		System.out.println("Mobile Signin");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignoutCarLoan(String username,String password)
	{
		//Appium
		System.out.println("Mobilesignout");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void LoginApiCarLoan()
	{
		//Rest API automation
		System.out.println("ApiloginCar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password- good credit history
		//2nd - username password - no credit history
		//3rd - fraudlent credit history
		
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		//coulomns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}

}
