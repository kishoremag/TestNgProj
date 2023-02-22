package org.testNG.practice;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass1 
{
	
     @org.testng.annotations.BeforeClass
     public void launchbrowser()
     {
    	 System.out.println("launch site");
     }
     
     @BeforeMethod
     public void launchlogin()
     {
    	 System.out.println("login");
     }
     
	
		@Test(priority =1)
		public void testMethod2() 
		{
			System.out.println("Testclass2 >> testMethod2 >> " +Thread.currentThread().getId());
		}
		
		@Test(priority =1)
		public void testMethod3() {
			System.out.println("Testclass3 >> testMethod3 >> " +Thread.currentThread().getId());
		}
		
		@AfterMethod
	     public void composeemail()
	     {
	    	 System.out.println("compose");
	     }
		
		@BeforeMethod
	     public void logout()
	     {
	    	 System.out.println("launch site");
	     }
		
	}

	

