package SaturdayProjects.SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Part4 {
    public static void main(String[] args) throws InterruptedException {

        String input1 ="helloWorld@gmail.com";
        String input2 ="Darwin Nunez";
        String input3 ="9999999999";
        String input4 ="helloWorldLLC";

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement clickAddCart = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        clickAddCart.click();

        WebElement iFrame1 = driver.findElement(By.xpath("(//iframe[@class='EJIframeV3 EJOverlayV3'])[1]"));

        wait.until(ExpectedConditions.visibilityOf(iFrame1));

        driver.switchTo().frame(iFrame1);

        WebElement debitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        debitCard.click();

        WebElement eMail =driver.findElement(By.cssSelector("input[placeholder='Email']"));
        WebElement confirmEmail = driver.findElement(By.cssSelector("input[placeholder='Confirm Email']"));
        WebElement nameOnCard= driver.findElement(By.cssSelector("input[placeholder='Name On Card']"));
        WebElement phone =driver.findElement(By.cssSelector("input[autocomplete='phone']"));
        WebElement companyName = driver.findElement(By.cssSelector("input[autocomplete='company']"));

        confirmEmail.sendKeys(input1);
        eMail.sendKeys(input1);
        nameOnCard.sendKeys(input2);
        phone.sendKeys(input3);
        companyName.sendKeys(input4);

        WebElement iFrame2 =driver.findElement(By.cssSelector("iframe[name='__privateStripeMetricsController9440']"));
        wait.until(ExpectedConditions.visibilityOf(iFrame2));
        driver.switchTo().frame(iFrame2);

        //------------not working after this point---------------
       // Thread.sleep(3000);
        WebElement creditCard =driver.findElement(By.cssSelector("div[class='CardField-input-wrapper is-ready-to-slide']"));
        String input5 ="1111-1111-1111-1111";
        creditCard.sendKeys(input5);




    }
}
