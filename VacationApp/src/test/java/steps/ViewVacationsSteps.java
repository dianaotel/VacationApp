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
		vacationHomePage.viewVacationsButton();
	}

	@Step
	public void insertName(String lastName, String firstName) {
		viewVacationsPage.insertName(lastName, firstName);
	}

	@Step
	public void insertTesterName() {
		insertName(Constants.TESTER_LAST_NAME, Constants.TESTER_FIRST_NAME);
	}

	@Step
	public void insertPMName() {
		insertName(Constants.PM_LAST_NAME, Constants.PM_FIRST_NAME);
	}

	@Step
	public void insertDMName() {
		insertName(Constants.DM_LAST_NAME, Constants.DM_FIRST_NAME);
	}

	@Step
	public void applyChanges() {
		viewVacationsPage.clickApplyButton();
	}

	@Step
	public void verifyAppliedChanges() {
		viewVacationsPage.applyingChangesWorksCorrectly();
	}
}
