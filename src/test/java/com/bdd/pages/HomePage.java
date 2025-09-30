package com.bdd.pages;

import com.bdd.utility.BaseTest;

public class HomePage extends BaseTest{

	public void clickOnHomePageMenu()  {
		System.out.println("homepage menu");
		try {
		Thread.sleep(5000);
		}catch(Exception e) {
			
		}
		
	}

	public void verifyUserRedirectedToHpmePage() {
		System.out.println(" redirected");
		
	}

	public void verifyHomePageOptions() {
		
		System.out.println(" verify Options");
	}

}
