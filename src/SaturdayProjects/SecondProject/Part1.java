package SaturdayProjects.SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {

        String cartItemAdd = "1";
        String cartItemRemove = "0";

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com/%22");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // click on demo e-book
        WebElement clickAddToCart = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        clickAddToCart.click();

        //get into frame
        WebElement iFrame1 = driver.findElement(By.xpath("(//iframe[@class='EJIframeV3 EJOverlayV3'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(iFrame1));
        driver.switchTo().frame(iFrame1);

        //first validation
        WebElement oneInCart = driver.findElement(By.xpath("//*[@id='Overlay']/div/div[2]/div/div[2]/div[1]/span"));
        String oneCartValidation = oneInCart.getText();
        if (oneCartValidation.equals(cartItemAdd)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //remove the item from cart
        WebElement removeBtn = driver.findElement(By.xpath("//button[@class='Product-Remove']"));
        removeBtn.click();

        // click on continue shopping button
        WebElement continueShopping = driver.findElement(By.xpath("//button[@class ='Continue-Button Close-Cart']"));
        continueShopping.click();

        // back to main frame
        driver.switchTo().parentFrame();

        // validate cart if there is 0 item in
        WebElement zeroInCart = driver.findElement(By.xpath("(//span[@id='cart_item_nos'])[2]"));
        String zeroCartValidation = zeroInCart.getText();
        System.out.println("zero Cart Validation: " + zeroCartValidation);
        if (zeroCartValidation.equals(cartItemRemove)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
