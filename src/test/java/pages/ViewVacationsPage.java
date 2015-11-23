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

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade fieldLastName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade fieldFirstName;

	@FindBy(css = "a[href*='orderByCol=employee']")
	private WebElementFacade orderByEmployee;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerPage;

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

	public void insertEmployeeName(String lastName, String firstName) {
		fieldLastName.type(lastName);
		fieldFirstName.type(firstName);
	}

	public void orderTableByEmployee() {
		orderByEmployee.click();
	}

	public void searchForVacationsOfEmployee() {
		Assert.assertTrue("Searched for vacations of existent employee",
				element(orderByEmployee).getText().contains("Employee"));
	}

	public void applySelectedFilters() {
		applyButton.click();
	}

	public void chooseNumberOfItemsPerPage() {
		itemsPerPage.click();
	}

}
