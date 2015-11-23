package tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helpers.TrackTableModel;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;
import steps.TrackSteps;

@RunWith(SerenityRunner.class)
public class TrackTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public TrackSteps trackSteps;

	@Test
	public void trackTest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		trackSteps.clickTrackTab();
		trackSteps.setStartDate(16, "Nov", 2015);
		trackSteps.setEndDate(30, "Nov", 2015);
		trackSteps.clickBuildingsDropDown();
		trackSteps.clickMainBuildingCheckBox();
		trackSteps.clickMainBuildingCheckBox();		
		trackSteps.clickBuildingsDropDown();
		trackSteps.clickDepartmentsDropDown();
		trackSteps.clickAllDepartments();
		trackSteps.clickQaDepartmentCheckBox();
		trackSteps.clickApply();
		trackSteps.checkListIsSorted("Main Building", "QA Department");
		List<TrackTableModel> listaInitiala = trackSteps.grabVacationList();
		trackSteps.sortByEmployeeName();
		List<TrackTableModel> listaOrdonata = trackSteps.grabVacationList();
		trackSteps.compareLists(listaOrdonata, listaInitiala);
		trackSteps.nrOfVacationOnPage(5);
		trackSteps.clickNextPageUntilTheLastPage();
		//trackSteps.CheckNameListIsSorted();
	}

}
