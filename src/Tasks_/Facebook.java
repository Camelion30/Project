package Tasks_;

import Day4.SeleniumIntro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Facebook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        WebElement createAccount = driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        createAccount.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        String str = "John";
        firstName.sendKeys(str);

        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        String str2 = "Wick";
        lastName.sendKeys(str2);

        WebElement cellPhoneOrEmail= driver.findElement(By.cssSelector("input[name='reg_email__']"));
        String str3 = "jWick96@gmail.com";
        cellPhoneOrEmail.sendKeys(str3);

        WebElement reEmail =driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        String str4 = "jWick96@gmail.com";
        reEmail.sendKeys(str4);

        WebElement newPassword =driver.findElement(By.cssSelector("input[data-type='password']"));
        String str5 = "1234567890J";
        newPassword.sendKeys(str5);

        WebElement monthDropDown = driver.findElement(By.cssSelector("select[aria-label='Month']"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByVisibleText("May");

        WebElement dayDropDown =driver.findElement(By.cssSelector("select[aria-label='Day']"));
        Select selectDay = new Select(dayDropDown);
        selectDay.selectByVisibleText("8");

        WebElement yearDropDown =driver.findElement(By.cssSelector("select[aria-label='Year']"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText("1996");

        WebElement genderCheck = driver.findElement(By.cssSelector("input[value='2']"));
        genderCheck.click();

        WebElement getTextSignUp =driver.findElement(By.cssSelector("button[name='websubmit']"));
        String signUpText =getTextSignUp.getText();
        System.out.println(signUpText);








    }
}
