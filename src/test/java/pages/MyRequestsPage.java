package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helpers.Constants;
import helpers.MyRequestTableModel;
import java.util.Arrays;

@DefaultUrl(Constants.MY_REQUESTS_PAGE_URL)
public class MyRequestsPage extends PageObject {

	@FindBy(css = ".nav-list a[href*='menuItem=my-requests']")
	private WebElementFacade myRequestsMenuItem;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holidayCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade specialVacationCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade sickLeaveCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade maternityLeaveCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_futureVacationsCheckbox")
	private WebElementFacade futureVacationsCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade fifthCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElementFacade tenthCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElementFacade twentiethCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTIETHCheckbox")
	private WebElementFacade fiftiethCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElementFacade restCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade approvedCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
	private WebElementFacade rejectedCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
	private WebElementFacade withdrawnCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CANCELLEDCheckbox")
	private WebElementFacade cancelledCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade itemsPerpage;

	@FindBy(css = ".results-grid")
	private WebElement vacationListContainer;
	
	@FindBy(css = "aui-column column-three column-center ")
	private WebElementFacade daysNumberCheckboxField;
	
	@FindBy(css =".column-center.column-three:not(.aui-column-last) .aui-field-input-choice:not([value='ALL'])")
	public List<WebElementFacade> daysNumberList;
	
	
	@FindBy(css =".column-center.column-three:not(.aui-column-last) .aui-choice-label")
	public List<WebElementFacade> daysNumberListText;


	public void click_myRequestsMenuItem() {
		myRequestsMenuItem.click();
	}

	public void specialVacationCheckbox() {
		specialVacationCheckbox.click();
	}

	public void vacationWithoutPaymentCheckbox() {
		vacationWithoutPaymentCheckbox.click();
	}

	public void applyButton() {
		applyButton.click();
	}

	public void holidayCheckbox() {
		holidayCheckbox.click();
	}

	public void oneToFiveCheckbox() {
		fifthCheckbox.click();
	}

	public void tenthCheckbox() {
		tenthCheckbox.click();
	}

	public void sickLeaveCheckbox() {
		sickLeaveCheckbox.click();
	}

	public void maternityLeaveCheckbox() {
		maternityLeaveCheckbox.click();
	}

	public void futureVacationsCheckbox() {
		futureVacationsCheckbox.click();
	}

	public void twentiethCheckbox() {
		twentiethCheckbox.click();
	}

	public void fiftiethCheckbox() {
		fiftiethCheckbox.click();
	}

	public void restCheckbox() {
		restCheckbox.click();
	}

	public void pendingCheckbox() {
		pendingCheckbox.click();
	}

	public void approvedCheckbox() {
		approvedCheckbox.click();
	}

	public void rejectedCheckbox() {
		rejectedCheckbox.click();
	}

	public void withdrawnCheckbox() {
		withdrawnCheckbox.click();
	}

	public void cancelledCheckbox() {
		cancelledCheckbox.click();
	}

	public void itemsPerpage() {
		itemsPerpage.click();

	}

	public void verifyThatTypeIsCorrect(String type) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(4) a"));
		for (WebElement row : rows) {
			Assert.assertTrue("The row does not contain the expected type", row.getText().contentEquals(type));
		}
	}
	
	public void verifyThatStatusIsCorrect(String status) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(6) a"));
		for (WebElement row : rows) {
			Assert.assertTrue("The row does not contain the expected status", row.getText().contentEquals(status));
		}
	}
	
	
	public List<MyRequestTableModel> grabSimpleResultsList(){
		List<MyRequestTableModel> resultList = new ArrayList<MyRequestTableModel>();
		element(vacationListContainer).waitUntilVisible();
		List<WebElement> vacationEntryList = vacationListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		
		for (WebElement elementNow : vacationEntryList) {

			MyRequestTableModel entryNow = new MyRequestTableModel();
			
			String startDate = elementNow.findElement(By.cssSelector("td[class*='start.date']")).getText();
			String endDate = elementNow.findElement(By.cssSelector("td[class*='end.date']")).getText();
			String daysNumber = elementNow.findElement(By.cssSelector("td[class*='day.number']")).getText();
			String type = elementNow.findElement(By.cssSelector("td[class*='header.type']")).getText();
			String lastUpdated = elementNow.findElement(By.cssSelector("td[class*='header.type']")).getText();
			String status = elementNow.findElement(By.cssSelector("td[class*='header.status']")).getText();
			
			entryNow.setStartDate(startDate);
			entryNow.setEndDate(endDate);
			entryNow.setDaysNumber(daysNumber);
			entryNow.setType(type);
			entryNow.setLastUpdatedBy(lastUpdated);
			entryNow.setStatus(status);
			
			resultList.add(entryNow);
			
		}
		
		return resultList;
	}
	
	public List<MyRequestTableModel> grabResultsList() {

		List<MyRequestTableModel> resultList = new ArrayList<MyRequestTableModel>();
		element(vacationListContainer).waitUntilVisible();
		List<WebElement> vacationEntryList = vacationListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		for (WebElement webElement : vacationEntryList) {

			MyRequestTableModel entryNow = new MyRequestTableModel();
			String startDate = webElement.findElement(By.cssSelector("td[class*='start.date']")).getText();

			Date startDateActual = getDate(startDate);
			SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
			Date timeNow = new Date();
			String strDate = sdfDate.format(timeNow);
			Date timeNowActual = getDate(strDate);

			if (startDateActual.after(timeNowActual)) {
				System.out.println("Displayed date is in the future.");
			} else if (startDateActual.before(timeNowActual))
				Assert.fail("Dates in the pass are also displayed.");

			entryNow.setStartDate(startDate);
		}
		return resultList;
	}
	
	public void printDate() {

		System.out.println("This is the date " + getDate("12/09/2000"));
	}

	public Date getDate(String dateString) {
		Date date;
		SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
		String now = dateString;

		try {
			date = sdfDate.parse(now);
		} catch (Throwable e) {
			date = new Date();
			e.printStackTrace();
		}
		return date;
	}		
	
	public void verifyListDaysNumber(String filterValue) {
	String[] filterListValues =filterValue.split(" - ");
	System.out.println("filterListValues : " + filterListValues.toString());
	boolean isValid = true;
	
	if(filterListValues.length == 2){
		
		System.out.println("There are 2 items: " + filterListValues.length);
		int minValue = Integer.valueOf(filterListValues[0].trim());
		int maxValue = Integer.valueOf(filterListValues[1].trim());
		System.out.println("Maximum value : " + maxValue);
		System.out.println("Minimum value : " + minValue);
		for (WebElement webElement : daysNumberList) {
			System.out.println("New entry: " + webElement.getText());
			try{
				waitFor(webElement);
				int daysNow =  Integer.valueOf(webElement.getText().trim());
				
				System.out.println("Min Condition: " + (minValue >= daysNow));
				System.out.println("Max Condition: " + (maxValue <= daysNow));
				if((minValue >= daysNow || maxValue <= daysNow)){
					System.out.println("minValue: " + minValue);
					System.out.println("maxValue: " + maxValue);
					System.out.println("actualValue: " + daysNow);
					isValid = false;
				}
			}
			catch(NumberFormatException e){
				System.out.println("No values found! " + e);
				break;
			}
			
			
			waitABit(5161);
			Assert.assertTrue("Value is not as expected for entry: " + webElement.getText(), isValid);
		}
		
		
	}else{
		System.out.println("There are: " + filterListValues.length + " values.");
		if(filterListValues[0].trim().contains("ALL")){
			System.out.println("All Cases");
		}else{
			if(filterListValues[0].trim().contains("+")){
				System.out.println("+51 case");
					}
				}
			}
		}
	
	public String randomNumberOfDays() {
		
			Random rand = new Random();
			
			int nowRand = rand.nextInt(daysNumberListText.size());

			System.out.println("Rand: " + nowRand);
			System.out.println("daysNumberList.size(): " + daysNumberList.size());
			daysNumberListText.get(nowRand).click();
			System.out.println("Selected value is: " + daysNumberListText.get(nowRand).getText());
			return daysNumberListText.get(nowRand).getText().toString();
		
	}
}
