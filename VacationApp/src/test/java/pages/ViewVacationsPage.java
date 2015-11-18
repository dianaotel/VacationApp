package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import helpers.Constants;

@DefaultUrl(Constants.VIEW_VACATIONS_URL)
public class ViewVacationsPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_vacationTypeALLCheckbox")
	private WebElementFacade allVacationTypesCheckbox;

	public void selectAllVacationTypesCheckbox() {
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

	public void selectOneFiveCheckbox() {
		oneFiveCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewDaysNumberALLCheckbox")
	private WebElementFacade allDaysNumberCheckbox;

	public void selectAllDaysNumberCheckbox() {
		allDaysNumberCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElementFacade sixTenCheckbox;

	public void selectSixTenCheckbox() {
		sixTenCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElementFacade elevenTwentyCheckbox;

	public void selectElevenTwentyCheckbox() {
		elevenTwentyCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTIETHCheckbox")
	private WebElementFacade twentyoneFiftyCheckbox;

	public void selectTwentyoneFiftyCheckbox() {
		twentyoneFiftyCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElementFacade fiftyonePlusCheckbox;

	public void selectFiftyonePlusCheckbox() {
		fiftyonePlusCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationStatusALLCheckbox")
	private WebElementFacade allVacationStatusCheckbox;

	public void selectAllVacationStatusCheckbox() {
		allVacationStatusCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckbox;

	public void selectPendingCheckbox() {
		pendingCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade approvedCheckbox;

	public void selectApprovedCheckbox() {
		approvedCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
	private WebElementFacade rejectedCheckbox;

	public void selectRejectedCheckbox() {
		rejectedCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
	private WebElementFacade withdrawnCheckbox;

	public void selectWithdrawnCheckbox() {
		withdrawnCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CANCELLEDCheckbox")
	private WebElementFacade cancelledCheckbox;

	public void selectCancelledCheckbox() {
		cancelledCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	public void selectApplyButton() {
		applyButton.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerPage;

	public void chooseItemsPerPage() {
		itemsPerPage.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade fieldLastName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade fieldFirstName;

	public void typeName(String lastName, String firstName) {
		fieldLastName.type(lastName);
		fieldFirstName.type(firstName);
	}
	
	@FindBy(css="a[href*='orderByCol=employee']")
	private WebElementFacade orderByEmployee;
	
	public void orderByEmployee() {
		orderByEmployee.click();
	}
	
	@FindBy(css="a[href*='orderByCol=startDate']")
	private WebElementFacade orderByStartDate;
	
	public void orderByStartDate() {
		orderByStartDate.click();
	}
	
	@FindBy(css="a[href*='orderByCol=endDate']")
	private WebElementFacade orderByEndDate;
	
	public void orderByEndDate() {
		orderByEndDate.click();
	}
	
	@FindBy(css="a[href*='orderByCol=modifiedDate']")
	private WebElementFacade orderByModifiedDate;
	
	public void orderByModifiedDate() {
		orderByModifiedDate.click();
	}
	
	@FindBy(css="a[href*='orderByCol=lastUpdate']")
	private WebElementFacade orderByLastUpdatedBy;
	
	public void orderByLastUpdatedBy() {
		orderByLastUpdatedBy.click();
	}
	
	@FindBy(css="a[href*='orderByCol=assignee']")
	private WebElementFacade orderByApprover;
	
	public void orderByApprover() {
		orderByApprover.click();
	}
	
	@FindBy(css="a[href*='orderByCol=daysNr']")
	private WebElementFacade orderByDaysNumber;
	
	public void orderByDaysNumber() {
		orderByDaysNumber.click();
	}
	
	@FindBy(css="a[href*='orderByCol=type']")
	private WebElementFacade orderByType;
	
	public void orderByType() {
		orderByType.click();
	}
	
	@FindBy(css="a[href*='orderByCol=status']")
	private WebElementFacade orderByStatus;
	
	public void orderByStatus() {
		orderByStatus.click();
	}
}
