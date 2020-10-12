package exercises.chapter8.frames;

import base.BaseTests;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {

  @Test
  public void testFrameText() {
    var nestedFramesPage = homePage.clickFramesPage().clickNestedFrames();
    assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
    assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
  }
}
