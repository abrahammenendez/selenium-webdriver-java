package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

  private static final By dropdown = By.id("dropdown");
  private final WebDriver driver;

  public DropdownPage(WebDriver driver) {
    this.driver = driver;
  }

  public void selectFromDropDown(String option) {
    Select dropdownElement = new Select(driver.findElement(dropdown));
    dropdownElement.selectByVisibleText(option);
  }

  public List<String> getSelectedOptions() {
    List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
    return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
  }

  private Select findDropDownElement() {
    return new Select(driver.findElement(dropdown));
  }
}
