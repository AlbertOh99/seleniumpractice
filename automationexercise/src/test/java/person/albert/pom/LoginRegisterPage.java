package person.albert.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginRegisterPage extends ParentPOM {

    @FindBy(name = "name")
    WebElement nameInput;
    @FindBy(name = "email") //Works because this is the first input
    WebElement emailLoginInput;
    @FindBy(name = "password")
    WebElement passwordInput;
    @FindBy(xpath = "//*[text() = 'Login']")
    WebElement loginBtn;
    @FindBy(xpath = "//div[@class = 'signup-form']//input[@name = 'email']")
    WebElement emailSignupInput;
    @FindBy(xpath = "//form/*[text() = 'Signup']")
    WebElement signUpButton;




    public LoginRegisterPage(WebDriver driver, String title){super(driver, title);}

    public void enterLoginEmail(String email){emailLoginInput.sendKeys(email);}
    public void enterLoginPassword(String password){passwordInput.sendKeys(password);}
    public void clickLogin(){loginBtn.click();}
    public boolean checkLoginError(){
        List<WebElement> error = driver.findElements(By.xpath("//*[text() = 'Your email or password is incorrect!']"));
        return !error.isEmpty(); // If it is not empty, then we found it.
    }



    public void enterName(String name){
        nameInput.sendKeys(name);
    }
    public void enterSignupEmail(String email){
        emailSignupInput.sendKeys(email);
    }
    public void clickSignUp(){
        signUpButton.click();
    }


}
