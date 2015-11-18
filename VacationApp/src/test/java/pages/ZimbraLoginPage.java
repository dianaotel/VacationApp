package pages;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.ZIMBRA_Email_URL)
public class ZimbraLoginPage extends PageObject{
	@FindBy(id="username")
	private WebElementFacade usernameBox;
	
	@FindBy(id="password")
	private WebElementFacade passwordBox;
	
	@FindBy(css="[type=submit]")
	private WebElementFacade loginButton;
	
	public void EnterCredentials(String username, String password){
		usernameBox.type(username);
		passwordBox.type(password);
	}
	public void Login(){
		loginButton.click();
	}
	
}
