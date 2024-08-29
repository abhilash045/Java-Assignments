package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
"WAP to check whether radio button is selected or not https://grotechminds.com/is-selected/"
*/
public class Assignment156 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/is-selected/");

		driver.manage().window().maximize();

		WebElement D1 = driver.findElement(By.id("vehicle2"));

		// D1.click(); //Before Select the radio button
		boolean B1 = D1.isSelected();
		System.out.println(B1);

		driver.quit();

	}

}
