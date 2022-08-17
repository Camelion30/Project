package SaturdayProjects.ThirdProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//helloworld61@gmail.com
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

       protected WebDriver driver;
       protected WebDriverWait wait;

       @BeforeMethod
    @Parameters({"browser"})
    public void setup (String browser) {

          if(browser.equals("chrome")){
              System.setProperty("webdriver.chrome.driver","/Users/omersari/Desktop/selenium-java-4/chromedriver");
              driver = new ChromeDriver();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
              driver.manage().window().maximize();
              driver.get("http://automationpractice.com/index.php");

          } else if (browser.equals("firefox")) {
              System.setProperty("webdriver.chrome.driver","/Users/omersari/Desktop/selenium-java-4/geckodriver");
              driver = new ChromeDriver();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
              driver.manage().window().maximize();
              driver.get("http://automationpractice.com/index.php");
          }




      }
      @AfterMethod
    public void tearDown() {
          driver.quit();


    }




}
