package pages;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import helpers.Constants;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.NEW_VACATION_REQUEST_URL)
public class NewVacationRequestPage extends PageObject {

	@FindBy(name = "startDate")
	private WebElementFacade startDate;

	@FindBy(name = "endDate")
	private WebElementFacade endDate;

	@FindBy(css = ".vacationType")
	private WebElement vacationRadioButtonsContainer;

	@FindBy(css = "a[href*='menuItem=new-request']")
	private WebElementFacade createNewVacationRequestButton;

	@FindBy(css = "[title~=odihna]")
	private WebElementFacade holiday;

	@FindBy(css = "[title~=plata]")
	private WebElementFacade vacationWithoutPayment;

	@FindBy(css = "[title~=medical]")
	private WebElementFacade sickLeave;

	@FindBy(css = "[title=Concediu special]")
	private WebElementFacade concediuSpecial;

	@FindBy(css = ".optionalComment")
	private WebElementFacade addCommentButton;

	@FindBy(css = "[name=commentContent]")
	private WebElementFacade commentBox;

	@FindBy(css="[value=Save]")
	private WebElementFacade saveButton;

	@FindBy(css = "[value=Cancel]")
	private WebElementFacade cancelButton;

	@FindBy(css = "[class=portlet-msg-success]")
	private WebElementFacade vacationRequestConfirmationMessage;

	public void startDate() {
		startDate.click();
	}

	public void endDate() {
		endDate.click();
	}

	public void createNewVacationRequestTab() {
		createNewVacationRequestButton.click();
	}

	public void holiday() {
		holiday.click();
	}

	public void vacationWithoutPayment() {
		vacationWithoutPayment.click();
	}

	public void sickLeave() {
		sickLeave.click();
	}

	public void addComment(String comment) {
		addCommentButton.click();
		commentBox.sendKeys(comment);
	}

	

	public void saveVacationRequest() {
		saveButton.click();
	}



	public void cancelVacationRequest() {
		cancelButton.click();
	}

	
	public void vacationRequestConfirmationMessage() {	
		Assert.assertTrue("Request was created",
				element(vacationRequestConfirmationMessage).getText().contains("Your request completed successfully."));
	}

	public void selectRandomFilter() {
		element(vacationRadioButtonsContainer).waitUntilVisible();
		List<WebElement> filterList = vacationRadioButtonsContainer.findElements(By.cssSelector(".vacationTypeChoice"));

		if (filterList.size() > 0) {
			Random rand = new Random();
			int nowRand = rand.nextInt(filterList.size());

			System.out.println("Rand: " + nowRand);
			System.out.println("filterList.size(): " + filterList.size());
			filterList.get(Integer.valueOf(nowRand)).findElement(By.cssSelector("input[type*='radio']")).click();
		}
	}

	public void selectRandomFilterThousand() {

		for (int i = 1; i <= 1000; i++) {
			selectRandomFilter();
		}
	}

}
