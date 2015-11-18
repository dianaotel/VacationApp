package tests;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import steps.MyRequestsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	MyRequestsSteps myRequestStep;
	
	@Test 
	public void click_holidayCheckbox() {
		myRequestStep.goToMyRequestPage();
	}
	
	@Test
	public void click_vacationWithoudPaymentCheckbox() {
		myRequestStep.goToMyRequestPage();
	}
	
}

