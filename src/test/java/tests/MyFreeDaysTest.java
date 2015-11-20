package tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import steps.MyFreeDaysSteps;

@RunWith(SerenityRunner.class)
public class MyFreeDaysTest {
	
	MyFreeDaysSteps myFreeDaysSteps;
	
	@Test
	public void testIfTotalFreeDayAreTheSame(){
		myFreeDaysSteps.checkIfTheFreeDaysValuesAreTheSame();
	}

}
