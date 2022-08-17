package SaturdayProjects.ThirdProject.Test;

import SaturdayProjects.ThirdProject.POM.LoginPageElements;
import SaturdayProjects.ThirdProject.Utils.BaseDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_LoginTest  extends BaseDriver {

    LoginPageElements loginPageElements;

    @Test
    public void loginPositiveTest () {

        loginPageElements = new LoginPageElements(driver);

        loginPageElements.loginInput.click();
        loginPageElements.emailInput.sendKeys("helloworld61@gmail.com");
        loginPageElements.password.sendKeys("omersari1");
        loginPageElements.clickSignIn.click();

    }
}
