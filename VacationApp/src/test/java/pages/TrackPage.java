package pages;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.TRACK_PAGE_URL)
public class TrackPage extends PageObject{
	
	@FindBy(css="[value=Apply]")
	private WebElementFacade applyButton;
	public void ApplyButton(){
		applyButton.click();
	}
	
	@FindBy(css="#buildings dl dt div.hida")
	private WebElementFacade buildingsDropDown;
	public void clickBuildingsDropDown(){
		buildingsDropDown.click();
	}
	
	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade departmentsDropDown;
	public void clickDepartmentsDropDown(){
		departmentsDropDown.click();
	}
	
	@FindBy(css="input[value='Main Building']")
	private WebElementFacade mainBuildingCheckBox;
	public void clickMainBuildingCheckBox(){
		mainBuildingCheckBox.click();
	}
	
	@FindBy(css="input[value='Delta Building']")
	private WebElementFacade deltaBuildingCheckBox;
	public void clickDeltaBuildingCheckBox(){
		deltaBuildingCheckBox.click();
	}
	
	@FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_QA DepartmentCheckbox']")
	private WebElementFacade qaDepartmentCheckBox;
	public void clickQaDepartmentCheckBox(){
		qaDepartmentCheckBox.click();
	}
	
	@FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox']")
	private WebElementFacade allDepartmentsCheckBox;
	public void clickAllDepartmentCheckBox(){
		allDepartmentsCheckBox.click();
	}

}
