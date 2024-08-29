package BasicsSelenium;

//WAP to launch amazon, search shoes then select 5th option ?

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.ah.A;

public class Assignment155 {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement A1 = driver.findElement(By.id("searchDropdownBox"));  //twotabsearchtextbox
		A1.sendKeys("shoes");
		for (int i =0; i<=38; i++)
		{
		Thread.sleep(500);
		A1.sendKeys("Shoes");
		
		}
		
		WebElement A2 = driver.findElement(By.id("searchDropdownBox"));
		
		 A2.sendKeys("Shoes");
		 A2.sendKeys(Keys.ARROW_DOWN);
		
        
        A1.sendKeys(Keys.ENTER);
		
		

	}

}
