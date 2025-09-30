package com.bdd.stepdefinitions;

import com.bdd.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {
	HomePage hp= new HomePage();
	@When("click on home page menu")
	public void click_on_home_page_menu() {
	   hp.clickOnHomePageMenu();
	}

	@Then("user Redirected to HomePage Url")
	public void user_redirected_to_home_page_url() {
	    hp.verifyUserRedirectedToHpmePage();
	}

	@Then("verify Home Page available Options")
	public void verify_home_page_available_options() {
	   hp.verifyHomePageOptions();
	}


}
