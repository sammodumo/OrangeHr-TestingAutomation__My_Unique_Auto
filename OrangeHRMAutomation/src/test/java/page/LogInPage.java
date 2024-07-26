package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    WebDriver driver;

    public LogInPage(WebDriver webDriver){
        driver = webDriver;
        PageFactory.initElements(driver,this);
    }

    //Locators

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement logInBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    private WebElement dashBoard;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    private WebElement invalidTextMassage;



    //Methods

    public void enterUserName(){
        userName.sendKeys("invalidusername");
    }

    public void enterPassword(){
        password.sendKeys("invalidpassword");
    }

    public void clickLogInBtn(){
        logInBtn.click();
    }

    public void assertDashBoard() {

        String expectedDetails = "Dashboard";

        String actualDetails = dashBoard.getText().trim();

        Assert.assertTrue("Product details do not match", actualDetails.contains(expectedDetails));
    }

    public String getErrorMessage(){
        return invalidTextMassage.getText();
    }
}
