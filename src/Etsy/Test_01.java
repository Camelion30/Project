package Etsy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/omersari/Desktop/selenium-java-4/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
        searchBox.sendKeys("Etsy");

        Thread.sleep(2000);

        WebElement clickOnSearch = driver.findElement(By.cssSelector("div[class='sbic vYOkbe']"));
        clickOnSearch.click();

        Thread.sleep(2000);
        WebElement clickEtsy = driver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']"));
        clickEtsy.click();

        Thread.sleep(3000);
        WebElement searchBoxEtsy = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        searchBoxEtsy.sendKeys("Silver Necklaces");

        Thread.sleep(4000);

        WebElement enterSearch = driver.findElement(By.cssSelector("span[class='wt-icon wt-nudge-b-2 wt-nudge-r-1']"));
        enterSearch.click();

        Thread.sleep(3000);
        driver.quit();

    }
}
