package SaturdayProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        WebElement closePopUps = driver.findElement(By.cssSelector("button[id='pushDenied']"));
        closePopUps.click();

        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search products & brands']"));
        String str = "teddy bear";
        searchBox.sendKeys(str);

        WebElement searchButton = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        searchButton.click();

        WebElement textButton = driver.findElement(By.cssSelector("div[id='searchMessageContainer']>div"));
        String textButton1= textButton.getText();
        System.out.println(textButton1);

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        driver.navigate().back();



    }
}
