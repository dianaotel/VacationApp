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
public class ViewTesterVacationsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public ViewVacationsSteps viewVacationsSteps;

	@Test
	public void viewTesterVacationsAsPM() {
		loginSteps.goToLoginPage();
		loginSteps.loginAsPM();
		loginSteps.signIn();
		viewVacationsSteps.goToViewVacationsPage();
		viewVacationsSteps.insertTesterName();
		viewVacationsSteps.applySelectedFilters();
		viewVacationsSteps.searchForVacationsOfEmployee();
		//viewVacationsSteps.checkIfSearchForTesterReportIsCorrect();
	}

}
