package person.albert.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends ParentPOM {
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "first_name")
    WebElement firstNameInput;
    @FindBy(id = "last_name")
    WebElement lastNameInput;
    @FindBy(id = "address1")
    WebElement addressInput;
    @FindBy(id = "country")
    WebElement countrySelect;
    @FindBy(id = "state")
    WebElement stateInput;
    @FindBy(id = "city")
    WebElement cityInput;
    @FindBy(id = "zipcode")
    WebElement zipInput;
    @FindBy(id = "mobile_number")
    WebElement mobileNumberInput;
    @FindBy(xpath = "//*[contains(text(), 'Create Account')]")
    WebElement createAccountBtn;


    // Constructor
    public SignupPage(WebDriver driver, String title){super(driver, title);}

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void enterFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }
    public void enterAddress(String address){
        addressInput.sendKeys(address);
    }
    public void enterCountry(String country){
        Select select = new Select(countrySelect);
        select.selectByValue(country);
    }
    public void enterState(String state){
        stateInput.sendKeys(state);
    }
    public void enterCity(String city){
        cityInput.sendKeys(city);
    }
    public void enterZip(String zip){
        zipInput.sendKeys(zip);
    }
    public void enterMobileNumber(String number){
        mobileNumberInput.sendKeys(number);
    }
    public void clickCreateAccount(){
        createAccountBtn.click();
    }


}
