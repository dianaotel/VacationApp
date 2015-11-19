package steps;

import pages.DatePickerPage;
import pages.LoginPage;
import pages.NewVacationRequestPage;
import pages.VacationHomePage;
import tests.NewVacationRequestTest;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps extends ScenarioSteps{
	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	NewVacationRequestPage newVacationRequestPage;
	DatePickerPage datePickerPage;
	

	@Step
	public void setStartDate(int day, String month, int year) {
		newVacationRequestPage.CreateNewVacationRequestTab();
		newVacationRequestPage.StartDate();
		datePickerPage.SetDate(day, month, year);
	}

	@Step
	public void setEndDate(int day, String month, int year) {
		newVacationRequestPage.EndDate();
		datePickerPage.SetDate(day, month, year);

	}

	@Step
	public void selectVacationWithoutPayment() {
		newVacationRequestPage.VacationWithoutPayment();
	}
	
	@Step
	public void selectHoliday() {
		newVacationRequestPage.Holiday();
	}
	
	@Step
	public void selectSickLeave() {
		newVacationRequestPage.SickLeave();
	}
	
	@Step
	public void insertComment(String comment){
		newVacationRequestPage.AddComment(comment);
	}

	@Step
	public void saveVacationRequest() {
		newVacationRequestPage.SaveVacationRequest();
	}
	
	@Step
	public void confirmationMessage(){
		newVacationRequestPage.VacationRequestConfirmationMessage();
	}
	
	

}
