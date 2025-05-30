package person.albert.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends ParentPOM {
    @FindBy(partialLinkText = "Login")
    WebElement loginRegisterBtn;


    public HomePage(WebDriver driver, String title){super(driver, title);}

    public void clickLogin(){
        loginRegisterBtn.click();
    }
    public void clickDeleteAccount(){
        List<WebElement> deleteBtn = driver.findElements(By.xpath("//li/a[contains(text(), 'Delete')]"));
        WebElement delete = deleteBtn.get(0);
        delete.click();
    }

    public void clickLogOut(){
        List<WebElement> logoutBtn = driver.findElements(By.xpath("//li/a[contains(text(), 'Logout')]"));
        WebElement logout = logoutBtn.get(0);
        logout.click();
    }

    public boolean checkValidLogin(){
        List<WebElement> loggedIn = driver.findElements(By.xpath("//*[contains(text(), 'Logged in as')]"));
        return !loggedIn.isEmpty();
    }


    public void gotoHomePage() {
        driver.get("https://www.automationexercise.com/");
    }

    public List<WebElement> findLogout(){
        return driver.findElements(By.xpath("//*[contains(text(), 'Logout')]"));
    }


}
