package steps;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;
import pages.VacationHomePage;

public class LoginSteps extends ScenarioSteps {

	LoginPage loginPage;
	VacationHomePage vacationHomePage;

	@Step
	public void goToLoginPage() {
		loginPage.open();
	}

	@Step
	public void enterEvoportalLoginCredentials(String username, String password) {
		loginPage.enterEvoportalLoginCredentials(username, password);
	}

	@Step
	public void loginAsTester() {
		enterEvoportalLoginCredentials(Constants.TESTER_USERNAME, Constants.TESTER_PASSWORD);
	}

	@Step
	public void loginAsPM() {
		enterEvoportalLoginCredentials(Constants.PM_EVO_PORTAL_USERNAME, Constants.PM_EVO_PORTAL_PASSWORD);
	}

	@Step
	public void loginAsDM() {
		enterEvoportalLoginCredentials(Constants.DM_USERNAME, Constants.DM_PASSWORD);
	}

	@Step
	public void signIn() {
		loginPage.signIn();
		vacationHomePage.open();
	}

	@Step
	public void checkIfItLogsIn() {
		loginPage.checkIfItLogsIn();
	}

}