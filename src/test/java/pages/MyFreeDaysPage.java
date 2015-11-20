package pages;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.MY_FREE_DAYS_URL)
public class MyFreeDaysPage extends PageObject {
	
	NewVacationRequestPage newVacationRequestPage;

	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/table/tbody/tr[9]/td[2]")
	private WebElementFacade freeDaysNr;

	public boolean isNrOfFreeDaysEqual() {
		if (Integer.parseInt(freeDaysNr.getText()) == newVacationRequestPage.getNumberOfVacationDaysLeft()) {
			return true;
		}
		return false;
	}
}
