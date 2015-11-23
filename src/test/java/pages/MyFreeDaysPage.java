package pages;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.MY_FREE_DAYS_URL)
public class MyFreeDaysPage extends PageObject {

	NewVacationRequestPage newVacationRequestPage;

	@FindBy(css = "div[id='2015'] .section-result > td:last-child")
	private WebElementFacade freeDaysNrTextField;

	public String getNrOfFreeDays() {
		element(freeDaysNrTextField).waitUntilVisible();
		String nrOfVacationDaysLeft = freeDaysNrTextField.getText().trim();
		return nrOfVacationDaysLeft;
	}
}
