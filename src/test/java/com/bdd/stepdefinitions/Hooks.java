package com.bdd.stepdefinitions;

import com.bdd.utility.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	BaseTest bt= new BaseTest();
	@Before
	public void setup(){
		bt.setup();
		
	}
	@After
	public void endTest() {
		bt.endTest();
	}

}
