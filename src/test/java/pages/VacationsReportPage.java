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

@DefaultUrl(Constants.VACATIONS_REPORT_URL)
public class VacationsReportPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportMonth")
	private WebElementFacade dropDownMonth;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportYear")
	private WebElementFacade dropDownYear;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_approved")
	private WebElementFacade radioButtonApproved;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_pending")
	private WebElementFacade radioButtonPending;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade buttonExport;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportLastName")
	private WebElementFacade fieldLastName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportFirstName")
	private WebElementFacade fieldFirstName;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_searchButton")
	private WebElementFacade searchButton;
	
	public void clickDropDownMonth() {
		dropDownMonth.click();
	}

	public void selectRandomMonth() {
		element(dropDownMonth).waitUntilVisible();
		List<WebElement> monthList = dropDownMonth
				.findElements(By.id("_evovacation_WAR_EvoVacationportlet_exportMonth"));

		if (monthList.size() > 0) {
			Random rand = new Random();
			int nowRand = rand.nextInt(monthList.size());

			System.out.println("Rand: " + nowRand);
			System.out.println("monthList.size(): " + monthList.size());
			monthList.get(Integer.valueOf(nowRand))
					.findElement(By.id("_evovacation_WAR_EvoVacationportlet_exportMonth")).click();
		}
	}

	public void clickDropDownYear() {
		dropDownYear.click();
	}

	public void selectRandomYear() {
		element(dropDownYear).waitUntilVisible();
		List<WebElement> yearList = dropDownMonth.findElements(By.id("_evovacation_WAR_EvoVacationportlet_exportYear"));

		if (yearList.size() > 0) {
			Random rand = new Random();
			int nowRand = rand.nextInt(yearList.size());

			System.out.println("Rand: " + nowRand);
			System.out.println("yearList.size(): " + yearList.size());
			yearList.get(Integer.valueOf(nowRand)).findElement(By.id("_evovacation_WAR_EvoVacationportlet_exportYear"))
					.click();
		}
	}

	public void selectApprovedStatusRadioButton() {
		radioButtonApproved.click();
	}

	public void selectPendingStatusRadioButton() {
		radioButtonPending.click();
	}

	public void clickExportButton() {
		buttonExport.click();
	}

	public void insertEmployeeName(String lastName, String firstName) {
		fieldLastName.type(lastName);
		fieldFirstName.type(firstName);
	}
	
	public void clickSearhButton() {
		searchButton.click();
	}
	
}