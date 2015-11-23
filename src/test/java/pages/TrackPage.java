package pages;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.spi.TransactionalWriter;
import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import helpers.Constants;
import helpers.MyRequestTableModel;
import helpers.TrackTableModel;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.TRACK_PAGE_URL)
public class TrackPage extends PageObject {

	@FindBy(name = "trackerStartDate")
	private WebElementFacade trackerStartDate;

	@FindBy(name = "trackerEndDate")
	private WebElementFacade trackerEndDate;

	@FindBy(css = "[value=Apply]")
	private WebElementFacade applyButton;

	@FindBy(css = "#buildings dl dt div.hida")
	private WebElementFacade buildingsDropDown;

	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade departmentsDropDown;

	@FindBy(css = "input[value='Main Building']")
	private WebElementFacade mainBuildingCheckBox;

	@FindBy(css = ".col-department.valign-middle")
	private List<WebElementFacade> departmentList;

	@FindBy(css = ".col-building.valign-middle")
	private List<WebElementFacade> buildingList;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox']")
	private WebElementFacade allDepartmentsCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_QA DepartmentCheckbox']")
	private WebElementFacade qaDepartmentCheckBox;

	@FindBy(css = "input[value='Delta Building']")
	private WebElementFacade deltaBuildingCheckBox;

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

	@FindBy(css = ".results-grid")
	private WebElement vacationListContainer;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-employee-name > span > a")
	private WebElementFacade employeeName;

	public void trackerStartDate() {
		trackerStartDate.click();
	}

	public void trackerEndDate() {
		trackerEndDate.click();
	}

	public void applyButton() {
		applyButton.click();
	}

	public void clickBuildingsDropDown() {
		buildingsDropDown.click();
	}

	public void clickDepartmentsDropDown() {
		departmentsDropDown.click();
	}

	public void clickMainBuildingCheckBox() {
		mainBuildingCheckBox.click();
	}

	public void clickDeltaBuildingCheckBox() {
		deltaBuildingCheckBox.click();
	}

	public void clickQaDepartmentCheckBox() {
		qaDepartmentCheckBox.click();
	}

	public void clickAllDepartmentCheckBox() {
		allDepartmentsCheckBox.click();
	}

	public void checkListIsSorted(String building, String department) {

		for (WebElementFacade i : buildingList) {
			Assert.assertTrue(i.getText().contains(building));
		}

		for (WebElementFacade i : departmentList) {
			Assert.assertTrue(i.getText().contains(department));
		}
	}

	public void nrVacationOnPage(int nr) {
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

	public List<TrackTableModel> grabResultsList() {

		List<TrackTableModel> resultList = new ArrayList<TrackTableModel>();
		element(vacationListContainer).waitUntilVisible();
		List<WebElement> vacationEntryList = vacationListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		int i = 0;
		for (WebElement webElement : vacationEntryList) {
			// System.out.println("Element: " + webElement.getText());
			TrackTableModel entryNow = new TrackTableModel();

			String startDate = webElement.findElement(By.cssSelector("td[class*='start.date']")).getText();
			String endDate = webElement.findElement(By.cssSelector("td[class*='end.date']")).getText();
			String type = webElement.findElement(By.cssSelector("td[class*='type']")).getText();
			String status = webElement.findElement(By.cssSelector("td[class*='header.status']")).getText();
			String employeeName = webElement.findElement(By.cssSelector("td[class*='employee-name']")).getText();
			String department = webElement.findElement(By.cssSelector("td[class*='department']")).getText();
			String building = webElement.findElement(By.cssSelector("td[class*='building']")).getText();
			int id = i++;

			entryNow.setStartDate(startDate);
			entryNow.setEndDate(endDate);
			entryNow.setType(type);
			entryNow.setStatus(status);
			entryNow.setBuilding(building);
			entryNow.setDepartment(department);
			entryNow.setEmployeeName(employeeName);
			entryNow.setId(id);
			System.out.println(id);

		}

		return resultList;
	}

	public void employeeName() {
		employeeName.click();
	}

}
