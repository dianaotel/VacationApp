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
	public void enterCredentials(String username, String password) {
		loginPage.enterCredentials(username, password);
	}
	
	@Step
	public void loginAsTester(){
		enterCredentials(Constants.TESTER_USERNAME, Constants.TESTER_PASSWORD);
	}
	
	@Step
	public void loginAsPM(){
		enterCredentials(Constants.PM_USERNAME, Constants.PM_PASSWORD);
	}
	
	@Step
	public void loginAsDM(){
		enterCredentials(Constants.DM_USERNAME, Constants.DM_PASSWORD);
	}
	
	@Step
	public void signIn() {
		loginPage.signIn();
		vacationHomePage.open();
	}

}