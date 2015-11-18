package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import static ch.lambdaj.Lambda.convert;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ch.lambdaj.function.convert.Converter;
import helpers.Constants;

@DefaultUrl(Constants.MY_REQUESTS_PAGE_URL)
public class MyRequestsPage extends PageObject {

	@FindBy(css = ".nav-list a[href*='menuItem=my-requests']")
	private WebElementFacade myRequestsMenuItem;

	public void click_myRequestsMenuItem() {
		myRequestsMenuItem.click();
	}
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holidayCheckbox;
	
	public void holidayCheckbox(){
		holidayCheckbox.click();
	}
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton ;
	
	public void applyButton() {
		applyButton.click();
	}
	
	@FindBy(id ="_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentCheckbox;
	
	public void vacationWithoutPaymentCheckbox(){
		vacationWithoutPaymentCheckbox.click();
	}
	
	@FindBy(id ="_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade specialVacationCheckbox;
	
	public void specialVacationCheckbox(){
		specialVacationCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade sickLeaveCheckbox;
	
	public void sickLeaveCheckbox(){
		sickLeaveCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade maternityLeaveCheckbox ;
	
	public void maternityLeaveCheckbox(){
		maternityLeaveCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_futureVacationsCheckbox")
	private WebElementFacade futureVacationsCheckbox;
	
	public void futureVacationsCheckbox(){
		futureVacationsCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade fifthCheckbox;
	
	public void oneToFiveCheckbox(){
		fifthCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElementFacade tenthCheckbox;
	
	public void tenthCheckbox(){
		tenthCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElementFacade twentiethCheckbox;
	
	public void twentiethCheckbox(){
		twentiethCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElementFacade restCheckbox;
	
	public void restCheckbox(){
		restCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckbox;
	
	public void pendingCheckbox(){
		pendingCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade approvedCheckbox;
	
	public void approvedCheckbox(){
		approvedCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
	private WebElementFacade rejectedCheckbox;
	
	public void rejectedCheckbox(){
		rejectedCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
	private WebElementFacade withdrawnCheckbox;
	
	public void withdrawnCheckbox(){
		withdrawnCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_CANCELLEDCheckbox")
	private WebElementFacade cancelledCheckbox;
	
	public void cancelledCheckbox(){
		cancelledCheckbox.click();
	}
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerpage;
	
	public void itemsPerpage(){
		itemsPerpage.click();
	}
}

