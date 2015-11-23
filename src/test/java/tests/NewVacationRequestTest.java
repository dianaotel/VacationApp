package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import steps.LoginSteps;
import steps.NewVacationRequestSteps;
import steps.ZimbraLoginSteps;
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
	
	@Steps 
	ZimbraLoginSteps zimbraLoginSteps;

	@Test
	public void newVacationRequest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		newVacationRequestSteps.setStartDate(10, "Feb", 2018);
		newVacationRequestSteps.setEndDate(11, "Feb", 2018);
		/*  Type of vacation:
		 *  "Vacation without payment"     *  "Sick Leave"       *  "Marriage" 
		 *  "Child Birth"                  *  "Funeral"          *  "Other"
		 *  "Prenatal/Postnatal"           *  "ConcediuIngrijireCopii"      
		 *  Only "Vacation without payment" has "addDurationDomain" and "addIntitutionName"
		 *  the rest have only "addComment" */
		newVacationRequestSteps.selectVacationType("ConcediuIngrijireCopii");
		newVacationRequestSteps.addDurationDomain("Test Domain");
		newVacationRequestSteps.addIntitutionName("Test Institution");
		newVacationRequestSteps.addComment("Test Comment");
		newVacationRequestSteps.saveVacationRequest();
		newVacationRequestSteps.confirmationMessage();
		//zimbraLoginSteps.goToZimbraLoginPage();
		//zimbraLoginSteps.loginAsPM();
		
	}

}
