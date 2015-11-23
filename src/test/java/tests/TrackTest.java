package tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helpers.TrackTableModel;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.LoginSteps;
import steps.TrackSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(separator = ';', value = "resources/BuldingsDepartments.csv")

public class TrackTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public TrackSteps trackSteps;
	
	public String building, department;

	@Test
	public void trackTest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		trackSteps.clickTrackTab();
		trackSteps.setStartDate(16, "Nov", 2015);
		trackSteps.setEndDate(30, "Nov", 2015);
		trackSteps.clickBuildingsDropDown();
		trackSteps.setBulding(building);
		trackSteps.setBulding(building);
		trackSteps.clickBuildingsDropDown();
		trackSteps.clickDepartmentsDropDown();
		trackSteps.clickAllDepartments();
		trackSteps.setDepartment(department);
		trackSteps.clickApply();
		/*  trackSteps.checkListIsSorted("Main Building", "QA Department");
		List<TrackTableModel> listaInitiala = trackSteps.grabVacationList();
		trackSteps.sortByEmployeeName();
		List<TrackTableModel> listaOrdonata = trackSteps.grabVacationList();
		trackSteps.compareLists(listaOrdonata, listaInitiala);
		trackSteps.nrOfVacationOnPage(5);
		trackSteps.clickNextPageUntilTheLastPage();
		// trackSteps.CheckNameListIsSorted();   */
	}

}
