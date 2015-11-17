package steps;

import pages.FreeDaysHistoryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FreeDaysHistorySteps extends ScenarioSteps {

	FreeDaysHistoryPage freeDaysHistorypage;
	
	@Step
	public void goToFreeDaysHistoryPage() {
		freeDaysHistorypage.open();
	}
	
}
