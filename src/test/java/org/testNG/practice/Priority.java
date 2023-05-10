package org.testNG.practice;

import org.testng.annotations.Test;

public class Priority 
{
    @Test(priority =-1)
	public void login() 
    {
		System.out.println("login"); 
	}
    @Test(priority =2)
   	public void password() 
       {
    	System.out.println("password"); 
       }
	@Test(priority =0)
	public void enterHomepage()
	{
		System.out.println("enterHomepage"); 	
	}
		
		
	

	}


