package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import junit.framework.TestCase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.LoginSteps;
import steps.TrackSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(separator = ';', value = "resources/TrackData.csv")
public class TrackTest extends TestCase{

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public TrackSteps trackSteps;
	
	public String startDay,startMonth,startYear,endDay,endMonth,endYear,building,department;

	@Test
	public void trackTest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		trackSteps.clickTrackTab();					
		
		trackSteps.setData(startDay, startMonth, startYear, endDay, endMonth, endYear, building, department);
		trackSteps.clickApply();
		/*
		 * trackSteps.checkListIsSorted("Main Building", "QA Department");
		 * List<TrackTableModel> listaInitiala = trackSteps.grabVacationList();
		 * trackSteps.sortByEmployeeName(); List<TrackTableModel> listaOrdonata
		 * = trackSteps.grabVacationList();
		 * trackSteps.compareLists(listaOrdonata, listaInitiala);
		 * trackSteps.nrOfVacationOnPage(5);
		 * trackSteps.clickNextPageUntilTheLastPage(); //
		 * trackSteps.CheckNameListIsSorted();
		 */
	}

}
