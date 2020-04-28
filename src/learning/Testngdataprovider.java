package learning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngdataprovider {

	@Test(dataProvider= "getname")
	public void login(String username ,String password)
	{
		System.out.println(username+ "----->"+password);
			
	}

	@DataProvider
	public Object[][] getname()
	{
		Object [][]obj =new Object[2][2];
		obj[0][0]= "Test@gmail.com";
		obj[0][1]= "Test123";
		
		obj[1][0]= "Test23@gmail.com";
		obj[1][1]= "Test123";
	
		
		
		return obj;
		
		
		
	}
	
}
