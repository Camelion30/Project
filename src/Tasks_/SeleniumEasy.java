package Tasks_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumEasy {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String str1="First name";
        String str2= "Last name";
        String str3="Email@gmail.com";
        String str4="8322570950";
        String str5="13 Wales Avenue,NJ";
        String str6="Jersey City";
        String str7="77320";
        String str8="www.helloWorld.com";
        String str9 = "Description none";


        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        WebElement lastName= driver.findElement(By.cssSelector("input[name='last_name']"));
        WebElement emailL = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement phoneNumber =driver.findElement(By.cssSelector("input[name='phone']"));
        WebElement address =driver.findElement(By.cssSelector("input[name='address']"));
        WebElement currentCity =driver.findElement(By.cssSelector("input[name='city']"));
        WebElement selectState =driver.findElement(By.cssSelector("select[name='state']"));
        WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
        WebElement webSite =driver.findElement(By.cssSelector("input[name='website']"));
        WebElement checkBox =driver.findElement(By.cssSelector("input[type='radio']"));
        checkBox.click();
        WebElement descriptionBox= driver.findElement(By.cssSelector("textarea[class='form-control']"));
        WebElement submitButton =driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        submitButton.click();

        Select newState = new Select(selectState);
        newState.selectByVisibleText("New Jersey");


        firstName.sendKeys(str1);
        lastName.sendKeys(str2);
        emailL.sendKeys(str3);
        phoneNumber.sendKeys(str4);
        address.sendKeys(str5);
        currentCity.sendKeys(str6);
        zipCode.sendKeys(str7);
        webSite.sendKeys(str8);
        descriptionBox.sendKeys(str9);








    }
}
