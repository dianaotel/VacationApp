package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class VacationHomePage extends PageObject {
	
	@FindBy(css = "a[href*='menuItem=inbox']")
	private WebElementFacade inboxButton;

	public void inboxButton() {
		inboxButton.click();
	}
}
