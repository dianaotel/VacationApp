package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import steps.LoginSteps;
import steps.NewVacationRequestSteps;
import steps.SelectMoreVacTypesAtOnceSpets;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SelectMoreVacTypesAtOnceTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;
	
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Steps
	public SelectMoreVacTypesAtOnceSpets selectMoreVacTypesAtOnceSpets;

	@Test
	public void newVacationRequest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		newVacationRequestSteps.setStartDate(26, "Feb", 2018);
		newVacationRequestSteps.setEndDate(27, "Feb", 2018);
		selectMoreVacTypesAtOnceSpets.selectVacTypesRandomly();
		newVacationRequestSteps.saveVacationRequest();
		newVacationRequestSteps.confirmationMessage();

	}

}
