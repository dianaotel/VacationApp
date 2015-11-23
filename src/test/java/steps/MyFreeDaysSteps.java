package steps;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MyFreeDaysPage;
import pages.NewVacationRequestPage;
import pages.VacationHomePage;

public class MyFreeDaysSteps extends ScenarioSteps {

	MyFreeDaysPage myFreeDaysPage;
	NewVacationRequestPage newVacationRequestPage;
	VacationHomePage vacationHomePage;

	@Step
	public void checkIfTheFreeDaysValuesAreTheSame() {
		vacationHomePage.goToMyFreeDays();
		String freeDaysFromMyFreeDays = myFreeDaysPage.getNrOfFreeDays();
		vacationHomePage.createNewVacationRequestTab();
		String freeDaysFromNewVacationRequest = newVacationRequestPage.getNrOfFreeDays();
		Assert.assertTrue("The 2 free days values are equal", freeDaysFromMyFreeDays.contains(freeDaysFromNewVacationRequest));
	}

}
