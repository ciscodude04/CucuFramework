package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

/**
 * Created by Cisco on 2/25/2017.
 */
public class sample_steps {
    @Given("^I am here$")
    public void i_am_here() throws Throwable {
        System.out.println("I got Given");
    }

    @When("^I sit on sofa$")
    public void i_sit_on_sofa() throws Throwable {
        System.out.println("I got When");
    }

    @Then("^I am watching TV$")
    public void i_am_watching_TV() throws Throwable {
        System.out.println("I got Then");
    }

    @Given("^I am on second test$")
    public void iAmOnSecondTest() throws Throwable {
        System.out.println("I got second Given");
    }

    @When("^I start second test$")
    public void iStartSecondTest() throws Throwable {
        System.out.println("I got When");
    }

    @Then("^I am testing$")
    public void iAmTesting() throws Throwable {
        System.out.println("I got Then");
    }

    @Given("^I am on home page$")
    public void iAmOnHomePage() throws Throwable {
//        navigatetohomepage();
    }

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) {
        BasePage.gotohomePage();
    }

    @When("^I enter valid credentials$")
    public void iEnterValidCredentials() throws Throwable {
        BasePage.gotosecondStep();
    }

    @Then("^I am taken to messages page$")
    public void iAmTakenToMessagesPage()  {
        BasePage.gotothirdStep();
    }
}