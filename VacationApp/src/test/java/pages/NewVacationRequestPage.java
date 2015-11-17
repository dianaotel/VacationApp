package pages;

import java.util.List;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation&_evovacation_WAR_EvoVacationportlet_menuItem=new-request")
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
