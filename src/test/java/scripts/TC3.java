package scripts;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 
{
	
	@BeforeMethod
	public void m1(Method m)
	{
		String mn = m.getName();
		System.out.println("The next method is:"+mn);
	}
	
	@AfterMethod
	public void m2(ITestResult r)
	{
		int s = r.getStatus();
		if(s==1)
		{
			System.out.println("Hi this is PASS");
		}
		else
		{
			System.out.println("Hi this is Fail");
		}
	}
	@Test
	public void testLogin1()
	{
		System.out.println("test login....");
	}
	
	@Test
	public void testlogout2()
	{
		System.out.println("test logout");
		
	}
	
	
}
