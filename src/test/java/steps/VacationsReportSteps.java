package steps;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.VacationsReportPage;
import pages.VacationHomePage;

public class VacationsReportSteps extends ScenarioSteps {

	VacationHomePage vacationHomePage;
	VacationsReportPage vacationsReportPage;
	
	@Step
	public void goToVacationsReportPage() {
		vacationHomePage.goToVacationsReport();
	}
	
	@Step
	public void selectRandomMonth() {
		vacationsReportPage.clickDropDownMonth();
		vacationsReportPage.selectRandomMonth();
	}
	
	@Step
	public void selectRandomYear() {
		vacationsReportPage.selectRandomYear();
	}
	
	@Step
	public void selectApprovedStatusRadioButton() {
		vacationsReportPage.selectApprovedStatusRadioButton();
	}
	
	@Step
	public void selectPendingStatusRadioButton() {
		vacationsReportPage.selectPendingStatusRadioButton();
	}
	
	@Step
	public void clickExportButton() {
		vacationsReportPage.clickExportButton();
	}
	
	@Step
	public void insertEmployeeName(String lastName, String firstName) {
		vacationsReportPage.insertEmployeeName(lastName, firstName);
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
	public void clickSearhButton() {
		vacationsReportPage.clickSearhButton();
	}
	
	@Step
	public void checkIfSearchForPmsReportIsCorrect() {
		vacationsReportPage.checkIfSearchForPmsReportIsCorrect();
	}
	
}
