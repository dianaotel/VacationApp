package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.InboxPage;
import pages.VacationHomePage;

public class ApproveAndRejectRequestSteps extends ScenarioSteps {
	InboxPage inboxPage;
	VacationHomePage vacationHomePage;

	@Step
	public void approveRequest() {
		vacationHomePage.inboxButton();
		inboxPage.approveRequest();
		inboxPage.approveRequestConfirmationMessage();
	}

	@Step
	public void rejectRequest() {
		vacationHomePage.inboxButton();
		inboxPage.rejectRequest();
		inboxPage.rejectRequestConfirmationMessage();
	}

}
