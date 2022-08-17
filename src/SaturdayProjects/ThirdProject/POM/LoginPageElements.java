package SaturdayProjects.ThirdProject.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPageElements {

    public LoginPageElements (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "a[class='login']")
    public WebElement loginInput;

    @FindBy (xpath ="(//input[@data-validate='isEmail'])[2]")
    public WebElement emailInput;

    @FindBy (css = "input[type='password']")
    public WebElement password;

    @FindBy (id = "SubmitLogin")
    public WebElement clickSignIn;


}
