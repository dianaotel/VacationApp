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

	public void selectVacationTypesALLCheckbox() {
		allVacationTypesCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holidayCheckbox;

	public void selectHolidayCheckbox() {
		holidayCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentCheckbox;

	public void selectVacationWithoutPaymentCheckbox() {
		vacationWithoutPaymentCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade specialVacationCheckbox;

	public void selectSpecialVacationCheckbox() {
		specialVacationCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade sickLeaveCheckbox;

	public void selectSickLeaveCheckbox() {
		sickLeaveCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade maternityLeaveCheckbox;

	public void selectMaternityLeaveCheckbox() {
		maternityLeaveCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_futureVacationsCheckbox")
	private WebElementFacade futureVacationsCheckbox;

	public void selectShowFutureVacationsCheckbox() {
		futureVacationsCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade oneFiveCheckbox;

	public void selectOneToFiveCheckbox() {
		oneFiveCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewDaysNumberALLCheckbox")
	private WebElementFacade allDaysNumberCheckbox;

	public void selectDaysNumberALLCheckbox() {
		allDaysNumberCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElementFacade sixTenCheckbox;

	public void selectSixToTenCheckbox() {
		sixTenCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElementFacade elevenTwentyCheckbox;

	public void selectElevenToTwentyCheckbox() {
		elevenTwentyCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTIETHCheckbox")
	private WebElementFacade twentyoneFiftyCheckbox;

	public void selectTwentyoneToFiftyCheckbox() {
		twentyoneFiftyCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElementFacade fiftyonePlusCheckbox;

	public void selectFiftyonePlusCheckbox() {
		fiftyonePlusCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationStatusALLCheckbox")
	private WebElementFacade allVacationStatusCheckbox;

	public void selectVacationStatusALLCheckbox() {
		allVacationStatusCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckbox;

	public void selectPendingVacations() {
		pendingCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade approvedCheckbox;

	public void selectApprovedVacations() {
		approvedCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
	private WebElementFacade rejectedCheckbox;

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
