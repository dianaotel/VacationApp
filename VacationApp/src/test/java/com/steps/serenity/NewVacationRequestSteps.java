package com.steps.serenity;

import com.pages.DatePickerPage;
import com.pages.LoginPage;
import com.pages.NewVacationRequestPage;
import com.pages.VacationHomePage;
import com.tests.NewVacationRequestTest;

import net.thucydides.core.annotations.Step;

public class NewVacationRequestSteps {
	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	NewVacationRequestPage newVacationRequestPage;
	DatePickerPage datePickerPage;

	@Step
	public void goToLoginPage() {
		loginPage.open();
	}

	@Step
	public void enterUsername(String username) {
		loginPage.enterUsername(username);
	}

	@Step
	public void enterPassword(String password) {
		loginPage.enterPassword(password);
	}

	@Step
	public void signIn() {
		loginPage.signIn();
	}

	@Step
	public void goToVacationHomePage() {
		vacationHomePage.open();
	}
	
	@Step
	public void setStartDate(int day, String month, int year){
		newVacationRequestPage.CreateNewVacationRequestTab();
		datePickerPage.StartDate();
		datePickerPage.setDate(day, month, year);	
	}
	
	@Step
	public void setEndDate(int day, String month, int year){
		datePickerPage.EndDate();
		datePickerPage.setDate(day, month, year);		
		
	}
	
	@Step
	public void setVacationType(){
		newVacationRequestPage.VacationWithoutPayment();
	}
	
	@Step
	public void saveVacationRequest(){		
		newVacationRequestPage.SaveVacationRequest();
	}

}
