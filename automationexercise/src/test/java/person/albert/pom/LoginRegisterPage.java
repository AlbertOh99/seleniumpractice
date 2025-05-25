package person.albert.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegisterPage extends ParentPOM {

    @FindBy(name = "name")
    WebElement nameInput;
    @FindBy(xpath = "//div[@class = 'signup-form']//input[@name = 'email']")
    WebElement emailInput;
    @FindBy(xpath = "//form/*[text() = 'Signup']")
    WebElement signUpButton;




    public LoginRegisterPage(WebDriver driver, String title){super(driver, title);}

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
