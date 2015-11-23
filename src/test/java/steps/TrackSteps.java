package steps;

import java.util.Collections;
import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;

import helpers.TrackTableModel;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.DatePickerPage;
import pages.LoginPage;
import pages.TrackPage;
import pages.VacationHomePage;

public class TrackSteps extends ScenarioSteps {
	LoginPage loginPage;
	VacationHomePage vacationHomePage;
	DatePickerPage datePickerPage;
	TrackPage trackPage;

	@Step
	public void clickTrackTab() {
		trackPage.open();
	}

	@Step
	public void setStartDate(int day, String month, int year) {
		trackPage.trackerStartDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void setEndDate(int day, String month, int year) {
		trackPage.trackerEndDate();
		datePickerPage.setDate(day, month, year);
	}

	@Step
	public void clickBuildingsDropDown() {
		trackPage.clickBuildingsDropDown();
	}

	@Step
	public void setBulding(String buildingName) {
		trackPage.setBuilding(buildingName);
	}

	@Step
	public void clickDepartmentsDropDown() {
		trackPage.clickDepartmentsDropDown();
	}

	@Step
	public void clickAllDepartments() {
		trackPage.clickAllDepartmentCheckBox();
	}

	@Step
	public void setDepartment(String departmentName) {
		trackPage.setDepartment(departmentName);
	}

	@Step
	public void clickApply() {
		trackPage.applyButton();
	}

	@Step
	public void checkListIsSorted(String building, String department) {
		trackPage.checkListIsSorted(building, department);
	}

	@Step
	public void nrOfVacationOnPage(int nr) {
		trackPage.nrVacationOnPage(nr);
	}

	@Step
	public void sortByEmployeeName() {
		trackPage.employeeName();
	}

	@Step
	public List<TrackTableModel> grabVacationList() {
		return trackPage.grabResultsList();
	}

	@Step
	public List<TrackTableModel> sortInitialList(List<TrackTableModel> listaInitiala) {
		Collections.sort(listaInitiala);
		return listaInitiala;
	}

	@Step
	public boolean compareLists(List<TrackTableModel> listaOrdonata, List<TrackTableModel> listaInitiala) {
		for (TrackTableModel listaInitialaData : listaInitiala) {
			for (TrackTableModel listaOrdonataData : listaOrdonata) {
				if (listaOrdonataData.getEmployeeName().equals(listaInitialaData.getEmployeeName()))
					return true;
			}
		}

		return false;
	}

	@Step
	public void clickNextPageUntilTheLastPage() {
		int clicksNumber = trackPage.getNumberOfPages();
		for (int i = 0; i <= clicksNumber; i++) {
			trackPage.clickNextPage();
		}

	}

	// @Step
	// public void CheckIfNameListIsSorted(){
	// for (resultList i : grabResultList) {
	//
	// }

}

/*
 * @Step public void CheckNameListIsSorted(){ trackPage.EmployeeName();
 * trackPage.CheckEmployeeNameIsSorted(); }
 */
