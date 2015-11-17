package com.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.steps.serenity.LoginStep;
import com.steps.serenity.NewVacationRequestSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginStep loginStep;
	
	@Test
	public void login() {
		loginStep.goToLoginPage();
		loginStep.enterUsername("vladlupusanschi");
		loginStep.enterPassword("123456");
		loginStep.signIn();
		loginStep.goToVacationHomePage();		
		
	}

}