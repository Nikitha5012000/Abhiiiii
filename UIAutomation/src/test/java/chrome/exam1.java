package chrome;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;

public class exam1 {
	WebDriver driver ;
  @Test
  public void f() {
	  driver.get("https://www.selenium.dev/documentation/webdriver/elements/finders/");
	  List<WebElement> elements = driver.findElements(By.tagName("a"));
      for (WebElement e : elements) {
          System.out.println(e.getText());
      }
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();//setup
		 driver = new ChromeDriver();//open
		driver.manage().window().maximize();//maximize
  }

}
