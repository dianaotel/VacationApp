package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import pages.NewVacationRequestPage;

public class SelectMoreVacTypesAtOnceSteps extends ScenarioSteps {

	NewVacationRequestPage newVacationRequestPage;

	@Step
	public void selectVacTypesRandomly() {
		newVacationRequestPage.selectRandomFilter();
	}
	
	@Step
	public void selectRandomFilterThousand() {
		newVacationRequestPage.selectRandomFilterThousand();
	}

}
