package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import helpers.Constants;

@DefaultUrl(Constants.INBOX_URL)
public class InboxPage extends PageObject {

	@FindBy(name="_evovacation_WAR_EvoVacationportlet_rowIds") //trebuie sa pun checkboxurile intr-o lista
	private WebElementFacade checkFirstBox;

	@FindBy(id = "aui_3_4_0_1_1383") 
	private WebElementFacade checkSecondBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_multipleApproveButton")
	private WebElementFacade approveButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_multipleRejectButton")
	private WebElementFacade rejectButton;

	public void approveRequest() {
		checkFirstBox.click();
		approveButton.click();
	}

	public void rejectRequest() {
		checkSecondBox.click();
		rejectButton.click();
	}
}
