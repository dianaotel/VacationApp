package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.VacationHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	LoginPage loginPage;
	VacationHomePage vacationHomePage;

	@Step
	public void goToLoginPage() {
		loginPage.open();
	}

	@Step
	public void enterCredentials(String username, String password) {
		loginPage.enterCredentials(username, password);
	}

	@Step
	public void signIn() {
		loginPage.signIn();
		vacationHomePage.open();
	}

}