package person.albert.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatedAccountPage extends ParentPOM{
    @FindBy(xpath = "//div/a")
    WebElement continueBtn;

    public CreatedAccountPage(WebDriver driver, String title) {
        super(driver, title);
    }

    public void clickContinue(){
        continueBtn.click();
    }


}
