package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.VacationsReportSteps;
import steps.LoginSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckVacationsReportsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public VacationsReportSteps vacationsReportSteps;

	@Test
	public void exportVacationsRandomFilterTest() {
		loginSteps.goToLoginPage();
		loginSteps.loginAsDM();
		loginSteps.signIn();
		vacationsReportSteps.goToVacationsReportPage();
		vacationsReportSteps.selectRandomMonth();
		vacationsReportSteps.selectRandomYear();
		vacationsReportSteps.selectApprovedStatusRadioButton();
	}
	
	@Test
	public void viewPmsVacationsReport() {
		vacationsReportSteps.insertPMName();
		vacationsReportSteps.clickSearhButton();
		vacationsReportSteps.checkIfSearchForPmsReportIsCorrect();
	}
	
}
