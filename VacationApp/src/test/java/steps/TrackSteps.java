package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.DatePickerPage;
import pages.LoginPage;
import pages.TrackPage;
import pages.VacationHomePage;

public class TrackSteps extends ScenarioSteps{
	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	DatePickerPage datePickerPage;
	TrackPage trackPage;
	
	@Step
	public void clickTrackTab(){
		trackPage.open();
	}
	
	@Step
	public void clickBuildingsDropDown(){
		trackPage.clickBuildingsDropDown();
	}
	
	@Step
	public void clickMainBuildingCheckBox(){
		trackPage.clickMainBuildingCheckBox();
	}
	
	@Step
	public void clickDeltaBuildingCheckBox(){
		trackPage.clickDeltaBuildingCheckBox();
	}
	
	@Step
	public void clickDepartmentsDropDown(){
		trackPage.clickDepartmentsDropDown();
	}
	
	@Step
	public void ClickQaDepartmentCheckBox(){
		trackPage.clickQaDepartmentCheckBox();
	}
	
	@Step
	public void ClickApply(){
		trackPage.ApplyButton();
	}
	
	
	
	
	
	
	

}
