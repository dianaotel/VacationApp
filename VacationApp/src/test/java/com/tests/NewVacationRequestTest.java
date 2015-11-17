package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginStep;
import com.steps.serenity.NewVacationRequestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginStep loginStep;
	
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	
	
	
	@Test
	public void newVacationRequest(){
		loginStep.goToLoginPage();
		loginStep.enterUsername("vladlupusanschi");
		loginStep.enterPassword("123456");
		loginStep.signIn();
		loginStep.goToVacationHomePage();
		
		newVacationRequestSteps.setStartDate(18, "Nov", 2015);
		newVacationRequestSteps.setEndDate(19, "Nov", 2015);
		newVacationRequestSteps.setVacationType();
		newVacationRequestSteps.saveVacationRequest();
	}

}
