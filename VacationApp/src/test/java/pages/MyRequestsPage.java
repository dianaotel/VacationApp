package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helpers.Constants;
import helpers.MyRequestTableModel;

@DefaultUrl(Constants.MY_REQUESTS_PAGE_URL)
public class MyRequestsPage extends PageObject {

	@FindBy(css = ".nav-list a[href*='menuItem=my-requests']")
	private WebElementFacade myRequestsMenuItem;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holidayCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade specialVacationCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade sickLeaveCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade maternityLeaveCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_futureVacationsCheckbox")
	private WebElementFacade futureVacationsCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade fifthCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElementFacade tenthCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElementFacade twentiethCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTIETHCheckbox")
	private WebElementFacade fiftiethCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElementFacade restCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade approvedCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
	private WebElementFacade rejectedCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
	private WebElementFacade withdrawnCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CANCELLEDCheckbox")
	private WebElementFacade cancelledCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerpage;

	@FindBy(css = ".results-grid")
	private WebElement vacationListContainer;

	public void click_myRequestsMenuItem() {
		myRequestsMenuItem.click();
	}

	public void specialVacationCheckbox() {
		specialVacationCheckbox.click();
	}

	public void vacationWithoutPaymentCheckbox() {
		vacationWithoutPaymentCheckbox.click();
	}

	public void applyButton() {
		applyButton.click();
	}

	public void holidayCheckbox() {
		holidayCheckbox.click();
	}

	public void oneToFiveCheckbox() {
		fifthCheckbox.click();
	}

	public void tenthCheckbox() {
		tenthCheckbox.click();
	}

	public void sickLeaveCheckbox() {
		sickLeaveCheckbox.click();
	}

	public void maternityLeaveCheckbox() {
		maternityLeaveCheckbox.click();
	}

	public void futureVacationsCheckbox() {
		futureVacationsCheckbox.click();
	}

	public void twentiethCheckbox() {
		twentiethCheckbox.click();
	}

	public void fiftiethCheckbox() {
		fiftiethCheckbox.click();
	}

	public void restCheckbox() {
		restCheckbox.click();
	}

	public void pendingCheckbox() {
		pendingCheckbox.click();
	}

	public void approvedCheckbox() {
		approvedCheckbox.click();
	}

	public void rejectedCheckbox() {
		rejectedCheckbox.click();
	}

	public void withdrawnCheckbox() {
		withdrawnCheckbox.click();
	}

	public void cancelledCheckbox() {
		cancelledCheckbox.click();
	}

	public void itemsPerpage() {
		itemsPerpage.click();

	}

	public void verifyThatTypeIsCorrect(String type) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(4) a"));
		for (WebElement row : rows) {
			Assert.assertTrue("The row does not contains the expected type", row.getText().contentEquals(type));
		}
	}

	public List<MyRequestTableModel> grabResultsList() {

		List<MyRequestTableModel> resultList = new ArrayList<MyRequestTableModel>();
		element(vacationListContainer).waitUntilVisible();
		List<WebElement> vacationEntryList = vacationListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		for (WebElement webElement : vacationEntryList) {
			// System.out.println("Element: " + webElement.getText());
			MyRequestTableModel entryNow = new MyRequestTableModel();

			String startDate = webElement.findElement(By.cssSelector("td[class*='start.date']")).getText();
			String endDate = webElement.findElement(By.cssSelector("td[class*='end.date']")).getText();
			String dayNumber = webElement.findElement(By.cssSelector("td[class*='day.number']")).getText();
			String type = webElement.findElement(By.cssSelector("td[class*='type']")).getText();
			String lastUpdate = webElement.findElement(By.cssSelector("td[class*='last.update']")).getText();
			String status = webElement.findElement(By.cssSelector("td[class*='header.status']")).getText();

			entryNow.setStartDate(startDate);
			entryNow.setEndDate(endDate);
			entryNow.setDaysNumber(dayNumber);
			entryNow.setType(type);
			entryNow.setLastUpdatedBy(lastUpdate);
			entryNow.setStatus(status);

		}

		return resultList;
	}
}
