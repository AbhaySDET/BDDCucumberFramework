package com.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/Feature",   // Path to feature files
	    glue = {"com.bdd.stepdefinitions"},  
	    plugin = {"pretty", "html:test-output/report.html"},
	    monochrome = true,
	    tags = "@Login"   // AND condition
	)
	public class Runner extends AbstractTestNGCucumberTests {
	}
