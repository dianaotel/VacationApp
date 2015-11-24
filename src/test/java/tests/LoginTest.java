package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.LoginSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(separator = ';', value = "resources/LoginData.csv")
public class LoginTest {

	public String username, password;
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Test
	public void loginTest() {
		loginStep.goToLoginPage();
		loginStep.enterEvoportalLoginCredentials(username, password);
		loginStep.signIn();
		loginStep.checkIfItLogsIn();
	}
}