package chrome;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();//setup
		WebDriver driver = new ChromeDriver();//open
		driver.manage().window().maximize();//maximize
//		WebElement element = driver.findElement(By.tagName("div")); // Not required line
		
//         driver.get("https://www.google.com/");
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/finders/");

//// 	For handling drop-downs.		
		//driver.get("https://www.flygofirst.com/offers-and-promotions/tue-wed-flying-offer/");
		//WebElement dropDown = driver.findElement(By.xpath("//select[@id='websites']"));//webelment type alli ee dropdown na store maadthidhiv
		//Select selectDropDown = new Select(dropDown);
//		selectDropDown.selectByVisibleText("7 Adults");
//		selectDropDown.selectByValue("5");
		//selectDropDown.selectByIndex(1);
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//label[@for='Citizen'])[1]")).click();
		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("(//label[@for='Citizen'])[1]")).click();
//		
//		Thread.sleep(1000);
//		
//		driver.quit();
		
		
////	For google site entering text and clicking button		
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation Key testing");
//		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
//		
////    to get the list of all the anchor tag elements and print their text from selenium site
		List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement e : elements) {
            System.out.println(e.getText());
        }

	}

}
