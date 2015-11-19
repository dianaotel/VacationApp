package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.InboxPage;
import pages.VacationHomePage;

public class ApproveAndRejectVacationRequestSteps extends ScenarioSteps {

	InboxPage inboxPage;
	VacationHomePage vacationHomePage;

	@Step
	public void approveVacationRequest() {
		vacationHomePage.goToInbox();
		inboxPage.approveVacationRequest();
		inboxPage.checkConfirmationMessageForApprovedRequest();
	}

	@Step
	public void rejectVacationRequest() {
		vacationHomePage.goToInbox();
		inboxPage.rejectVacationRequest();
		inboxPage.checkConfirmationMessageForRejectedRequest();
	}

}
