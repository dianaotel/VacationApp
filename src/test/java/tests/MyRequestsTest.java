package tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helpers.MyRequestTableModel;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;
import steps.MyRequestsSteps;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	MyRequestsSteps myRequestSteps;
	@Steps
	LoginSteps loginSteps;
	
	private List<MyRequestTableModel> actualResultList;
//	private String filterValue = "ALL";
//	private String filterValue = "51 +";
	private String filterValue = "1 - 5";

//	@Test
	public void verifyThatTypeIsCorrect() {

		myRequestSteps.holidayCheckbox();
		myRequestSteps.applyButton();
		myRequestSteps.pendingCheckbox();
		myRequestSteps.applyButton();
		myRequestSteps.verifyThatTypeIsCorrect("Holiday");
	}
	
//	@Test
	public void verifyThatStatusIsCorrect() {

		myRequestSteps.pendingCheckbox();
		myRequestSteps.applyButton();
		myRequestSteps.futureVacationsCheckbox();
		myRequestSteps.applyButton();
		myRequestSteps.verifyThatStatusIsCorrect("Pending");
	}

	@Test
	public void verifiyThatDaysNumberIsCorrect() {
		loginSteps.goToLoginPage();
		loginSteps.loginAsPM();
		loginSteps.signIn();
		
		String filterValue = myRequestSteps.randomNumberOfDays();
		myRequestSteps.applyButton();
		myRequestSteps.holidayCheckbox();
		myRequestSteps.applyButton();
		
//		actualResultList = myRequestSteps.grabSimpleResultsList();	
		
		myRequestSteps.verifyListDaysNumber(filterValue);
	}
	
//	@Test
	public void verifyVacationsInFuture() {
		
		loginSteps.goToLoginPage();
		loginSteps.loginAsPM();
		loginSteps.signIn();

		myRequestSteps.goToMyRequestPage();
		myRequestSteps.futureVacationsCheckbox();
		myRequestSteps.applyButton();
		myRequestSteps.grabVacationList();
		
		
	}
}