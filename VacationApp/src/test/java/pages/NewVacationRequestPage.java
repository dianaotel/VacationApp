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

	@FindBy(css = "a[href*='menuItem=new-request']")
	private WebElementFacade createNewVacationRequestButton;

	public void CreateNewVacationRequestTab() {
		createNewVacationRequestButton.click();
	}

	@FindBy(css = "[title~=odihna]")
	private WebElementFacade holiday;

	public void Holiday() {
		holiday.click();
	}

	@FindBy(css = "[title~=plata]")
	private WebElementFacade vacationWithoutPayment;

	public void VacationWithoutPayment() {
		vacationWithoutPayment.click();
	}

	@FindBy(css = "[title~=medical]")
	private WebElementFacade sickLeave;

	public void SickLeave() {
		sickLeave.click();
	}
	
	@FindBy(css = "[title=Concediu special]")
	private WebElementFacade concediuSpecial;
	
	@FindBy(css="[class=optionalComment]")
	private WebElementFacade addCommentButton;
	
	@FindBy(css="[name=commentContent]")
	private WebElementFacade commentBox;
	
	public void AddComment(String comment){
		addCommentButton.click();
		commentBox.sendKeys(comment);
	}
	

	@FindBy(css="[value=Save]")
	private WebElementFacade saveButton;

	public void SaveVacationRequest() {
		saveButton.click();
	}

	@FindBy(css="[value=Cancel]")
	private WebElementFacade cancelButton;

	public void CancelVacationRequest() {
		cancelButton.click();
	}
	
	@FindBy(css="[class=portlet-msg-success]")
	private WebElementFacade vacationRequestConfirmationMessage;
	
	public void VacationRequestConfirmationMessage(){
	Assert.assertTrue("Request was created", element(vacationRequestConfirmationMessage).getText().contains("Your request completed successfully.")); 
	}

	

}
