package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.LoginSteps;
import steps.TrackVacationSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(separator = ';', value = "resources/TrackData.csv")
public class TrackVacationBuildingDepartmentFilterTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginStep;

	@Steps
	public TrackVacationSteps trackSteps;

	public String startDay, startMonth, startYear, endDay, endMonth, endYear, building, department;

	@Test
	public void trackTest() {
		loginStep.goToLoginPage();
		loginStep.loginAsTester();
		loginStep.signIn();

		trackSteps.clickTrackTab();
		trackSteps.setData(startDay, startMonth, startYear, endDay, endMonth, endYear, building, department);
		trackSteps.clickApply();
		trackSteps.checkListIsSorted("Main Building", "QA Department");

	}
}
