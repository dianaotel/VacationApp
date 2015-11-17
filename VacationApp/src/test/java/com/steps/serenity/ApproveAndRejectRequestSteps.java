package com.steps.serenity;

import com.pages.InboxPage;
import com.pages.VacationHomePage;

import net.thucydides.core.annotations.Step;

public class ApproveAndRejectRequestSteps {
	InboxPage inboxPage;
	VacationHomePage vacationHomePage;

	@Step
	public void approveRequest() {
		vacationHomePage.inboxButton();
		inboxPage.approveRequest();
	}

	@Step
	public void rejectRequest() {
		vacationHomePage.inboxButton();
		inboxPage.rejectRequest();
	}

}
