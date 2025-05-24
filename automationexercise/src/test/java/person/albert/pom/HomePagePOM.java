package person.albert.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM extends ParentPOM{
    @FindBy(partialLinkText = "login")
    WebElement loginRegisterBtn;

    public HomePagePOM(WebDriver driver, String title){super(driver, title);}

    public void clickLogin(){
        loginRegisterBtn.click();
    }
}
