package pages;

import java.util.List;

import javax.sql.rowset.spi.TransactionalWriter;
import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.TRACK_PAGE_URL)
public class TrackPage extends PageObject {

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

	@FindBy(css = "[value=Apply]")
	private WebElementFacade applyButton;

	public void ApplyButton() {
		applyButton.click();
	}

	@FindBy(css = "#buildings dl dt div.hida")
	private WebElementFacade buildingsDropDown;

	public void ClickBuildingsDropDown() {
		buildingsDropDown.click();
	}

	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade departmentsDropDown;

	public void ClickDepartmentsDropDown() {
		departmentsDropDown.click();
	}

	@FindBy(css = "input[value='Main Building']")
	private WebElementFacade mainBuildingCheckBox;

	public void ClickMainBuildingCheckBox() {
		mainBuildingCheckBox.click();
	}

	@FindBy(css = "input[value='Delta Building']")
	private WebElementFacade deltaBuildingCheckBox;

	public void ClickDeltaBuildingCheckBox() {
		deltaBuildingCheckBox.click();
	}

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_QA DepartmentCheckbox']")
	private WebElementFacade qaDepartmentCheckBox;

	public void ClickQaDepartmentCheckBox() {
		qaDepartmentCheckBox.click();
	}

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox']")
	private WebElementFacade allDepartmentsCheckBox;

	public void ClickAllDepartmentCheckBox() {
		allDepartmentsCheckBox.click();
	}

	@FindBy(css = ".col-building.valign-middle")
	private List<WebElementFacade> buildingList;

	@FindBy(css = ".col-department.valign-middle")
	private List<WebElementFacade> departmentList;

	public void CheckListIsSorted(String building, String department) {

		for (WebElementFacade i : buildingList) {
			System.out.println("aici " + i.getText());
			Assert.assertTrue(i.getText().contains(building));
		}

		for (WebElementFacade i : departmentList) {
			System.out.println("aici " + i.getText());
			Assert.assertTrue(i.getText().contains(department));
		}
	}

	@FindBy(css = "option[value='5']")
	private WebElementFacade VacationOnPage5;

	@FindBy(css = "option[value='10']")
	private WebElementFacade VacationOnPage10;

	@FindBy(css = "option[value='20']")
	private WebElementFacade VacationOnPage20;

	@FindBy(css = "option[value='30']")
	private WebElementFacade VacationOnPage30;

	@FindBy(css = "option[value='50']")
	private WebElementFacade VacationOnPage50;

	@FindBy(css = "option[value='75']")
	private WebElementFacade VacationOnPage75;

	@FindBy(css = "select[id='_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage']")
	private WebElementFacade nrVacationOnPage;

	public void NrVacationOnPage(int nr) {
		nrVacationOnPage.click();

		if (nr == 5) {
			VacationOnPage5.click();
		} else if (nr == 10) {
			VacationOnPage10.click();
		} else if (nr == 20) {
			VacationOnPage20.click();
		} else if (nr == 30) {
			VacationOnPage30.click();
		} else if (nr == 50) {
			VacationOnPage50.click();
		} else {
			VacationOnPage75.click();
		}
	}

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-employee-name > span > a")
	private WebElementFacade employeeName;

	public void EmployeeName() {
		employeeName.click();
	}

	@FindBy(css = "td.col-employee-name.first.sort-column")
	private List<WebElementFacade> employeeList;

	public void CheckEmployeeNameIsSorted() {
		String previousName = "a";
		String nameListIsSorted = "true";
		for (WebElementFacade currentName : employeeList) {
			if (currentName.getText().compareTo(previousName) <= 0) {
				nameListIsSorted = "false";
				break;
			}
			previousName = currentName.getText();
		}

		Assert.assertTrue("Name list is correctly sorted", element(nameListIsSorted).getText().contains("true"));

	}

}
