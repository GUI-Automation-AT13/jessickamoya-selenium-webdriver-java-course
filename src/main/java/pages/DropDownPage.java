package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void  selectFromDropDown(String option) {
        finDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements =
                finDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void addMultipleAttributes(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script, finDropDownElement());
    }

    private Select finDropDownElement() {
        return new Select(driver.findElement(dropDown));
    }

}
