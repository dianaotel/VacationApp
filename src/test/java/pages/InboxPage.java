package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;

import helpers.Constants;

@DefaultUrl(Constants.INBOX_URL)
public class InboxPage extends PageObject {

	@FindBy(name = "_evovacation_WAR_EvoVacationportlet_rowIds")
	private WebElementFacade checkBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_multipleApproveButton")
	private WebElementFacade approveButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_multipleRejectButton")
	private WebElementFacade rejectButton;

	public void approveVacationRequest() {
		checkBox.click();
		approveButton.click();
	}

	public void rejectVacationRequest() {
		checkBox.click();
		rejectButton.click();
	}

	@FindBy(css = ".portlet-msg-success")
	private WebElementFacade approveOrRejectRequestConfirmationMessage;

	public void checkConfirmationMessageForApprovedRequest() {
		Assert.assertTrue("Request was approved",
				element(approveOrRejectRequestConfirmationMessage).getText().contains("Your request completed successfully."));
	}
	
	public void checkConfirmationMessageForRejectedRequest() {
		Assert.assertTrue("Request was rejected",
				element(approveOrRejectRequestConfirmationMessage).getText().contains("Your request completed successfully."));
	}
}
