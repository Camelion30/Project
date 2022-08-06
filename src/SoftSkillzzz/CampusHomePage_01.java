package SoftSkillzzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CampusHomePage_01 {
    public static void main(String[] args) throws InterruptedException {

        String input1 = "saromer96@gmail.com";
        String input2="omersari1";

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://campus.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        WebElement userName= driver.findElement(By.cssSelector("input[tabindex='0']"));
        WebElement password =driver.findElement(By.id("mat-input-1"));
        userName.sendKeys(input1);
        password.sendKeys(input2);

        WebElement loginBut =driver.findElement(By.cssSelector("button[aria-label='LOGIN']"));
        loginBut.click();

        WebElement cookies = driver.findElement(By.xpath("(//button[@class='consent-give'])[1]"));
        cookies.click();

        Thread.sleep(8000);

        WebElement ttt = driver.findElement(By.cssSelector("button[class='mat-focus-indicator mat-button mat-button-base']"));
        ttt.click();

        Thread.sleep(3000);
        driver.quit();



    }
}
