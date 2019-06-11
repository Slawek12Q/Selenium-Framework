package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiverMenager {

    private static   WebDriver driver;

    private DiverMenager (){
    }

    public static WebDriver getDriver (){

        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        return driver;
    }

    
}
