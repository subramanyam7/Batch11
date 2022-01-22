package com.magnus.day25;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeTest
	public void Demo() {
		System.out.println("This is Demo method from Before Test Annotation");
	}
	
	@Test
	public void Demo2() {
		System.out.println("This is Demo2 method");
	}
	
	@Test
	public void Demo3() {
		System.out.println("This is Demo3 method");
	}
	
	@AfterTest
	public void Demo4() {
		System.out.println("This is Demo4 method used AfterTest annotation");
	}
}
