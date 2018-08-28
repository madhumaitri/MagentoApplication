import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main
{
	WebDriver driver;
	By logout=By.linkText("log out");
	public Main(WebDriver driver)
	{
		this.driver=driver;
	}
public void clickOnlogout()
{
	driver.findElement(logout).click();
}
}
