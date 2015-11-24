package pages;

import java.util.List;
import java.util.Random;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import helpers.Constants;

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
	
	@FindBy(css = ".align-left.col-1.col-last-name.first.valign-middle")
	private WebElementFacade lastNameTableRow;

	public void clickDropDownMonth() {
		dropDownMonth.click();
	}

	public void selectRandomMonth() {
		element(dropDownMonth).waitUntilVisible();
		List<String> monthList = element(dropDownMonth).getSelectOptions();

		Random rand = new Random();
		int nowRand = rand.nextInt(monthList.size());

		element(dropDownMonth).selectByVisibleText(monthList.get(nowRand));
	}

	public void selectRandomYear() {
		element(dropDownYear).waitUntilVisible();
		List<String> yearList = element(dropDownYear).getSelectOptions();

		Random rand = new Random();
		int nowRand = rand.nextInt(yearList.size());

		element(dropDownYear).selectByVisibleText(yearList.get(nowRand));
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
	
	public void checkIfSearchForPmsReportIsCorrect() {
		Assert.assertTrue("Correct search for vacations report of existent employee",
				element(lastNameTableRow).getText().contains(Constants.PM_LAST_NAME));
	}
	
	public void checkIfSearchForTesterReportIsCorrect() {
		Assert.assertTrue("Correct search for vacations report of existent employee",
				element(lastNameTableRow).getText().contains(Constants.TESTER_LAST_NAME));
	}

}