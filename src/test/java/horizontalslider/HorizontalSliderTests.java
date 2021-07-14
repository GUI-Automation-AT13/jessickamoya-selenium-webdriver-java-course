package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setHorizontalSliderValue(value);
        assertEquals(horizontalSliderPage.getHorizontalSliderValue(), value, "Horizontal Slider value is incorrect");
    }
}
