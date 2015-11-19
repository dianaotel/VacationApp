package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import pages.NewVacationRequestPage;

public class SelectMoreVacTypesAtOnceSpets extends ScenarioSteps {

	NewVacationRequestPage newVacationRequestPage;

	@Step
	public void selectVacTypesRandomly() {
		newVacationRequestPage.selectRandomFilter();
	}

}
