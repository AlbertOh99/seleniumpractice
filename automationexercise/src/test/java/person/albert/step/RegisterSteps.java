package person.albert.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static person.albert.TestRunner.*;

public class RegisterSteps {

    @Given("the user is on the correct homepage")
    public void the_user_is_on_the_correct_homepage() {
        driver.get("https://www.automationexercise.com/");
    }
    @When("the user clicks on the Signup Login button")
    public void the_user_clicks_on_the_signup_login_button() {
        homePage.clickLogin();
    }
    @Then("the user should be on the login page")
    public void the_user_should_be_on_the_login_page() {
        Assert.assertEquals(loginRegisterPage.getTitle(), driver.getTitle());
    }
    @When("the user inputs their Name")
    public void the_user_inputs_their_name() {
        loginRegisterPage.enterName("John");
    }
    @When("the user inputs their Email Address")
    public void the_user_inputs_their_email_address() {
        loginRegisterPage.enterSignupEmail("John@John.com");
    }
    @When("the user clicks on the Signup button")
    public void the_user_clicks_on_the_signup_button() {
        loginRegisterPage.clickSignUp();
    }
    @Then("the user should be on the Signup page")
    public void the_user_should_be_on_the_signup_page() {
        Assert.assertEquals(signupPage.getTitle(), driver.getTitle());
    }
    @When("the user inputs their password")
    public void the_user_inputs_their_password() {
        signupPage.enterPassword("123");
    }
    @When("inputs their First Name")
    public void inputs_their_first_name() {
        signupPage.enterFirstName("John");
    }
    @When("inputs their Last Name")
    public void inputs_their_last_name() {
        signupPage.enterLastName("Smith");
    }
    @When("inputs their full address")
    public void inputs_their_full_address() {
        signupPage.enterAddress("123 Fake Street");
        signupPage.enterCountry("United States");
        signupPage.enterState("New York");
        signupPage.enterCity("Newark");
        signupPage.enterZip("123456");
    }
    @When("inputs their Mobile Number")
    public void inputs_their_mobile_number() {
        signupPage.enterMobileNumber("123-456-7890");
    }
    @Then("the user should be on the account created page")
    public void the_user_should_be_on_the_account_created_page() {
        Assert.assertEquals(createdAccountPage.getTitle(), driver.getTitle());
    }
    @When("the user clicks on the Create Account Button")
    public void the_user_clicks_on_the_create_account_button() {
        signupPage.clickCreateAccount();
    }
    @When("the user clicks on the Continue button on the created account page")
    public void the_user_clicks_on_the_continue_button_on_the_created_account_page() {
        createdAccountPage.clickContinue();
    }
    @Then("the user should be the home page with a Delete Account button visible")
    public void the_user_should_be_the_home_page_with_a_delete_account_button_visible() {
        Assert.assertEquals(homePage.getTitle(), driver.getTitle());
        Assert.assertFalse(homePage.findLogout().isEmpty());
    }
    @When("the user clicks on Delete Account")
    public void the_user_clicks_on_delete_account() {
        homePage.clickDeleteAccount();
    }
    @Then("the should should be on the Delete Account page")
    public void the_should_should_be_on_the_delete_account_page() {
        Assert.assertEquals(deleteAccountPage.getTitle(), driver.getTitle());
    }
    @When("the user clicks on the Continue button on the delete account page")
    public void the_user_clicks_on_the_Continue_button_on_the_delete_account_page() {
        deleteAccountPage.clickContinue();
    }
    @Then("the should should be on the home page")
    public void the_should_should_be_on_the_home_page() {
        Assert.assertEquals(homePage.getTitle(), driver.getTitle());
    }
}
