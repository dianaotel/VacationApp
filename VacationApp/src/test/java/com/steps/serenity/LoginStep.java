package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.VacationHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginStep extends ScenarioSteps {

	LoginPage loginPage;
	VacationHomePage vacationHomePage;

	@Step
	public void goToLoginPage() {
		loginPage.open();
	}

	@Step
	public void enterUsername(String username) {
		loginPage.enterUsername(username);
	}

	@Step
	public void enterPassword(String password) {
		loginPage.enterPassword(password);
	}

	@Step
	public void signIn() {
		loginPage.signIn();
	}

	@Step
	public void goToVacationHomePage() {
		vacationHomePage.open();
	}

}