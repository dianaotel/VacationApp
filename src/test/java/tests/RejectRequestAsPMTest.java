package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.ApproveAndRejectVacationRequestSteps;
import steps.LoginSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RejectRequestAsPMTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public ApproveAndRejectVacationRequestSteps approveAndRejectRequestSteps;

	@Test
	public void rejectVacationRequestAsPM() {
		loginSteps.goToLoginPage();
		loginSteps.loginAsPM();
		loginSteps.signIn();
		approveAndRejectRequestSteps.rejectVacationRequest();
	}

}
