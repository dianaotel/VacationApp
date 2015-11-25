package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;
import steps.MyFreeDaysSteps;

@RunWith(SerenityRunner.class)
public class MyFreeDaysTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;

	@Test
	public void testIfTotalFreeDayAreTheSame() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		myFreeDaysSteps.checkIfTheFreeDaysValuesAreTheSame();
	}

}
