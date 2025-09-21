package com.bdd.stepdefinitions;

import com.bdd.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep   {
	LoginPage lp= new LoginPage();

	@Given("the user is on the CRM login page")
	public void the_user_is_on_the_crm_login_page() {
	   lp.verifyUserIsONCRMLogINPage();
	}

	@When("the user enters valid username {string} and password {string}")
	public void the_user_enters_valid_username_and_password(String string, String string2) {
   lp.userEnterCredential();
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		lp.clickLoginBtn(); 
	}

	@Then("the user should be redirected to the CRM dashboard")
	public void the_user_should_be_redirected_to_the_crm_dashboard() {
		lp.verifyUserOnHomePage();
	}

	@Then("the page title should be {string}")
	public void the_page_title_should_be(String string) {
		lp.verifyHomePageTitle();
	}
	
	@Then("logout from CRM App")
	public void logoutfromCRMApp() {
		System.out.println("6");
	}


}
