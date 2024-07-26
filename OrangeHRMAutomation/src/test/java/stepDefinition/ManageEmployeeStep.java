package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import page.ManageEmployee;

public class ManageEmployeeStep {
    WebDriver driver;
    ManageEmployee manageEmployee;

//Add a new employee

    @Given("I am logged into the OrangeHRM dashboard")
    public void iAmLoggedIntoTheOrangeHRMDashBoard() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        manageEmployee = new ManageEmployee(driver);

        manageEmployee.enterUserName();
        Thread.sleep(2000);

        manageEmployee.enterPassword();
        Thread.sleep(2000);

        manageEmployee.clickLogInBtn();
        Thread.sleep(2000);
    }


    @When("I navigate to the Add Employee section")
    public void iNavigateToTheAddEmployeeSection() throws InterruptedException {
        manageEmployee.clickPIM();
        Thread.sleep(2000);

        manageEmployee.clickAddEmployee();
        Thread.sleep(2000);
    }

    @And("I fill in the necessary details for a new employee")
    public void iFillInTheNecessaryDetailsForANewEmployee() throws InterruptedException {
        manageEmployee.enterFirstName();
        Thread.sleep(2000);

        manageEmployee.enterMiddleName();
        Thread.sleep(2000);

        manageEmployee.enterLastName();
        Thread.sleep(2000);

//        manageEmployee.enterEmployeeID();
//        Thread.sleep(2000);

        manageEmployee.clickLoginDetails();
        Thread.sleep(2000);

        manageEmployee.enterNewUserName();
        Thread.sleep(2000);

        manageEmployee.selectStatus();
        Thread.sleep(2000);

        manageEmployee.enterNewPassword();
        Thread.sleep(2000);

        manageEmployee.confirmNewPassword();
        Thread.sleep(2000);
    }

    @And("I click on the save button")
    public void iClickOnTheSaveButton() throws InterruptedException {
        manageEmployee.clickSaveBtn();
        Thread.sleep(2000);
    }

    @Then("the new employee should be added successfully")
    public void theNewEmployeeShouldBeAddedSuccessfully() throws InterruptedException {
        manageEmployee.assertNewEmployee();
        Thread.sleep(2000);
    }

    //Search for an existing employee

    @Given("I am logged into the OrangeHRM website dashboard")
    public void iAmLoggedIntoTheOrangeHRMWebsiteDashboard() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        manageEmployee = new ManageEmployee(driver);

        manageEmployee.enterUserName();
        Thread.sleep(2000);

        manageEmployee.enterPassword();
        Thread.sleep(2000);

        manageEmployee.clickLogInBtn();
        Thread.sleep(2000);
    }

    @When("I search for employee by name {string}")
    public void iSearchForEmployeeByName(String arg0) throws InterruptedException {
        manageEmployee.clickPIM();
        Thread.sleep(2000);

        manageEmployee.clickEmployeeList();
        Thread.sleep(2000);

        manageEmployee.enterEmployeeName();
        Thread.sleep(2000);

        manageEmployee.clickSearchBtn();
        Thread.sleep(2000);
    }

    @Then("I should see the details of the employee {string}")
    public void iShouldSeeTheDetailsOfTheEmployee(String arg0) throws InterruptedException {
        manageEmployee.assertEmployeeInfo();
        Thread.sleep(4000);
    }
//Edit employee details

    @Given("I am logging into the OrangeHRM dashboard")
    public void iAmLoggingIntoTheOrangeHRMDashboard() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        manageEmployee = new ManageEmployee(driver);

        manageEmployee.enterUserName();
        Thread.sleep(2000);

        manageEmployee.enterPassword();
        Thread.sleep(2000);

        manageEmployee.clickLogInBtn();
        Thread.sleep(2000);
    }

    @When("I search for employee by ID {string}")
    public void iSearchForEmployeeByID(String arg0) throws InterruptedException {

        manageEmployee.clickPIM();
        Thread.sleep(2000);

        manageEmployee.clickEmployeeList();
        Thread.sleep(2000);

        manageEmployee.enterEmployeeID();
        Thread.sleep(2000);

        manageEmployee.clickSearchBtn();
        Thread.sleep(4000);
    }

    @And("I update the employee details")
    public void iUpdateTheEmployeeDetails() throws InterruptedException {
        manageEmployee.assertEmployeeInfo();
        Thread.sleep(2000);

        manageEmployee.clickIconBtn();
        Thread.sleep(2000);

        manageEmployee.enterLicenseNumber();
        Thread.sleep(2000);
    }

    @And("I click the save button")
    public void iClickTheSaveButton() throws InterruptedException {
        manageEmployee.clickSaveButton();
        Thread.sleep(2000);
    }

    //Delete an employee

    @Given("I am logged in the OrangeHRM dashboard")
    public void iAmLoggedInTheOrangeHRMDashboard() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        manageEmployee = new ManageEmployee(driver);

        manageEmployee.enterUserName();
        Thread.sleep(2000);

        manageEmployee.enterPassword();
        Thread.sleep(2000);

        manageEmployee.clickLogInBtn();
        Thread.sleep(2000);
    }


    @When("I search for the employee by ID {string}")
    public void iSearchForTheEmployeeByID(String arg0) throws InterruptedException {
        manageEmployee.clickPIM();
        Thread.sleep(2000);

        manageEmployee.clickEmployeeList();
        Thread.sleep(2000);

        manageEmployee.enterEmployeeID();
        Thread.sleep(2000);

        manageEmployee.clickSearchBtn();
        Thread.sleep(4000);
    }

    @And("I delete the employee")
    public void iDeleteTheEmployee() throws InterruptedException {
        manageEmployee.assertEmployeeInfo();
        Thread.sleep(2000);

        manageEmployee.clickBinBtn();
        Thread.sleep(2000);

        manageEmployee.clickDeleteConfirmation();
        Thread.sleep(2000);
    }
}






