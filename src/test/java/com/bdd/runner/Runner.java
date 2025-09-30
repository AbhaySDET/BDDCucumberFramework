package com.bdd.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/Feature",   // Path to feature files
	    glue = {"com.bdd.stepdefinitions"},  
	    plugin = {"pretty", "html:test-output/report.html"},
	    monochrome = true
	  //  ,tags = "@Login"
	)
	public class Runner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = true)   // 🚀 enables parallel execution
    public Object[][] scenarios() {
        return super.scenarios();
    }
	}
