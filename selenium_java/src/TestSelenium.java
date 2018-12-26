import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    public static String driverPath = "/home/lusine_a/Downloads/";
    public static WebDriver driver;

    public static void main(String []args) {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
        driver = new ChromeDriver();
        //driver.navigate().to("http://list.am");
        driver.get("http://list.am");
        String actualTitle = "";
        String expectedTitle = "List.am";
        actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed!");
            

        } else {
            System.out.println("Test Failed");
            driver.close();
        }

        //close Chrome
//         driver.close();

    }
}