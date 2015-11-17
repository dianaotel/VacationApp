package pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DatePickerPage extends PageObject {

	@FindBy(name = "startDate")
	private WebElementFacade startDate;

	@FindBy(name = "endDate")
	private WebElementFacade endDate;

	@FindBy(css = "[style*='display: block'] .dp_caption")
	private WebElementFacade title;

	@FindBy(css = "[style*='display: block'] .dp_yearpicker td:not([class*='not'])")
	private List<WebElementFacade> yearList;

	@FindBy(css = "[style*='display: block'] .dp_monthpicker td:not([class*='not'])")
	private List<WebElementFacade> monthList;

	@FindBy(css = "[style*='display: block'] .dp_daypicker td:not([class*='not'])")
	private List<WebElementFacade> dayList;

	public void StartDate() {
		startDate.click();
	}

	public void EndDate() {
		endDate.click();
	}

	public void setDate(int day, String month, int year) {

		title.click();
		title.click();

		for (WebElementFacade i : yearList)
			if (i.getText().contentEquals(Integer.toString(year))) {
				i.click();
				break;
			}

		for (WebElementFacade i : monthList)
			if (i.getText().contentEquals(month)) {
				i.click();
				break;
			}

		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
			}
	}

}
