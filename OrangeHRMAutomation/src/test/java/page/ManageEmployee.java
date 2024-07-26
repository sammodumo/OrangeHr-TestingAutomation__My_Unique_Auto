package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageEmployee extends LogInPage{
    public ManageEmployee(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver,this);
    }

    //Locators

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement logInBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    private WebElement PIM;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")
    private WebElement addEmployee;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
    private WebElement middleName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    private WebElement employeeNumber;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
    private WebElement logInDetails;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
    private WebElement newUserName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
    private WebElement status;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")
    private WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")
    private WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    private WebElement saveBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6")
    private WebElement employeeAdded;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    private WebElement employeeList;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    private WebElement employeeName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    private WebElement employeeInfo;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement employeeID;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]")
    private WebElement iconBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
    private WebElement licenseNumber;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[1]")
    private WebElement binButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    private WebElement deleteConfirmation;


    //Methods

    public void enterUserName(){
        userName.sendKeys("Admin");
    }

    public void enterPassword(){
        password.sendKeys("admin123");
    }

    public void clickLogInBtn(){
        logInBtn.click();
    }

    public void clickPIM(){
        PIM.click();
    }

    public void clickAddEmployee(){
        addEmployee.click();
    }

    public void enterFirstName(){
        firstName.sendKeys("John");
    }

    public void enterMiddleName(){
        middleName.sendKeys("Tester");
    }

    public void enterLastName(){
        lastName.sendKeys("Doe");
    }

//    public void enterEmployeeID(){
//        employeeNumber.sendKeys("2468");
//    }

    public void clickLoginDetails(){
        logInDetails.click();
    }

    public void enterNewUserName(){
        newUserName.sendKeys("John@Tester");
    }

    public  void selectStatus(){
        status.click();
    }

    public void enterNewPassword(){
        newPassword.sendKeys("QA@TesterOrange1");
    }

    public void confirmNewPassword(){
        confirmPassword.sendKeys("QA@TesterOrange1");
    }

    public void clickSaveBtn(){
        saveBtn.click();
    }

    public void assertNewEmployee() {

        String expectedDetails = "john Tester";

        String actualDetails = employeeAdded.getText().trim();

        Assert.assertTrue("Product details do not match", actualDetails.contains(expectedDetails));
    }

    public void clickEmployeeList(){
        employeeList.click();
    }

    public void enterEmployeeName(){
        employeeName.sendKeys("John Tester Doe");
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }

    public void assertEmployeeInfo() {

        String expectedDetails = "(1) Record Found";

        String actualDetails = employeeInfo.getText().trim();

        Assert.assertTrue("Product details do not match", actualDetails.contains(expectedDetails));
    }

    public void enterEmployeeID(){
        employeeID.sendKeys("0361");
    }

    public void clickIconBtn(){
        iconBtn.click();
    }

    public void enterLicenseNumber(){
        licenseNumber.sendKeys("20041213087");
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void clickBinBtn(){
        binButton.click();
    }

    public void clickDeleteConfirmation(){
        deleteConfirmation.click();
    }
}
