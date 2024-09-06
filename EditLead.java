package homeassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("Amazon");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("Deivakani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Thangamani");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Deivakani");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Thangamani");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non-IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Digital Associate");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thangamanikiruthika@gmail.com");
		WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(dropDown);
		state.selectByVisibleText("New York");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Digital Associate");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
