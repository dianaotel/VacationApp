package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;

import helpers.Constants;

@DefaultUrl(Constants.LOGIN_URL)
public class LoginPage extends PageObject {

	@FindBy(id = "_58_login")
	private WebElementFacade enterUsername;

	@FindBy(id = "_58_password")
	private WebElementFacade enterPassword;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade signInButton;

	@FindBy(css = "a[href='http://172.22.4.88:9090/vacation']")
	private WebElementFacade vacationButton;

	public void enterEvoportalLoginCredentials(String username, String password) {
		enterUsername.type(username);
		enterPassword.type(password);
	}

	public void signIn() {
		signInButton.click();
	}

	public void checkIfItLogsIn() {
		vacationButton.click();
	}

}
