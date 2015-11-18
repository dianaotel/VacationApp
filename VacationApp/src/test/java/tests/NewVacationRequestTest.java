package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import steps.LoginSteps;
import steps.NewVacationRequestSteps;
import steps.ZimbraLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Steps 
	ZimbraLoginSteps zimbraLoginSteps;

	@Test
	public void newVacationRequest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		newVacationRequestSteps.setStartDate(20, "Feb", 2018);
		newVacationRequestSteps.setEndDate(21, "Feb", 2018);
		newVacationRequestSteps.setVacationType();
		newVacationRequestSteps.insertComment("Test Comment");
		newVacationRequestSteps.saveVacationRequest();
		newVacationRequestSteps.confirmationMessage();
		zimbraLoginSteps.goToZimbraLoginPage();
		zimbraLoginSteps.loginAsPM();
		
	}

}
