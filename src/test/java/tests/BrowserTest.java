package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {
    private final String CHROME = "drivers/chromedriver81.exe";
    WebDriver driver;

    @Before
    public void setup() {
//        System.setProperty("webdriver.chrome.driver", CHROME);
        System.setProperty("webdriver.chrome.driver", CHROME);
        driver = new ChromeDriver();

    }
    @After
    public void tearDown() {
        driver.close();
//        driver.quit();
    }
//    @Test
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
    public void test2() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("pass")).sendKeys("password");
        Thread.sleep(500);
        driver.findElement(By.id("u_0_b")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Create a Page")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

    }
    @Test
    public void name() throws InterruptedException {
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        Thread.sleep(1000);
        driver.switchTo().frame("classFrame");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Index")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Deprecated")).click();
        Thread.sleep(1000);
    }
    @Test

    public void test3() throws InterruptedException {

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.name("firstname")).sendKeys("Hakan");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Cetin");
        Thread.sleep(1000);
        driver.findElement(By.id("sex-0")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys("18-04-1968");
        Thread.sleep(1000);
        



    }
}
