package SaturdayProjects.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        String element1= "Automation";
        WebElement fullName= driver.findElement(By.cssSelector("input[autocomplete='off']"));
        fullName.sendKeys(element1);

        Thread.sleep(2000);

        WebElement emailFillUp = driver.findElement(By.cssSelector("input[type='email']"));
        String element2="Testing@gmail.com";
        emailFillUp.sendKeys(element2);

        Thread.sleep(2000);
        WebElement currentAddress = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String element3="Testing Current Address";
        currentAddress.sendKeys(element3);

        Thread.sleep(2000);
        WebElement formFillUp = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        String element4="Testing Permanent Address";
        formFillUp.sendKeys(element4);

        Thread.sleep(2000);
        WebElement submitButton =driver.findElement(By.cssSelector("button[id='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 2000 pixels
        js.executeScript("window.scrollBy(0,300)");
        submitButton.click();

        WebElement showTheMessage = driver.findElement(By.cssSelector("p[id='name']"));
        String showTheMessageText =showTheMessage.getText();
        System.out.println(showTheMessageText);

        WebElement showTheMessage1 = driver.findElement(By.cssSelector("p[id='email']"));
        String showTheMessageText1 =showTheMessage1.getText();
        System.out.println(showTheMessageText1);

        WebElement showTheMessage2 =driver.findElement(By.cssSelector("p[id='currentAddress']"));
        String showTheMessageText2 = showTheMessage2.getText();
        System.out.println(showTheMessageText2);

        WebElement showTheMessage3= driver.findElement(By.cssSelector("p[id='permanentAddress']"));
        String showTheMessageText3 = showTheMessage3.getText();
        System.out.println(showTheMessageText3);














    }
}
