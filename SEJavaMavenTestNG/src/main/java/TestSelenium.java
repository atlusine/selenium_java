import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;


public class TestSelenium {
    WebDriver driver = new ChromeDriver();
    private List<WebElement> myElementList;

    @Test
    public void test2() throws InterruptedException {
        myElementList = driver.findElements(By.id("ap"));
        if (myElementList.isEmpty()) {
            Assert.fail();
        }
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "List.am - Հայաստանի անվճար հայտարարությունների կայք");

    }

    @BeforeSuite
    public void openURL() {
        driver.get("https://list.am");

    }

    @AfterSuite
    public void closeURL() {
        driver.quit();
    }
}
