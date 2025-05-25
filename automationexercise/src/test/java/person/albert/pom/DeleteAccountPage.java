package person.albert.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends ParentPOM{
    @FindBy(xpath = "//a")
    WebElement continueBtn;

    public DeleteAccountPage(WebDriver driver, String title) {
        super(driver, title);
    }

    public String getConfirmation(){
        return driver.getCurrentUrl();
    }
    public void clickContinue(){
        continueBtn.click();
    }
}
