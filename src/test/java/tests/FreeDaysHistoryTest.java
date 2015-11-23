package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.FreeDaysHistorySteps;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class FreeDaysHistoryTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	FreeDaysHistorySteps freeDaysHistorySteps;
	@Steps
	LoginSteps loginSteps;
	
	@Test
	public void verifyThatOperationIsCorrect() {
		loginSteps.goToLoginPage();
		loginSteps.loginAsTester();
		loginSteps.signIn();
		
		freeDaysHistorySteps.goToFreeDaysHistoryPage();
		freeDaysHistorySteps.addedDays();
		freeDaysHistorySteps.applyButton();
		freeDaysHistorySteps.verifyThatOperationIsCorrect("Added days");
	}
	
	@Test
	public void verifyThatTypeIsCorrect() {
		freeDaysHistorySteps.vacationCheckbox();
		freeDaysHistorySteps.applyButton();
		freeDaysHistorySteps.addedDays();
		freeDaysHistorySteps.applyButton();
		freeDaysHistorySteps.verifyThatTypeIsCorrect("Vacation Days");
	
		}	
}
