package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dmy-requests&_evovacation_WAR_EvoVacationportlet_menuItem=free-days-history")
public class FreeDaysHistoryPage extends PageObject {

	@FindBy(id = ".nav-list a[href*='menuItem=free-days-history']")
	private WebElementFacade freeDaysHistoryMenuItem;
	
	public void click_freeDaysHistoryMenuItem(){
		freeDaysHistoryMenuItem.click();
	}
}

