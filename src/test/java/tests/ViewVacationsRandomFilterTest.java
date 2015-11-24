package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.ViewVacationsSteps;
import steps.LoginSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ViewVacationsRandomFilterTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public ViewVacationsSteps viewVacationsSteps;

	@Test
	public void viewVacationsRandomFilterTest() {
		loginSteps.goToLoginPage();
		loginSteps.loginAsPM();
		loginSteps.signIn();
		viewVacationsSteps.goToViewVacationsPage();
		viewVacationsSteps.selectRandomVacationType();
		viewVacationsSteps.selectRandomNumberOfDays();
		viewVacationsSteps.selectRandomVacationStatus();
		viewVacationsSteps.applySelectedFilters();
	}
}
