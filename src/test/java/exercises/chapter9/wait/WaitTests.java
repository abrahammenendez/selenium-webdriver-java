package exercises.chapter9.wait;

import base.BaseTests;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {

  @Test
  public void testWaitUntilVisible() {
    var loadingPage = homePage.clickDynamicLoading().clickExample2();
    loadingPage.clickStart();
    assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
  }
}
