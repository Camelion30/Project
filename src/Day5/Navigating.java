package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigating {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();

        //navigate to website and wait until page is load
        driver.get("https://google.com/");  // It will wait until load all page

        //thread.sleep force selenium to wait!
        Thread.sleep(3000);

        driver.get("https://facebook.com/");
        //driver.navigate.to method is not going to wait for page load

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(300);

        driver.navigate().refresh();

        driver.quit();

    }
}
