package tests;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helpers.TrackTableModel;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.LoginSteps;
import steps.TrackVacationSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(separator = ';', value = "resources/TrackData.csv")
public class TrackVacationSortByNameTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public TrackVacationSteps trackSteps;
	
	TrackTableModel trackTableModel;
	public String startDay, startMonth, startYear, endDay, endMonth, endYear, building, department;

	@Test
	public void trackTest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		trackSteps.clickTrackTab();

		trackSteps.setData(startDay, startMonth, startYear, endDay, endMonth, endYear, building, department);
		trackSteps.clickApply();
		
		trackSteps.sortByEmployeeName(); 
		List<TrackTableModel> listaInitiala = trackSteps.grabVacationList();
		  trackSteps.sortByEmployeeName(); List<TrackTableModel> listaOrdonata
		  = trackSteps.grabVacationList();
		  trackSteps.compareLists(listaOrdonata, listaInitiala);

	}
}
