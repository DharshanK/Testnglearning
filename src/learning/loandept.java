package learning;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loandept {
	
	@Test
	public void carloan(){
		System.out.println("carloan department");
	}

	@Test
	public void homeloan(){
		System.out.println("homeloan department");
	}
	
	@Test
	public void personalloan(){
		System.out.println("personalloan department");
	}
		@BeforeTest
		public void commonloan(){
			System.out.println("common loan loan department first");
		
	}
		@AfterTest
		public void finalloan(){
			System.out.println("final loan confirmation lat");
		}
		}
