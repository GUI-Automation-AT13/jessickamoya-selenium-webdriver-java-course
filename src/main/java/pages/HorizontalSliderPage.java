package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSliderValue = By.id("range");
    private By horizontalSlider = By.cssSelector(".sliderContainer input");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setHorizontalSliderValue(String value){
        while(!getHorizontalSliderValue().equals(value)){
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getHorizontalSliderValue(){
        return driver.findElement(horizontalSliderValue).getText();
    }
}
