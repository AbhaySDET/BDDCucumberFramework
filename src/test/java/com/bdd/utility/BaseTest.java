package com.bdd.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	public static WebDriver driver;
	
	public void setup(){
		System.out.println("statrted---------------------------");
		driver= new EdgeDriver();
		driver.get(Utility.readConfig("URL"));
		driver.manage().window().maximize();
		
	}
	
	public void endTest() {
		driver.quit();
	}
	
	

}
