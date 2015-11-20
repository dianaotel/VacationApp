package pages;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.headius.invokebinder.transform.Convert;

import helpers.Constants;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.NEW_VACATION_REQUEST_URL)
public class NewVacationRequestPage extends PageObject {
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div[1]/b")
	private WebElementFacade vacationDaysLeft;
	
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

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CS']")
	private WebElementFacade specialVacation;

	@FindBy(css = "option[value='MARRIAGE']")
	private WebElementFacade marriage;

	@FindBy(css = "option[value='CHILD_BIRTH']")
	private WebElementFacade childBirth;

	@FindBy(css = "option[value='FUNERAL']")
	private WebElementFacade funeral;

	@FindBy(css = "option[value='OTHER']")
	private WebElementFacade other;

	@FindBy(css = "option[value='MATERNITY_SICK_LEAVE']")
	private WebElementFacade prenatalPostNatal;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_ML']")
	private WebElementFacade maternityLeave;

	@FindBy(css = "option[value='CIC']")
	private WebElementFacade ingrijireCopii;

	@FindBy(css = "input[name='duration']")
	private WebElementFacade durationDomainTextBox;

	@FindBy(css = "input[name='institution']")
	private WebElementFacade institutionTextBox;

	@FindBy(css = ".optionalComment")
	private WebElementFacade addCommentButton;

	@FindBy(css = "[name=commentContent]")
	private WebElementFacade commentBox;

	@FindBy(css = "[value=Save]")
	private WebElementFacade saveButton;

	@FindBy(css = "[value=Cancel]")
	private WebElementFacade cancelButton;

	@FindBy(css = "[class=portlet-msg-success]")
	private WebElementFacade vacationRequestConfirmationMessage;
		
	public int getNumberOfVacationDaysLeft(){
		int nrOfVacationDaysLeft=Integer.parseInt(vacationDaysLeft.getText());
		return nrOfVacationDaysLeft;
	}

	public void startDate() {
		startDate.click();
	}

	public void endDate() {
		endDate.click();
	}

	public void createNewVacationRequestTab() {
		createNewVacationRequestButton.click();
	}

	public void saveVacationRequest() {
		saveButton.click();
	}

	public void cancelVacationRequest() {
		cancelButton.click();
	}

	public void chooseVacationType(String vacationType) {
		if (vacationType.contains("Holiday")) {
			holiday.click();
		} else if (vacationType.contains("Vacation without payment")) {
			vacationWithoutPayment.click();
		} else if (vacationType.contains("Sick Leave")) {
			sickLeave.click();
		} else if (vacationType.contains("Marriage")) {
			specialVacation.click();
			marriage.click();
		} else if (vacationType.contains("Child Birth")) {
			specialVacation.click();
			childBirth.click();
		} else if (vacationType.contains("Funeral")) {
			specialVacation.click();
			funeral.click();
		} else if (vacationType.contains("Other")) {
			specialVacation.click();
			other.click();
		} else if (vacationType.contains("Prenatal/Postnatal")) {
			maternityLeave.click();
			prenatalPostNatal.click();
		} else if (vacationType.contains("ConcediuIngrijireCopii")) {
			maternityLeave.click();
			ingrijireCopii.click();
		}
	}

	public void addCommet(String commentText) {
		addCommentButton.click();
		commentBox.sendKeys(commentText);
	}

	public void addDurationDomain(String durationDomain) {
		durationDomainTextBox.sendKeys(durationDomain);
	}

	public void addInstitutionName(String institutionName) {
		institutionTextBox.sendKeys(institutionName);
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
