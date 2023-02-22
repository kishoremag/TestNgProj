package org.testNG.practice;

import org.testng.annotations.Test;

public class TestClass2 
{
	@Test(priority =0)
	public void testMethod1() {
		System.out.println("TestClass2 >> testMethod4 >> " +Thread.currentThread().getId());
	}
	
	@Test(priority =0)
	public void testMethod2() {
		System.out.println("TestClass2 >> testMethod6 >> " +Thread.currentThread().getId());
	}
	
	@Test(priority =0)
	public void testMethod3() {
		System.out.println("TestClass2 >> testMethod7 >> " +Thread.currentThread().getId());
	}
	
}

