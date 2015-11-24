package steps;

import pages.LoginPage;
import pages.MyRequestsPage;
import pages.VacationHomePage;

import java.util.List;

import org.junit.Assert;

import helpers.MyRequestTableModel;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyRequestsSteps extends ScenarioSteps {

	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	MyRequestsPage myRequestsPage;

	@Step
	public void goToMyRequestPage() {
		myRequestsPage.open();
	}

	@Step
	public void holidayCheckbox() {
		myRequestsPage.holidayCheckbox();
	}

	@Step
	public void applyButton() {
		myRequestsPage.applyButton();
	}

	@Step
	public void verifyThatTypeIsCorrect(String holiday) {
		myRequestsPage.verifyThatTypeIsCorrect(holiday);
	}
	
	public void pendingCheckbox() {
		myRequestsPage.pendingCheckbox();
	}
	
	@Step
	public void verifyThatStatusIsCorrect(String pending ) {
		myRequestsPage.verifyThatStatusIsCorrect(pending);
	}
	
	@Step
	public void grabVacationList() {
		myRequestsPage.grabResultsList();

	}

	@Step
	public void futureVacationsCheckbox() {
		myRequestsPage.futureVacationsCheckbox();
	}
	
	@Step
	public void fifthCheckbox() {
		myRequestsPage.oneToFiveCheckbox();
	}

	@Step
	public List<MyRequestTableModel> grabSimpleResultsList() {
		return myRequestsPage.grabSimpleResultsList();
	}
	
	@Step
	public String randomNumberOfDays() {
		return myRequestsPage.randomNumberOfDays();
	}
	
	@Step
	public void verifyListDaysNumber(String filterValue) {
		myRequestsPage.verifyListDaysNumber(filterValue);
	}
}