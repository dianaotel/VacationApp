package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import helpers.Constants;

public class ViewVacationsPage extends PageObject {

	@FindBy(css = "div.aui-column-content-first.column-three-content")
	private WebElementFacade vacationTypeCheckboxContainer;

	@FindBy(css = "div.aui-column.column-three.column-center")
	private WebElementFacade daysNumberCheckboxContainer;

	@FindBy(css = "div.aui-column.column-three.column-center.aui-column-last")
	private WebElementFacade vacationStatusCheckboxContainer;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_futureVacationsCheckbox")
	private WebElementFacade futureVacationsCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerPage;

	@FindBy(css = "tr.portlet-section-header.results-header")
	private WebElementFacade tableFilters;

	@FindBy(css = "a[href*='orderByCol=employee']")
	private WebElementFacade orderByEmployee;

	@FindBy(css = "a[href*='orderByCol=startDate']")
	private WebElementFacade orderByStartDate;

	@FindBy(css = "a[href*='orderByCol=endDate']")
	private WebElementFacade orderByEndDate;

	@FindBy(css = "a[href*='orderByCol=modifiedDate']")
	private WebElementFacade orderByModifiedDate;

	@FindBy(css = "a[href*='orderByCol=lastUpdate']")
	private WebElementFacade orderByLastUpdatedBy;

	@FindBy(css = "a[href*='orderByCol=assignee']")
	private WebElementFacade orderByApprover;

	@FindBy(css = "a[href*='orderByCol=daysNr']")
	private WebElementFacade orderByDaysNumber;

	@FindBy(css = "a[href*='orderByCol=type']")
	private WebElementFacade orderByType;

	@FindBy(css = "a[href*='orderByCol=status']")
	private WebElementFacade orderByStatus;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade fieldLastName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade fieldFirstName;

	public void selectRandomVacationType() {
		element(vacationTypeCheckboxContainer).waitUntilVisible();
		List<WebElement> vacationTypeList = vacationTypeCheckboxContainer
				.findElements(By.cssSelector(".aui-field-content"));

		if (vacationTypeList.size() > 0) {
			Random rand = new Random();
			int nowRand = rand.nextInt(vacationTypeList.size());

			System.out.println("Rand: " + nowRand);
			System.out.println("vacationTypeList.size(): " + vacationTypeList.size());
			vacationTypeList.get(Integer.valueOf(nowRand)).findElement(By.cssSelector("input[type*='checkbox']"))
					.click();
		}
	}

	public void selectRandomNumberOfDays() {
		element(daysNumberCheckboxContainer).waitUntilVisible();
		List<WebElement> daysNumberList = daysNumberCheckboxContainer
				.findElements(By.cssSelector(".aui-field-content"));

		if (daysNumberList.size() > 0) {
			Random rand = new Random();
			int nowRand = rand.nextInt(daysNumberList.size());

			System.out.println("Rand: " + nowRand);
			System.out.println("daysNumberList.size(): " + daysNumberList.size());
			daysNumberList.get(Integer.valueOf(nowRand)).findElement(By.cssSelector("input[type*='checkbox']")).click();
		}
	}

	public void selectRandomVacationStatus() {
		element(vacationStatusCheckboxContainer).waitUntilVisible();
		List<WebElement> vacationStatusList = vacationStatusCheckboxContainer
				.findElements(By.cssSelector(".aui-field-content"));

		if (vacationStatusList.size() > 0) {
			Random rand = new Random();
			int nowRand = rand.nextInt(vacationStatusList.size());

			System.out.println("Rand: " + nowRand);
			System.out.println("vacationStatusList.size(): " + vacationStatusList.size());
			vacationStatusList.get(Integer.valueOf(nowRand)).findElement(By.cssSelector("input[type*='checkbox']"))
					.click();
		}
	}

	public void selectShowFutureVacationsCheckbox() {
		futureVacationsCheckbox.click();
	}

	public void applySelectedFilters() {
		applyButton.click();
	}

	public void chooseNumberOfItemsPerPage() {
		itemsPerPage.click();
	}

	public void orderTableByEmployee() {
		orderByEmployee.click();
	}

	public void searchForVacationsOfEmployee() {
		Assert.assertTrue("Searched for vacations of existent employee",
				element(orderByEmployee).getText().contains("Employee"));
	}

	public void orderTableByStartDate() {
		orderByStartDate.click();
	}

	public void orderTableByEndDate() {
		orderByEndDate.click();
	}

	public void orderTableByModifiedDate() {
		orderByModifiedDate.click();
	}

	public void orderTableByLastUpdatedBy() {
		orderByLastUpdatedBy.click();
	}

	public void orderTableByApprover() {
		orderByApprover.click();
	}

	public void orderTableByDaysNumber() {
		orderByDaysNumber.click();
	}

	public void orderTableByType() {
		orderByType.click();
	}

	public void orderTableByStatus() {
		orderByStatus.click();
	}

	public void insertEmployeeName(String lastName, String firstName) {
		fieldLastName.type(lastName);
		fieldFirstName.type(firstName);
	}

}
