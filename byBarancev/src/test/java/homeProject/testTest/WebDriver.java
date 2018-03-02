package homeProject.testTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class WebDriver {
    FirefoxDriver myDriver;
    
    @BeforeMethod
    public void setUp() throws Exception {
        myDriver = new FirefoxDriver();
        myDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void WebDriver() {
        myDriver.get("https://coursehunters.net/course/php-loft");
        if (!myDriver.findElement(By.id("nav-toggle")).isSelected()) {
            myDriver.findElement(By.id("nav-toggle")).click();
        }
        myDriver.findElement(By.linkText("System programming")).click();
        myDriver.findElement(By.linkText("Основы языка программирования C")).click();
        myDriver.findElement(By.id("positive-rank")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        myDriver.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
