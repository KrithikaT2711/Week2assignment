package homeassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		driver.findElement(By.xpath("(//div[@class='col-12']/div)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='col-12']/div)[3]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		/*WebElement enable = driver.findElement(By.xpath("(//div[@class='col-12']/div)[4]"));
		if (enable.isDisplayed()) {
			System.out.println("CheckBox is enabled");

		} else {
			System.out.println("CheckBox is Disabled");
		}*/
		driver.close();
	}
}
