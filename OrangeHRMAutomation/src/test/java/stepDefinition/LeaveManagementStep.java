package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import page.LeaveManage;

public class LeaveManagementStep {

    private LeaveManage leaveManage;

    @Given("I am  logged into the OrangeHRM dashboard")
    public void iAmLoggedIntoTheOrangeHRMDashboard() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        leaveManage = new LeaveManage(driver);

        leaveManage.enterUserName();
        Thread.sleep(2000);

        leaveManage.enterPassword();
        Thread.sleep(2000);

        leaveManage.clickLogInBtn();
        Thread.sleep(2000);
    }

    @When("I navigate to the Apply Leave section")
    public void iNavigateToTheApplyLeaveSection() throws InterruptedException {
        leaveManage.clickLeaveIterm();
        Thread.sleep(2000);

        leaveManage.clickApply();
        Thread.sleep(2000);
    }

    @And("I fill in the leave details for {string}")
    public void iFillInTheLeaveDetailsFor(String arg0) throws InterruptedException {
        leaveManage.clickLeaveType();
        Thread.sleep(2000);

        leaveManage.enterFromDate();
        Thread.sleep(2000);

        leaveManage.enterToDate();
        Thread.sleep(2000);

        leaveManage.enterDuration();
        Thread.sleep(2000);

        leaveManage.enterComment();
        Thread.sleep(2000);

    }

    @And("I click on the apply button")
    public void iClickOnTheApplyButton() throws InterruptedException {
        leaveManage.clickApply();
        Thread.sleep(2000);
    }
}
