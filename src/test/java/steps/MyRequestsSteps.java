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
	public void verifyListDaysNumber(String filterValue, List<MyRequestTableModel> actualResultList) {
		String[] filterListValues =filterValue.split(" - ");
		System.out.println("filterListValues : " + filterListValues.toString());
		boolean isValid = true;
		
		if(filterListValues.length == 2){
			System.out.println("There are 2 items: " + filterListValues.length);
			int minValue = Integer.valueOf(filterListValues[0].trim());
			int maxValue = Integer.valueOf(filterListValues[1].trim());
			
			for (MyRequestTableModel rowEntryNow : actualResultList) {
				System.out.println("New entry: " + rowEntryNow.getDaysNumber());
				int daysNow =  Integer.valueOf(rowEntryNow.getDaysNumber().trim());
				
				System.out.println("Min Condition: " + (minValue >= daysNow));
				System.out.println("Max Condition: " + (maxValue <= daysNow));
				if((minValue >= daysNow || maxValue <= daysNow)){
					System.out.println("minValue: " + minValue);
					System.out.println("maxValue: " + maxValue);
					System.out.println("actualValue: " + daysNow);
					isValid = false;
				}
				
				Assert.assertTrue("Value is not as expected for entry: " + rowEntryNow.getDaysNumber(), isValid);
			}
			
			
		}else{
			System.out.println("There are: " + filterListValues.length + " values.");
			if(filterListValues[0].trim().contains("ALL")){
				System.out.println("All Case....");
			}else{
				if(filterListValues[0].trim().contains("+")){
					System.out.println("+51 case");
				}
			}
		}
	}
}