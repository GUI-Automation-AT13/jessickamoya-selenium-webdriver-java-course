package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        //Optional Exercise Chapter 3
//        optionalExerciseChapter3(driver);
        //Optional Exercise Chapter 3
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public static void optionalExerciseChapter3(WebDriver driver) {
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();
        WebElement menuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElementLink.click();
        List<WebElement> menuElements = driver.findElements(By.tagName("li"));
        System.out.println(menuElements.size());
    }
}
