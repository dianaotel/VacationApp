package com.tests;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holidayCheckbox;
	
	public void click_holidayCheckbox(){
		holidayCheckbox.click();
	}
	
	
}