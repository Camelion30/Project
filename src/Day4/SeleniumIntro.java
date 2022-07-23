package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) {

        // define what driver you are going to use
        // define web driver type (chrome,safari etc)
        //open terminal>find chrome driver file in your computer, drag and drop chrome dr to terminal
        // copy and paste from terminal
        System.setProperty("webdriver.chrome.driver","/Users/omersari/Desktop/selenium-java-4/chromedriver");

        //new web driver object
        //how? --/

        WebDriver driver = new ChromeDriver();

        // maximize browser window
        driver.manage().window().maximize();
        //time to navigate

        driver.get("https://techno.study//");

        // to quit driver
        driver.quit();

    }
}
