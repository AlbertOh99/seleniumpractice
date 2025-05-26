package person.albert;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class TestCase2NoCucumber {


    public static void main (String args[]){
        WebDriver driver = new ChromeDriver();
        // Go to website
        driver.get("https://www.automationexercise.com/");

        // Verify that home page is visible
        Assert.assertEquals("Automation Exercise", driver.getTitle());
        WebElement loginBtn = driver.findElement(By.xpath("//*[contains(text(), 'Login')]"));
        loginBtn.click();

        List<WebElement> loginVerify = driver.findElements(By.xpath("//*[contains(text(), 'Login to your account')]"));


        // Verified Login -> John@Tom, 123

        Assert.assertNotNull(loginVerify);

        WebElement usernameInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));

        usernameInput.sendKeys("John@Tom");
        passwordInput.sendKeys("123");

        WebElement validLoginBtn = driver.findElement(By.xpath("//*[text() = 'Login']"));
        validLoginBtn.click();

        List<WebElement> verifyLogin = driver.findElements(By.xpath("//*[contains(text(), 'Logged in as')]"));
        Assert.assertNotNull(verifyLogin);

//        WebElement deleteBtn = driver.findElement(By.xpath("//*[text() = 'Delete Account']"));
//        deleteBtn.click();

    }
}
