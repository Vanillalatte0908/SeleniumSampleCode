package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class GooglesearcsSteps {
    WebDriver driver;

    @Given("I open Google's homepage")
    public void i_open_google_homepage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update the path
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
}
