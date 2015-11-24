package steps;

import pages.DatePickerPage;
import pages.LoginPage;
import pages.NewVacationRequestPage;
import pages.VacationHomePage;
import tests.NewVacationRequestTest;

import org.openqa.jetty.html.Break;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps extends ScenarioSteps {
	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	NewVacationRequestPage newVacationRequestPage;
	DatePickerPage datePickerPage;

	@Step
	public void setVacationData(String startDay, String startMonth, String startYear, String endDay, String endMonth,
			String endYear, String vacationType, String optionalComment, String institutionName, String domainName) {
		setStartDate(startDay, startMonth, startYear);
		setEndDate(endDay, endMonth, endYear);
		selectVacationType(vacationType);
		addComment(optionalComment);

		if (institutionName.isEmpty() && domainName.isEmpty()) {

		} else {
			addDurationDomain(domainName);
			addIntitutionName(institutionName);
		}
	}

	@Step
	public void setStartDate(String days, String month, String years) {
		int day = Integer.parseInt(days);
		int year = Integer.parseInt(years);
		vacationHomePage.createNewVacationRequestTab();
		newVacationRequestPage.startDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void setEndDate(String days, String month, String years) {
		int day = Integer.parseInt(days);
		int year = Integer.parseInt(years);
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
