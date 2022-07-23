package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        driver.quit();

    }

}