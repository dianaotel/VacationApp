package steps;

import pages.LoginPage;
import pages.MyRequestsPage;
import pages.VacationHomePage;

import java.util.List;

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
	public void verifyThatTypeIsCorrect(String holiday){
		myRequestsPage.verifyThatTypeIsCorrect(holiday);
	}
	
	@Step
	public List<MyRequestTableModel> grabVacationList(){
		return myRequestsPage.grabResultsList();
	}
	
}
