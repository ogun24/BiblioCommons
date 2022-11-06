package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.saucedemo;
import utils.BrowserUtils;

public class saucedemosteps extends BrowserUtils {


    saucedemo loginpage = new saucedemo();


    @Given("User wants to go to saucedemo application")
    public void user_wants_to_go_to_saucedemo_application() {
       String expectedtitle = "Swag Labs";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);

    }
    @When("User enters valid username")
    public void user_enters_valid_username() {
   loginpage.setUsername();
    }
    @Then("User enters valid password")
    public void user_enters_valid_password() {
        loginpage.setPassword();
    }

    @Then("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginpage.setLoginbutton();
    }
    @Given("User wants to add {string} to cart")
    public void user_wants_to_add_to_cart(String string) {
        loginpage.setAddtocart();

    }
    @When("User clicks on shopping cart")
    public void user_clicks_on_shopping_cart() {
       loginpage.setDisplaycart();
    }
    @Then("User clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        loginpage.setCheckout();
    }
    @Then("User enters name")
    public void user_enters_name() {
        loginpage.setFirstname();

    }
    @Then("User enters last name")
    public void user_enters_last_name() {
        loginpage.setLastname();

    }
    @Then("User enters a postalcode")
    public void user_enters_a_postalcode() {
        loginpage.setPostalcode();

    }
    @Then("User clicks on continue")
    public void user_clicks_on_continue() {
        loginpage.setNext();

    }@Then("User wants to finish the transaction")
    public void user_wants_to_finish_the_transaction() {
        loginpage.setFinish();

    }
    @Then("User wants to verify checkout status as {string}")
    public void user_wants_to_verify_checkout_status_as(String actuall) {

        /*String actual  = loginpage.title.getText();*/

        String expected = "CHECKOUT: COMPLETE!";
        System.out.println(actuall);
        Assert.assertEquals(actuall,expected);

    }



    }


