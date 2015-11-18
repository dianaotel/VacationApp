package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import helpers.Constants;

import helpers.Constants;

@DefaultUrl(Constants.FREE_DAYS_HISTORY_URL)

public class FreeDaysHistoryPage extends PageObject {

	@FindBy(id = ".nav-list a[href*='menuItem=free-days-history']")
	private WebElementFacade freeDaysHistoryMenuItem;

	public void click_freeDaysHistoryMenuItem() {
		freeDaysHistoryMenuItem.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	public void applyButton() {
		applyButton.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_BONUS_EVOZONCheckbox")
	private WebElementFacade anniversaryCheckbox;

	public void anniversaryCheckbox() {
		anniversaryCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_EXTRA_DAYSCheckbox")
	private WebElementFacade extraDaysCheckbox;

	public void extraDaysCheckbox() {
		extraDaysCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_COCheckbox")
	private WebElementFacade vacationCheckbox;

	public void vacationCheckbox() {
		vacationCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentCheckbox;

	public void vacationWithoutPaymentCheckbox() {
		vacationWithoutPaymentCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade maternityLeaveCheckbox;

	public void maternityLeaveCheckbox() {
		maternityLeaveCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade fifthCheckbox;

	public void oneToFiveCheckbox() {
		fifthCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElementFacade tenthCheckbox;

	public void tenthCheckbox() {
		tenthCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElementFacade twentiethCheckbox;

	public void twentiethCheckbox() {
		twentiethCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElementFacade restCheckbox;

	public void restCheckbox() {
		restCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_ADDED_DAYSCheckbox")
	private WebElementFacade addedDaysCheckbox;

	public void addedDaysCheckbox() {
		addedDaysCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_REMOVED_DAYSCheckbox")
	private WebElementFacade removedDaysCheckbox;

	public void removedDaysCheckbox() {
		removedDaysCheckbox.click();
	}

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerpage;

	public void itemsPerpage() {
		itemsPerpage.click();
	}
}
