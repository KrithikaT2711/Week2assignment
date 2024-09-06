package homeassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGroundButton {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		String title = driver.getTitle();
		System.out.println("Title of this Page : " + title);
		//driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//To find the button us Enable or Disabeld
		WebElement check = driver.findElement(By.xpath("(//button[@role='button'])[2]"));
		if (check.isEnabled()) {
			System.out.println(" Enabled ");
			
		}else {
			System.out.println(" Disabled ");
		}
		
		//To find the position of the button
		WebElement position = driver.findElement(By.xpath("(//button[@role='button'])[2]"));
		Point location = position.getLocation();
		System.out.println("x and y co-ordinates : "+location);
		
		//To find the color of the button
		WebElement firstValue = driver.findElement(By.xpath("//span[text()='Save']"));
		String s = firstValue.getCssValue("border-color");
		System.out.println("Background color : " +s);
		
		//To find the height and width of the button
		WebElement size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		Dimension size2 = size.getSize();
		System.out.println(size2);
		
		driver.close();
	}

}
