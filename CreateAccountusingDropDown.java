package homeassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountusingDropDown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Krithika Sathishkumar");
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dropDown = new Select(industry);
		dropDown.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dropDown1 = new Select(ownership);
		dropDown1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select dropDown2 = new Select(source);
		dropDown2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select dropDown3 = new Select(marketing);
		dropDown3.selectByIndex(6);
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select dropDown4 = new Select(state);
		dropDown4.selectByValue("TX");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		

	}
}
