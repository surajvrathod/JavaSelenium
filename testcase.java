package day2;

import org.testng.annotations.Test;

/*
 
 1)open app
 
 2)login
 
 3)logout



*/
public class testcase {
	
	
	 @Test(priority=3)
	   void logout() {
		   System.out.println("Application Logged Out");
		
	}
	
	@Test(priority=1)
	void openapp() {
		System.out.println("Opening Application");
		
	}
	
	@Test(priority=2)
    void applogin() {
    	System.out.println("Application Logged in");
		
	}
   
}
