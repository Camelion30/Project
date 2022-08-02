package SaturdayProjects.SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Part2 {
    public static void main(String[] args) throws InterruptedException {

        //choose which web driver we are going to use
        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");
        WebDriver driver = new ChromeDriver();

        //navigate to website we are going to use
        driver.get("https://shopdemo.e-junkie.com/");
        driver.manage().window().maximize();

        // we set our waiting methods
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clickAddToCart = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        clickAddToCart.click();

        // navigate to frame
        WebElement iFrame1 = driver.findElement(By.xpath("(//iframe[@class='EJIframeV3 EJOverlayV3'])[1]"));

        // we waited until item become visible
        wait.until(ExpectedConditions.visibilityOf(iFrame1));

        driver.switchTo().frame(iFrame1);

        WebElement addPromoCode = driver.findElement(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']"));
        addPromoCode.click();

        WebElement promoCodeBox =driver.findElement(By.xpath("//input[@class='Promo-Code-Value']"));
        promoCodeBox.sendKeys("123456789");

        Thread.sleep(2000);

        WebElement applyBtn =driver.findElement(By.cssSelector("button[class='Promo-Apply']"));
        applyBtn.click();

        Thread.sleep(2000);

        WebElement invalidPromoCode = driver.findElement(By.cssSelector("div[id='SnackBar']>span"));
        boolean isDisplayedAfterClick = invalidPromoCode.isDisplayed();

        System.out.println(isDisplayedAfterClick);
        System.out.println(invalidPromoCode.getText());
    }
}
