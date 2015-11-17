package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.ApproveAndRejectRequestSteps;
import steps.LoginSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ApproveRequestAsPMTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public ApproveAndRejectRequestSteps approveAndRejectRequestSteps;

	
	@Test
	public void checkInbox() {
		loginStep.goToLoginPage();
		loginStep.loginAsPM();
		loginStep.signIn();
		approveAndRejectRequestSteps.approveRequest();
	}

}
