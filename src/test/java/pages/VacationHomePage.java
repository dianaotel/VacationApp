package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import helpers.Constants;

@DefaultUrl(Constants.VACATION_URL)
public class VacationHomePage extends PageObject {

	@FindBy(css = "a[href*='menuItem=inbox']")
	private WebElementFacade inboxButton;

	@FindBy(css = "a[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacationsButton;

	@FindBy(css = "a[href*='menuItem=vacation-report']")
	private WebElementFacade vacationsReportButton;

	@FindBy(css = "a[href*='menuItem=new-request']")
	private WebElementFacade createNewVacationRequestButton;

	@FindBy(css = "a[href*='menuItem=my-free-days']")
	private WebElementFacade myFreeDaysButton;

	@FindBy(css = "a[href*='menuItem=vacation-tracker']")
	private WebElementFacade trackButton;

	public void goToMyFreeDays() {
		myFreeDaysButton.click();
	}

	public void createNewVacationRequestTab() {
		createNewVacationRequestButton.click();
	}

	public void goToInbox() {
		inboxButton.click();
	}

	public void goToViewVacations() {
		viewVacationsButton.click();
	}

	public void goToVacationsReport() {
		vacationsReportButton.click();
	}

}
