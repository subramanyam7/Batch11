package com.magnus.day27;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	LocalDateTime now = LocalDateTime.now();
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Execution start date and time: " + dtf.format(now));
	}
	@BeforeTest
	public void req2() {
		System.out.println("This is before test annotation");
	}
	@BeforeMethod
	public void req1(){
		System.out.println("This is Before Method annotation");
	}
	@Test
	public void display1() {
		System.out.println("This is display1 method");
	}
	@Test
	public void display2() {
		System.out.println("This is display2 method");
	}
	@AfterMethod
	public void dismiss1() {
		System.out.println("This is after method");
	}
	@AfterTest
	public void dismiss2() {
		System.out.println("This is After Test");
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("Execution start date and time: " + dtf.format(now));
	}
}
