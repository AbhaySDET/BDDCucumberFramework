//package com.bdd.runner;
//
//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//	    features = "src/test/resources/Feature",   // Path to feature files
//	    glue = {"com.bdd.stepdefinitions"},  
//	    plugin = {"pretty", "html:test-output/report.html"},
//	    monochrome = true
//	  //  ,tags = "@Login"
//	)
//public class JunitRunner {
//	@Override
//    @DataProvider(parallel = true)   // 🚀 enables parallel execution
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
//}
