package com.steps.serenity;

import com.pages.MyRequestsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyRequestsSteps extends ScenarioSteps {

	MyRequestsPage myRequestsPage;
	
	@Step
	public void goToMyRequestPage() {
		myRequestsPage.open();	
	}

}
