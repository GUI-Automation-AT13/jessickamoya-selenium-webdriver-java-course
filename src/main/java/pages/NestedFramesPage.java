package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topNestedFrame = "frame-top";
    private String leftNestedFrame = "frame-left";
    private String bottomNestedFrame = "frame-bottom";
    private By bodyTextFrame = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftNestedFrameText(){
        driver.switchTo().frame(topNestedFrame);
        driver.switchTo().frame(leftNestedFrame);
        String text = getNestedFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomNestedFrameText(){
        driver.switchTo().frame(bottomNestedFrame);
        String text = getNestedFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    private String getNestedFrameText(){
        return driver.findElement(bodyTextFrame).getText();
    }
}
