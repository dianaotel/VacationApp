package steps;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ViewVacationsPage;
import pages.VacationHomePage;

public class ViewVacationsSteps extends ScenarioSteps {

	VacationHomePage vacationHomePage;
	ViewVacationsPage viewVacationsPage;

	@Step
	public void goToViewVacationsPage() {
		vacationHomePage.goToViewVacations();
	}

	@Step
	public void selectRandomVacationType() {
		viewVacationsPage.selectRandomVacationType();
	}
	
	@Step
	public void selectRandomNumberOfDays() {
		viewVacationsPage.selectRandomNumberOfDays();
	}
	
	@Step
	public void selectRandomVacationStatus() {
		viewVacationsPage.selectRandomVacationStatus();
	}
	
	@Step
	public void insertEmployeeName(String lastName, String firstName) {
		viewVacationsPage.insertEmployeeName(lastName, firstName);
	}

	@Step
	public void insertTesterName() {
		insertEmployeeName(Constants.TESTER_LAST_NAME, Constants.TESTER_FIRST_NAME);
	}

	@Step
	public void insertPMName() {
		insertEmployeeName(Constants.PM_LAST_NAME, Constants.PM_FIRST_NAME);
	}

	@Step
	public void insertDMName() {
		insertEmployeeName(Constants.DM_LAST_NAME, Constants.DM_FIRST_NAME);
	}

	@Step
	public void applySelectedFilters() {
		viewVacationsPage.applySelectedFilters();
	}

	@Step
	public void searchForVacationsOfEmployee() {
		viewVacationsPage.searchForVacationsOfEmployee();
	}
	
	@Step
	public void checkIfSearchForTesterReportIsCorrect() {
		viewVacationsPage.checkIfSearchForTesterReportIsCorrect();
	}
	
}
