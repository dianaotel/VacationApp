package steps;

import pages.DatePickerPage;
import pages.LoginPage;
import pages.NewVacationRequestPage;
import pages.VacationHomePage;
import tests.NewVacationRequestTest;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps extends ScenarioSteps {
	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	NewVacationRequestPage newVacationRequestPage;
	DatePickerPage datePickerPage;

	@Step
	public void setStartDate(int day, String month, int year) {
		vacationHomePage.createNewVacationRequestTab();
		newVacationRequestPage.startDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void setEndDate(int day, String month, int year) {
		newVacationRequestPage.endDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void selectVacationType(String vacationType) {
		newVacationRequestPage.chooseVacationType(vacationType);
	}

	@Step
	public void addComment(String comment) {
		newVacationRequestPage.addCommet(comment);
	}

	@Step
	public void addDurationDomain(String durationDomain) {
		newVacationRequestPage.addDurationDomain(durationDomain);
	}

	@Step
	public void addIntitutionName(String institutionName) {
		newVacationRequestPage.addInstitutionName(institutionName);
	}

	@Step
	public void saveVacationRequest() {
		newVacationRequestPage.saveVacationRequest();
	}

	@Step
	public void confirmationMessage() {
		newVacationRequestPage.vacationRequestConfirmationMessage();
	}

}
