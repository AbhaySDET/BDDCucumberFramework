package com.bdd.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	
	public static	ThreadLocal<WebDriver> driverSet= new ThreadLocal<WebDriver>();
	//public static WebDriver driver;
	
	public void setup(){
		System.out.println("test statrted---------------------------");
//		driver= new EdgeDriver();
//		driver.get(Utility.readConfig("URL"));
//		driver.manage().window().maximize();
		
		driverSet.set(new EdgeDriver());
		driverSet.get().get(Utility.readConfig("URL"));
		driverSet.get().manage().window().maximize();
		
	}
	
	public void endTest() {
		if(Utility.readConfig("Multi_Session").equalsIgnoreCase("true")) {
		System.out.println("driver Session Still Open");
		System.out.println("test ended---------------------------");
		}else {
		System.out.println("driver session is closed");
		driverSet.get().quit();
		System.out.println("test ended---------------------------");
		}
	}
	
	

}
