package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {

    private final String CHROME = "drivers/chromedriver81.exe";
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", CHROME);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);

    }

    @After
    public void tearDown() {
//        driver.close();
       driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(1000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium test");
        Thread.sleep(1000);
        WebElement searchBtn = driver.findElement(By.name("btnK"));
        searchBtn.click();
        Thread.sleep(1000);

    }

    @Test
    public void getUrl() {
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

    }

    @Test
    public void skyScanner() {

    }
}
