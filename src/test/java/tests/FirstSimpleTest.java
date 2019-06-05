package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;

import static java.lang.Thread.sleep;

public class FirstSimpleTest {


    private WebDriver driver;

    @BeforeMethod
    public void beforeTest () {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://coinmarketcap.com");
        sleep(1000);
    }

    @AfterClass
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
