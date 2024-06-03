package OpenGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OpenGoogle {
    private WebDriver driver;

    @Given("I open Google's homepage")
    public void i_open_google_s_homepage() {
        System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (!actualTitle.equals(expectedTitle)) {
            throw new AssertionError("Title mismatch. Expected: " + expectedTitle + ", Actual: " + actualTitle);
        }
        driver.quit();
    }
}
