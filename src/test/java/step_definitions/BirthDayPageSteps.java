package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.BirthDayPage;

/**
 * Created by Cisco Punns on 4/16/2017.
 */
public class BirthDayPageSteps {
    @Then("^I am taken to \"([^\"]*)\" page$")
    public void iAmTakenToPage(String text) {
        BirthDayPage.VerifyText(text);
    }
}
