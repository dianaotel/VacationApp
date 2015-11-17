package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import steps.LoginSteps;
import steps.NewVacationRequestSteps;

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

	@Test
	public void newVacationRequest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		newVacationRequestSteps.setStartDate(18, "Nov", 2015);
		newVacationRequestSteps.setEndDate(19, "Nov", 2015);
		newVacationRequestSteps.setVacationType();
		newVacationRequestSteps.saveVacationRequest();
	}

}
