package person.albert;

import io.cucumber.java.hu.De;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import person.albert.pom.*;

import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "person.albert.step",
        plugin = {"pretty", "html:/src/test/resources/reports/Cucumber-Report.html"}
)
public class TestRunner {
    public static WebDriver driver;
    public static HomePage homePage;
    public static LoginRegisterPage loginRegisterPage;
    public static SignupPage signupPage;
    public static CreatedAccountPage createdAccountPage;
    public static DeleteAccountPage deleteAccountPage;



    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        homePage = new HomePage(driver, "Automation Exercise");
        loginRegisterPage = new LoginRegisterPage(driver, "Automation Exercise - Signup / Login");
        signupPage = new SignupPage(driver, "Automation Exercise - Signup");
        createdAccountPage = new CreatedAccountPage(driver, "Automation Exercise - Account Created");
        deleteAccountPage = new DeleteAccountPage(driver, "Automation Exercise - Account Created");
    }

    @AfterClass
    public static void tearDown() {
//        if (driver != null) driver.quit();
    }
}
