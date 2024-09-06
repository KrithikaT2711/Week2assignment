package homeassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
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
	driver.findElement(By.id("accountName")).sendKeys("Sathish");
	driver.findElement(By.id("numberEmployees")).sendKeys("2");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.close();
	
	
	
}
}
