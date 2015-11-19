package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ZimbraLoginPage;
import helpers.Constants;

public class ZimbraLoginSteps extends ScenarioSteps{
	
	ZimbraLoginPage zimbraLoginPage;
	
	@Step
	public void goToZimbraLoginPage() {
		zimbraLoginPage.open();
	}
	
	@Step
	public void enterCredentials(String username, String password){
		zimbraLoginPage.enterCredentials(username, password);
		zimbraLoginPage.login();
	}
	
	@Step
	public void loginAsTester(){
		enterCredentials(Constants.TESTER_EMAIL_USERNAME, Constants.TESTER_EMAIL_PASSWORD);
		zimbraLoginPage.login();
	}
	
	@Step
	public void loginAsPM(){
		enterCredentials(Constants.PM_EMAIL_USERNAME, Constants.PM_EMAIL_PASSWORD);
		zimbraLoginPage.login();
	}
	
	@Step
	public void loginAsDM(){
		enterCredentials(Constants.DM_EMAIL_USERNAME, Constants.DM_EMAIL_PASSWORD);
		zimbraLoginPage.login();
	}
	
	

}
