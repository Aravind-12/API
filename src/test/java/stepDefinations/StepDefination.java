package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on Netbanking lading page$")
    public void user_is_on_netbanking_lading_page() throws Throwable {
        // write a code to land on this page
        System.out.println(" I'm in netbanking page ");
    }

    @When("^User login into Application with Username and Password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        // write a code to login with UN nd PSWD and click on login button

        System.out.println("Logged in successfully ");
    }

    @When("^User login into Application with \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        //
        System.out.println("Logged in successfully ");
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home is papulated$")
    public void home_is_papulated() throws Throwable {
        // validate the home page

        System.out.println("home page displayed successfully ");
    }

    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        // card validation
        System.out.println(strArg1);
    }

}