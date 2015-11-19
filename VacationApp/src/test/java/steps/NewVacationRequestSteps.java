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
		newVacationRequestPage.createNewVacationRequestTab();
		newVacationRequestPage.startDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void setEndDate(int day, String month, int year) {
		newVacationRequestPage.endDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void selectVacationWithoutPayment() {
		newVacationRequestPage.vacationWithoutPayment();
	}	

	@Step

	public void insertComment(String comment) {
		newVacationRequestPage.addComment(comment);
	}
	
	public void selectHoliday() {
		newVacationRequestPage.holiday();
	}
	
	@Step
	public void selectSickLeave() {
		newVacationRequestPage.sickLeave();
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
