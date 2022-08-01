package SaturdayProjects.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.cssSelector("input[id='username']"));
        String userNameInput = "ttechno@gmail.com";
        userName.sendKeys(userNameInput);

        WebElement passWord =driver.findElement(By.cssSelector("input[id='password']"));
        String password1= "techno123";
        passWord.sendKeys(password1);

        WebElement signInButton =driver.findElement(By.cssSelector("a[id='log-in']"));
        signInButton.click();

        Thread.sleep(2000);

        WebElement header = driver.findElement(By.cssSelector("h6[id='time']"));
        String headerName = header.getText();
        System.out.println("Text: " + headerName);

        String currentURL =driver.getCurrentUrl();
        System.out.println("Current URL : " + currentURL);

        Thread.sleep(2000);
        driver.quit();
    }
}
