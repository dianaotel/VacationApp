package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import org.junit.Assert;

import helpers.Constants;

@DefaultUrl(Constants.VIEW_VACATIONS_URL)
public class ViewVacationsPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_vacationTypeALLCheckbox")
	private WebElementFacade allVacationTypesCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holidayCheckbox;

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
	private WebElementFacade oneFiveCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewDaysNumberALLCheckbox")
	private WebElementFacade allDaysNumberCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElementFacade sixTenCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElementFacade elevenTwentyCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTIETHCheckbox")
	private WebElementFacade twentyoneFiftyCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElementFacade fiftyonePlusCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationStatusALLCheckbox")
	private WebElementFacade allVacationStatusCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade approvedCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
	private WebElementFacade rejectedCheckbox;

	public void selectVacationTypesALLCheckbox() {
		allVacationTypesCheckbox.click();
	}

	public void selectHolidayCheckbox() {
		holidayCheckbox.click();
	}

	public void selectVacationWithoutPaymentCheckbox() {
		vacationWithoutPaymentCheckbox.click();
	}

	public void selectSpecialVacationCheckbox() {
		specialVacationCheckbox.click();
	}

	public void selectSickLeaveCheckbox() {
		sickLeaveCheckbox.click();
	}

	public void selectMaternityLeaveCheckbox() {
		maternityLeaveCheckbox.click();
	}

	public void selectShowFutureVacationsCheckbox() {
		futureVacationsCheckbox.click();
	}

	public void selectOneToFiveCheckbox() {
		oneFiveCheckbox.click();
	}

	public void selectDaysNumberALLCheckbox() {
		allDaysNumberCheckbox.click();
	}

	public void selectSixToTenCheckbox() {
		sixTenCheckbox.click();
	}

	public void selectElevenToTwentyCheckbox() {
		elevenTwentyCheckbox.click();
	}

	public void selectTwentyoneToFiftyCheckbox() {
		twentyoneFiftyCheckbox.click();
	}

	public void selectFiftyonePlusCheckbox() {
		fiftyonePlusCheckbox.click();
	}

	public void selectVacationStatusALLCheckbox() {
		allVacationStatusCheckbox.click();
	}

	public void selectPendingVacations() {
		pendingCheckbox.click();
	}

	public void selectApprovedVacations() {
		approvedCheckbox.click();
	}

	public void selectRejectedVacations() {
		rejectedCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
	private WebElementFacade withdrawnCheckbox;

	public void selectWithdrawnVacations() {
		withdrawnCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CANCELLEDCheckbox")
	private WebElementFacade cancelledCheckbox;

	public void selectCancelledVacations() {
		cancelledCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	public void applySelectedFilters() {
		applyButton.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerPage;

	public void chooseNumberOfItemsPerPage() {
		itemsPerPage.click();
	}

	@FindBy(css = "a[href*='orderByCol=employee']")
	private WebElementFacade orderByEmployee;

	public void orderTableByEmployee() {
		orderByEmployee.click();
	}

	public void searchForVacationsOfEmployee() {
		Assert.assertTrue("Searched for vacations of existent employee",
				element(orderByEmployee).getText().contains("Employee"));
	}

	@FindBy(css = "a[href*='orderByCol=startDate']")
	private WebElementFacade orderByStartDate;

	public void orderTableByStartDate() {
		orderByStartDate.click();
	}

	@FindBy(css = "a[href*='orderByCol=endDate']")
	private WebElementFacade orderByEndDate;

	public void orderTableByEndDate() {
		orderByEndDate.click();
	}

	@FindBy(css = "a[href*='orderByCol=modifiedDate']")
	private WebElementFacade orderByModifiedDate;

	public void orderTableByModifiedDate() {
		orderByModifiedDate.click();
	}

	@FindBy(css = "a[href*='orderByCol=lastUpdate']")
	private WebElementFacade orderByLastUpdatedBy;

	public void orderTableByLastUpdatedBy() {
		orderByLastUpdatedBy.click();
	}

	@FindBy(css = "a[href*='orderByCol=assignee']")
	private WebElementFacade orderByApprover;

	public void orderTableByApprover() {
		orderByApprover.click();
	}

	@FindBy(css = "a[href*='orderByCol=daysNr']")
	private WebElementFacade orderByDaysNumber;

	public void orderTableByDaysNumber() {
		orderByDaysNumber.click();
	}

	@FindBy(css = "a[href*='orderByCol=type']")
	private WebElementFacade orderByType;

	public void orderTableByType() {
		orderByType.click();
	}

	@FindBy(css = "a[href*='orderByCol=status']")
	private WebElementFacade orderByStatus;

	public void orderTableByStatus() {
		orderByStatus.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade fieldLastName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade fieldFirstName;

	public void insertEmployeeName(String lastName, String firstName) {
		fieldLastName.type(lastName);
		fieldFirstName.type(firstName);
	}

}
