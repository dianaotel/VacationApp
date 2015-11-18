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
		
		trackSteps.ClickTrackTab();
		
		trackSteps.SetStartDate(11,"Oct",2015);
		trackSteps.SetEndDate(25, "Nov", 2015);
		
		trackSteps.ClickBuildingsDropDown();
		trackSteps.ClickMainBuildingCheckBox();
		trackSteps.ClickMainBuildingCheckBox();
		//trackSteps.ClickDeltaBuildingCheckBox();
		
		trackSteps.ClickBuildingsDropDown();
		trackSteps.ClickDepartmentsDropDown();
		trackSteps.ClickAllDepartments();
		trackSteps.ClickQaDepartmentCheckBox();
		trackSteps.ClickApply();
		
		trackSteps.CheckListIsSorter("Delta Building", "QA Department");
	}
   
}


