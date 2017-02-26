package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
}
