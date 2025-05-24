package person.albert;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import person.albert.pom.HomePagePOM;

import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "person.albert.step",
        plugin = {"pretty", "html:/src/test/resources/reports/Cucumber-Report.html"}
)
public class TestRunner {
    public static WebDriver driver;
    public static HomePagePOM homePage;


    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();

    }
}
