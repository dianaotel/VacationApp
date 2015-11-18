package steps;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;

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
	public void ClickTrackTab(){
		trackPage.open();
	}
	
	@Step
	public void SetStartDate(int day, String month, int year){
		trackPage.TrackerStartDate();
		datePickerPage.SetDate(day, month, year);
	}
	
	@Step
	public void SetEndDate(int day, String month, int year){
		trackPage.TrackerEndDate();
		datePickerPage.SetDate(day, month, year);
	}
		
	
	@Step
	public void ClickBuildingsDropDown(){
		trackPage.ClickBuildingsDropDown();
	}
	
	@Step
	public void ClickMainBuildingCheckBox(){
		trackPage.ClickMainBuildingCheckBox();
	}
	
	@Step
	public void ClickDeltaBuildingCheckBox(){
		trackPage.ClickDeltaBuildingCheckBox();
	}
	
	@Step
	public void ClickDepartmentsDropDown(){
		trackPage.ClickDepartmentsDropDown();
	}
	
	@Step
	public void ClickAllDepartments(){
		trackPage.ClickAllDepartmentCheckBox();
		
	}
	
	@Step
	public void ClickQaDepartmentCheckBox(){
		trackPage.ClickQaDepartmentCheckBox();
	}	
	
	
	@Step
	public void ClickApply(){
		trackPage.ApplyButton();
	}
	
	@Step
	public void CheckListIsSorter(String building,String department){
		trackPage.CheckListIsSorted(building, department);
	}
	
	
	@Step
	public void NrOfVacationOnPage(int nr){
		trackPage.NrVacationOnPage(nr);		
	}
	
	
	
	
	
	
	

}
