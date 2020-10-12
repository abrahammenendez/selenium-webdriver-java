package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

  private static final By statusAlert = By.id("flash");
  private final WebDriver driver;

  public SecureAreaPage(WebDriver driver) {
    this.driver = driver;
  }

  public String getAlertText() {
    return driver.findElement(statusAlert).getText();
  }
}
