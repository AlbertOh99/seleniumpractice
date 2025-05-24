package person.albert.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegisterPOM extends ParentPOM{

    @FindBy(xpath = "//form/*[text() = 'Name']")
    WebElement nameInput;
    @FindBy(name = "email")
    WebElement emailInput;
    @FindBy(xpath = "//form/*[text() = 'Signup']")
    WebElement signUpButton;

    public LoginRegisterPOM(WebDriver driver, String title){super(driver, title);}

    public void enterName(String name){
        nameInput.sendKeys(name);
    }
    public void enterEmail(String email){
        emailInput.sendKeys(email);
    }
    public void clickSignUp(){
        signUpButton.click();
    }

}
