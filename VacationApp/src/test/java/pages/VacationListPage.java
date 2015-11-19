package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import tools.VacationEntryModel;

public class VacationListPage extends PageObject {

	
	@FindBy(css = ".results-grid")
	private WebElement vacationListContainer;
	
	public List<VacationEntryModel> grabResultsList(){
		
		List<VacationEntryModel> resultList = new ArrayList<VacationEntryModel>();
		element(vacationListContainer).waitUntilVisible();
		List<WebElement> vacationEntryList = vacationListContainer.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		for (WebElement webElement : vacationEntryList) {
//			System.out.println("Element: " + webElement.getText());
			VacationEntryModel entryNow = new VacationEntryModel();
			
			String startDate = webElement.findElement(By.cssSelector("td[class*='start.date']")).getText();
			String endDate = webElement.findElement(By.cssSelector("td[class*='end.date']")).getText();
			String dayNumber = webElement.findElement(By.cssSelector("td[class*='day.number']")).getText();
			String type = webElement.findElement(By.cssSelector("td[class*='type']")).getText();
			String lastUpdate = webElement.findElement(By.cssSelector("td[class*='last.update']")).getText();
			String status = webElement.findElement(By.cssSelector("td[class*='header.status']")).getText();
			
			entryNow.setStartDate(startDate);
			entryNow.setEndDate(endDate);
			entryNow.setDaysNumber(dayNumber);
			entryNow.setType(type);
			entryNow.setLastUpdatedBy(lastUpdate);
			entryNow.setStatus(status);
			
		}
		
		
		return resultList;
	}
}
