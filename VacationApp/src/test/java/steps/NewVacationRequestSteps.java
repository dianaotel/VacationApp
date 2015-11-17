package steps;

import pages.DatePickerPage;
import pages.LoginPage;
import pages.NewVacationRequestPage;
import pages.VacationHomePage;
import tests.NewVacationRequestTest;

import net.thucydides.core.annotations.Step;

public class NewVacationRequestSteps {
	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	NewVacationRequestPage newVacationRequestPage;
	DatePickerPage datePickerPage;

	@Step
	public void setStartDate(int day, String month, int year) {
		newVacationRequestPage.CreateNewVacationRequestTab();
		datePickerPage.StartDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void setEndDate(int day, String month, int year) {
		datePickerPage.EndDate();
		datePickerPage.setDate(day, month, year);

	}

	@Step
	public void setVacationType() {
		newVacationRequestPage.VacationWithoutPayment();
	}

	@Step
	public void saveVacationRequest() {
		newVacationRequestPage.SaveVacationRequest();
	}

}
