package com.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
import com.steps.serenity.ApproveAndRejectRequestSteps;

@RunWith(SerenityRunner.class)
public class ApproveRequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public ApproveAndRejectRequestSteps approveAndRejectRequestSteps;

	
	@Test
	public void checkInbox() {
		loginStep.goToLoginPage();
		loginStep.enterCredentials("vladlupusanschi","123456");
		loginStep.signIn();
		approveAndRejectRequestSteps.approveRequest();
	}

}
