package learning;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestNGbasics {

	
		// TODO Auto-generated method stub
	
	@BeforeMethod()
	public void beforemethod()
	{
		
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is a before test Method");
	}
	
	@AfterTest(alwaysRun=true)
	public void aftertest()
	{
		System.out.println("This is a After test Method");
	}
	
	@Test(groups= {"sanity"})
		public void demo1 () {
		System.out.println("This is a demo1");
	    }

	@Parameters("Browser")

	@Test(groups= "sanity")
	public void demo2 (String Browser) {
		SoftAssert st = new SoftAssert();

	System.out.println("This is a demo2");
	assertTrue(false);
	if(Browser.equals("Chrome"))
	{
		System.out.println("Initiate Chrome Browser" +Browser);
	}
	}
	
	@Test(dependsOnMethods="demo2")
	public void demo3 () {
	System.out.println("This is a demo3");
}
	@BeforeMethod
	public void tbeforemethod()
	{
		System.out.println("This is a before Method");
	}

}
