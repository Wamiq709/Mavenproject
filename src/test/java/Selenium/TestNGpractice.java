package Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGpractice {
	
	@BeforeTest   //run before all @test methods execution
	public void loginfromapplication() {
		System.out.println("login to application");
	}
	
	@AfterTest   //run after all @test methods execution
	public void logoutfromapplication() {
		System.out.println("logout to application");
	}
	@BeforeMethod  //run before each @test method execution
	public void connectToDB() {
		System.out.println("connected to DB");
	}
	@AfterMethod   //run after each @test method execution 
	public void disconnectFromDB() {
		System.out.println("disconnected from DB");
	}
	
	
	@Test(priority=1,description = "this is login ")
	public void login() {
		
		System.out.println("login successful");
	}
	@Test(priority=2)
	public void logout() {
		
		System.out.println("logout successful");
	}
	
	
}
