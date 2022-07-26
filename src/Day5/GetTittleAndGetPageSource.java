package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleAndGetPageSource {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        // getTitle() method will return Title of the Webpage as a String
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        // getPageSource method will return the HTML code of the website as a String
        String pageSource = driver.getPageSource();
        System.out.println("Page Source: " + pageSource);

        driver.quit();

    }

}