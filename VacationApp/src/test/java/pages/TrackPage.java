package pages;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.TRACK_PAGE_URL)
public class TrackPage extends PageObject{
	
	@FindBy(name = "trackerStartDate")
	private WebElementFacade trackerStartDate;
	
	public void TrackerStartDate() {
		trackerStartDate.click();
	}

	@FindBy(name = "trackerEndDate")
	private WebElementFacade trackerEndDate;
	
	public void TrackerEndDate() {
		trackerEndDate.click();
	}
	
	@FindBy(css="[value=Apply]")
	private WebElementFacade applyButton;
	public void ApplyButton(){
		applyButton.click();
	}
	
	@FindBy(css="#buildings dl dt div.hida")
	private WebElementFacade buildingsDropDown;
	public void ClickBuildingsDropDown(){
		buildingsDropDown.click();
	}
	
	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade departmentsDropDown;
	public void ClickDepartmentsDropDown(){
		departmentsDropDown.click();
	}
	
	@FindBy(css="input[value='Main Building']")
	private WebElementFacade mainBuildingCheckBox;
	public void ClickMainBuildingCheckBox(){
		mainBuildingCheckBox.click();
	}
	
	@FindBy(css="input[value='Delta Building']")
	private WebElementFacade deltaBuildingCheckBox;
	public void ClickDeltaBuildingCheckBox(){
		deltaBuildingCheckBox.click();
	}
	
	@FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_QA DepartmentCheckbox']")
	private WebElementFacade qaDepartmentCheckBox;
	public void ClickQaDepartmentCheckBox(){
		qaDepartmentCheckBox.click();
	}
	
	@FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox']")
	private WebElementFacade allDepartmentsCheckBox;
	public void ClickAllDepartmentCheckBox(){
		allDepartmentsCheckBox.click();
	}

}
