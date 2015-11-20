package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MyFreeDaysPage;

public class MyFreeDaysSteps extends ScenarioSteps {

	MyFreeDaysPage myFreeDaysPage;
	
	@Step
	public void checkIfTheFreeDaysValuesAreTheSame(){
		myFreeDaysPage.isNrOfFreeDaysEqual();
	}
	
	
}
