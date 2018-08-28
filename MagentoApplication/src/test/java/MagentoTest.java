import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class MagentoTest {
@Test
public void test() throws Exception
{
String url="http://www.magento.com";
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(url);
Home h=new Home(driver);
h.clickOnMyacc();
Thread.sleep(2000);
Login l=new Login(driver);
l.typeEmail("Subramanyaraj87@gmail.com");
Thread.sleep(2000);
l.typePassword("Welcome123");
Thread.sleep(2000);
l.clickLogin();
Thread.sleep(2000);
Main m=new Main(driver);
m.clickOnlogout();
Thread.sleep(2000);


	}
	

}
