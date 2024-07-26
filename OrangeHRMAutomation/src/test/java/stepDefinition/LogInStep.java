package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import page.LogInPage;

public class LogInStep {
    WebDriver driver;
    LogInPage logInPage;

    @Given("the user is on the login page")

    public void theUserIsOnTheLoginPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        logInPage = new LogInPage(driver);
    }

    @When("the user enters a valid username and password")
    public void theUserEntersAValidUsernameAndPassword() throws InterruptedException {
        logInPage.enterUserName();
        Thread.sleep(2000);
        logInPage.enterPassword();
        Thread.sleep(2000);
    }


    @And("clicks the {string} button")
    public void clicksTheButton(String arg0) throws InterruptedException {
        logInPage.clickLogInBtn();
        Thread.sleep(2000);
    }

    @Then("the user should be redirected to the Dashboard page")
    public void theUserShouldBeRedirectedToTheDashboardPage() throws InterruptedException {
        logInPage.assertDashBoard();
        Thread.sleep(2000);

    }

    @Given("I am on the OrangeHRM login page")
    public  void iAmOnTheOrangeHRMLoginPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        logInPage = new LogInPage(driver);
    }


    @When("I enter invalid username {string} and invalid password {string}")
    public void iEnterInvalidUsernameAndInvalidPassword(String arg0, String arg1) throws InterruptedException {
        logInPage.enterUserName();
        Thread.sleep(2000);

        logInPage.enterPassword();
        Thread.sleep(2000);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() throws InterruptedException {
        logInPage.clickLogInBtn();
        Thread.sleep(2000);
    }

    @Then("I should see an error message indicating invalid credentials")
    public void iShouldSeeAnErrorMessageIndicatingInvalidCredentials() throws InterruptedException {
        logInPage.getErrorMessage();
        Thread.sleep(2000);
    }
}
