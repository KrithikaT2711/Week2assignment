package homeassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("(//label[text()='Safari'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		WebElement check = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[6]"));
		if (check.isEnabled()) {
			System.out.println("The check box is selected");
					
		}else {
			System.out.println("The check box is not selected");
		}
		driver.close();
	}

}
