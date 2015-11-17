package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/login")
public class LoginPage extends PageObject {

	@FindBy(id = "_58_login")
	private WebElementFacade enterUsername;

	@FindBy(id = "_58_password")
	private WebElementFacade enterPassword;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade signInButton;

	public void enterCredentials(String username, String password) {
		enterUsername.type(username);
		enterPassword.type(password);
	}

	public void signIn() {
		signInButton.click();
	}

}
