package steps;

import pages.FreeDaysHistoryPage;
import pages.LoginPage;
import pages.VacationHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FreeDaysHistorySteps extends ScenarioSteps {

	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	FreeDaysHistoryPage freeDaysHistoryPage;
	
	@Step
	public void goToFreeDaysHistoryPage() {
		freeDaysHistoryPage.open();
	}
	
	@Step
	public void vacationCheckbox() {
		freeDaysHistoryPage.vacationCheckbox();
	}
	
	@Step
	public void applyButton() {
		freeDaysHistoryPage.applyButton();
	}
	
	@Step
	public void verifyThatTypeIsCorrect(String vacationdays){
		freeDaysHistoryPage.verifyThatTypeIsCorrect(vacationdays);
	}
	
	@Step
	public void addedDays() {
		freeDaysHistoryPage.addedDaysCheckbox();
	}
	
	@Step
	public void verifyThatOperationIsCorrect(String addeddays){
		freeDaysHistoryPage.verifyThatOperationIsCorrect(addeddays);
	}
}


