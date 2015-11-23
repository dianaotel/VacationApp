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

	// Departments list:

	@FindBy(css = ".col-department.valign-middle")
	private List<WebElementFacade> departmentList;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox']")
	private WebElementFacade allDepartmentsCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_QA DepartmentCheckbox']")
	private WebElementFacade qaDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_.Net DepartmentCheckbox']")
	private WebElementFacade dotNetDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Accounting DepartmentCheckbox']")
	private WebElementFacade accountingDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Admin DepartmentCheckbox']")
	private WebElementFacade adminDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_DM DepartmentCheckbox']")
	private WebElementFacade dmDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_EbootCheckbox']")
	private WebElementFacade ebootDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_HR DepartmentCheckbox']")
	private WebElementFacade hrDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_IT Support DepartmentCheckbox']")
	private WebElementFacade itSupportDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Ixxus DepartmentCheckbox']")
	private WebElementFacade ixxusDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Java DepartmentCheckbox']")
	private WebElementFacade javaDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Games DepartmentCheckbox']")
	private WebElementFacade gamesDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Mobile DepartmentCheckbox']")
	private WebElementFacade mobileDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Perl DepartmentCheckbox']")
	private WebElementFacade pearlDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Sales&MarketingCheckbox']")
	private WebElementFacade salesAndMarketingDepartmentCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_WebCheckbox']")
	private WebElementFacade webCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Web DepartmentCheckbox']")
	private WebElementFacade webDepartmentCheckBox;

	// Buildings list:

	@FindBy(css = ".col-building.valign-middle")
	private List<WebElementFacade> buildingList;

	@FindBy(css = "input[value='Main Building']")
	private WebElementFacade mainBuildingCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_liferay:new-lineCheckbox']")
	private WebElementFacade notSetBuildingCheckBox;

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

	@FindBy(css = "[class='aui-paginator-link aui-paginator-next-link']")
	private WebElementFacade nextPageButton;

	@FindBy(css = "[class='aui-paginator-current-page-report aui-paginator-total']")
	private WebElementFacade pageRow;

	public void setDepartment(String departmentName) {
		if (departmentName.contains("All")) {
			allDepartmentsCheckBox.click();
		} else if (departmentName.contains("QA")) {
			qaDepartmentCheckBox.click();
		} else if (departmentName.contains(".Net")) {
			dotNetDepartmentCheckBox.click();
		} else if (departmentName.contains("Accounting")) {
			accountingDepartmentCheckBox.click();
		} else if (departmentName.contains("Admin")) {
			adminDepartmentCheckBox.click();
		} else if (departmentName.contains("DM")) {
			dmDepartmentCheckBox.click();
		} else if (departmentName.contains("Eboot")) {
			ebootDepartmentCheckBox.click();
		} else if (departmentName.contains("HR")) {
			hrDepartmentCheckBox.click();
		} else if (departmentName.contains("IT Support")) {
			itSupportDepartmentCheckBox.click();
		} else if (departmentName.contains("Ixxus")) {
			ixxusDepartmentCheckBox.click();
		} else if (departmentName.contains("Java")) {
			javaDepartmentCheckBox.click();
		} else if (departmentName.contains("Games")) {
			gamesDepartmentCheckBox.click();
		} else if (departmentName.contains("Mobile")) {
			mobileDepartmentCheckBox.click();
		} else if (departmentName.contains("Pearl")) {
			pearlDepartmentCheckBox.click();
		} else if (departmentName.contains("Sales&Marketing")) {
			salesAndMarketingDepartmentCheckBox.click();
		} else if (departmentName.contains("Web")) {
			webCheckBox.click();
		} else if (departmentName.contains("Web Department")) {
			webDepartmentCheckBox.click();
		}
	}

	public void setBuilding(String buildingName) {
		if (buildingName.contains("Main Building")) {
			mainBuildingCheckBox.click();
		} else if (buildingName.contains("Delta Building")) {
			deltaBuildingCheckBox.click();
		} else if (buildingName.contains("Not Set")) {
			notSetBuildingCheckBox.click();
		}

	}

	public int getNumberOfPages() {
		int totalPagesNumber;
		String nrOfPages;
		nrOfPages = pageRow.getText().toString().split("of ")[1].replace(')', ' ').split(" ")[0];
		totalPagesNumber = Integer.parseInt(nrOfPages);
		return totalPagesNumber;
	}

	public void clickNextPage() {
		nextPageButton.waitUntilVisible();
		nextPageButton.click();
	}

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
