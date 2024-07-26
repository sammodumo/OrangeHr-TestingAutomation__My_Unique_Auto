package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveManage extends LogInPage{
    public LeaveManage(WebDriver webDriver) {
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

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
    private WebElement leave;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")
    private WebElement apply;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
    private WebElement leaveType;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
    private WebElement dropDownOptions;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")
    private WebElement fromDate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")
    private WebElement toDate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div/div[1]")
    private WebElement duration;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/textarea")
    private WebElement comment;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button")
    private WebElement applyButton;

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

    public void clickLeaveIterm(){
        leave.click();
    }

    public void clickApply(){
        apply.click();
    }

    public void clickLeaveType(){
        leaveType.click();
    }

    public void clickSelection(){
        dropDownOptions.click();
    }

    public void enterFromDate(){
        fromDate.sendKeys("2024-30-07");
    }

    public void enterToDate(){
        toDate.sendKeys("2024-31-08");
    }

    public void enterDuration(){
        duration.click();
    }

    public void enterComment(){
        comment.sendKeys("Hope my leave gets approved on time");
    }

    public void clickTheSearchBtn(){
        applyButton.click();
    }
}
