package exercises.chapter6.slider;

import base.BaseTests;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {

  @Test
  public void testSlideToWholeNumber() {
    String value = "4";
    var sliderPage = homePage.clickHorizonalSlider();
    sliderPage.setSliderValue(value);
    assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
  }
}