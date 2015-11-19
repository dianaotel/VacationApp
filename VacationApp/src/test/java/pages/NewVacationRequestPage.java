package pages;

import java.util.List;

import org.junit.Assert;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.NEW_VACATION_REQUEST_URL)
public class NewVacationRequestPage extends PageObject {

	@FindBy(name = "startDate")
	private WebElementFacade startDate;

	@FindBy(name = "endDate")
	private WebElementFacade endDate;

	@FindBy(css = "a[href*='menuItem=new-request']")
	private WebElementFacade createNewVacationRequestButton;

	@FindBy(css = "[title~=odihna]")
	private WebElementFacade holiday;

	@FindBy(css = "[title~=plata]")
	private WebElementFacade vacationWithoutPayment;

	@FindBy(css = "[title~=medical]")
	private WebElementFacade sickLeave;

	@FindBy(css = "[title=Concediu special]")
	private WebElementFacade concediuSpecial;

	@FindBy(css = "[class=optionalComment]")
	private WebElementFacade addCommentButton;

	@FindBy(css = "[name=commentContent]")
	private WebElementFacade commentBox;

	@FindBy(css = "[value=Save]")
	private WebElementFacade saveButton;

	@FindBy(css = "[value=Cancel]")
	private WebElementFacade cancelButton;

	@FindBy(css = "[class=portlet-msg-success]")
	private WebElementFacade vacationRequestConfirmationMessage;

	public void startDate() {
		startDate.click();
	}

	public void endDate() {
		endDate.click();
	}

	public void createNewVacationRequestTab() {
		createNewVacationRequestButton.click();
	}

	public void holiday() {
		holiday.click();
	}

	public void vacationWithoutPayment() {
		vacationWithoutPayment.click();
	}

	public void sickLeave() {
		sickLeave.click();
	}

	public void addComment(String comment) {
		addCommentButton.click();
		commentBox.sendKeys(comment);
	}

	public void saveVacationRequest() {
		saveButton.click();
	}

	public void cancelVacationRequest() {
		cancelButton.click();
	}

	public void vacationRequestConfirmationMessage() {
		Assert.assertTrue("Request was created",
				element(vacationRequestConfirmationMessage).getText().contains("Your request completed successfully."));
	}

}
