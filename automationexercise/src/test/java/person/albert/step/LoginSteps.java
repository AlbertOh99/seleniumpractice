package person.albert.step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static person.albert.TestRunner.*;

public class LoginSteps {

    @When("the user inputs a {string} email")
    public void the_user_inputs_a_email(String email) {
        loginRegisterPage.enterLoginEmail(email);
    }

    @When("the user inputs a {string} password")
    public void the_user_inputs_a_password(String password) {
        loginRegisterPage.enterLoginPassword(password);
    }

    @When("the user click on the Login button")
    public void the_user_click_on_the_login_button() {
        loginRegisterPage.clickLogin();
    }


    @Then("Error Your email or password is incorrect! is visible")
    public void errorYourEmailOrPasswordIsIncorrectIsVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(driver -> loginRegisterPage.checkLoginError());
        Assert.assertTrue(loginRegisterPage.checkLoginError());
    }

    @Then("Logged in as username is visible")
    public void loggedInAsUsernameIsVisible () {
        Assert.assertTrue(homePage.checkValidLogin());
    }

    @When("the user clicks the logout button")
    public void theUserClicksTheLogoutButton() {
        homePage.clickLogOut();
    }
}
