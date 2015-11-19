package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;
import steps.MyRequestsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	MyRequestsSteps myRequestSteps;
	@Steps
	LoginSteps loginSteps;

	@Test
	public void verifyThatTypeIsCorrect() {
		loginSteps.goToLoginPage();
		loginSteps.loginAsDM();
		loginSteps.signIn();

		myRequestSteps.goToMyRequestPage();
		myRequestSteps.holidayCheckbox();
		myRequestSteps.applyButton();
		myRequestSteps.verifyThatTypeIsCorrect("Holiday");
		myRequestSteps.grabVacationList();

	}
}
