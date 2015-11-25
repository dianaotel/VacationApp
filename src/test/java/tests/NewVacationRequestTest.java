package tests;
/**
 * Type of vacation: "Vacation without payment" * "Sick Leave" *
 * "Marriage" "Child Birth" * "Funeral" * "Other" "Prenatal/Postnatal" *
 * "ConcediuIngrijireCopii" Only "Vacation without payment" has
 * "addDurationDomain" and "addIntitutionName" the rest have only
 * "addComment"
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import steps.LoginSteps;
import steps.NewVacationRequestSteps;
import steps.ZimbraLoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(separator = ';', value = "resources/NewVacationRequestData.csv")
public class NewVacationRequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	public String startDay, startMonth, startYear, endDay, endMonth, endYear;
	public String vacationType, optionalComment, institutionName, domainName;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;

	@Test
	public void newVacationRequest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		newVacationRequestSteps.setVacationData(startDay, startMonth, startYear, endDay, endMonth, endYear,
				vacationType, optionalComment, institutionName, domainName);
		newVacationRequestSteps.saveVacationRequest();
		newVacationRequestSteps.confirmationMessage();

	}

}
