package Jenkins.SeleniumJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest1 {
	WebDriver driver;

  @Test
  public void f() {
      driver = new ChromeDriver();
      driver.get("https://google.com");
      driver.manage().window().maximize();

  }
}
