package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;
import steps.TrackSteps;

@RunWith(SerenityRunner.class)
public class TrackTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginSteps loginStep;
	
	@Steps
	public TrackSteps trackSteps;
	
	@Test
	public void trackTest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();
		
		trackSteps.clickTrackTab();
		trackSteps.clickBuildingsDropDown();
		trackSteps.clickMainBuildingCheckBox();
		trackSteps.clickDeltaBuildingCheckBox();
		trackSteps.clickBuildingsDropDown();
		trackSteps.clickDepartmentsDropDown();
		trackSteps.ClickAllDepartments();
		trackSteps.ClickQaDepartmentCheckBox();
		trackSteps.ClickApply();
	}
   
}


