package wait;

import base.BaseTests;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {

  @Test
  public void testWaitUntilHidden() {
    var loadingPage = homePage.clickDynamicLoading().clickExample1();
    loadingPage.clickStart();
    assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
  }
}
