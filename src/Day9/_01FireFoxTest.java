package Day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01FireFoxTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/Users/omersari/Desktop/selenium-java-4/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://campus.techno.study/meetings/list");

    }
}
