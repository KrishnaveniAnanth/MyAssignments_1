package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://www.irctc.co.in");

		// maximize
		driver.manage().window().maximize();

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on ok button in alert
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		// click on FLIGHTS
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();

		// Window handling
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);

		// capture the title of new window
		driver.switchTo().window(window.get(1));
		String childtitle = driver.getTitle();
		System.out.println(childtitle);

		// close the parent window
		driver.switchTo().window(window.get(0));
		driver.close();

	}

}
