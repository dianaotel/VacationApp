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

	public void inboxButton() {
		inboxButton.click();
	}
	
	@FindBy(css = "a[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacationsButton;
	
	public void viewVacationsButton() {
		viewVacationsButton.click();
	}
}
