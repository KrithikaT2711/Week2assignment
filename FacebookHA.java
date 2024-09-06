package homeassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHA {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Krithika");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Thangamani");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9361193199");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Sathish@2022");
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select dropDown = new Select(date);
		dropDown.selectByVisibleText("27");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select dropDown1 = new Select(month);
		dropDown1.selectByValue("11");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select dropDown2 = new Select(year);
		dropDown2.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

}
