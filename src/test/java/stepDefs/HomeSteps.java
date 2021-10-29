package stepDefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeSteps {
    public static WebDriver driver;
@Test
    public void navigate(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
}



}
