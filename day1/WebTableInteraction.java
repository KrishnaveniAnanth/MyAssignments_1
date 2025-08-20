package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://erail.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter "MAS" as the "From" station
		WebElement fromElement = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromElement.clear();
		fromElement.sendKeys("MAS");
		fromElement.sendKeys(Keys.TAB);

		// Enter "MDU" as the "To" station
		WebElement toElement = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toElement.clear();
		toElement.sendKeys("MDU");
		toElement.sendKeys(Keys.TAB);

		// Uncheck the "Sort on Date" checkbox
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();

		// Retrieve the train names from the web table
		List<WebElement> trainElements = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		System.out.println("Total number of trains: " + trainElements.size());
		
		// Check duplicate trains
		Set<String> trainSet = new HashSet<String>();
		boolean duplicateTrain = false;
		for (WebElement trainNames : trainElements) {
			String text = trainNames.getText();
			if (!trainSet.add(text)) {
				System.out.println("Duplicate train names found: " + text);
				duplicateTrain = true;
			}

		}
		if (!duplicateTrain) {
			System.out.println("No duplicate train names found");
		}

		// Close the browser
		driver.quit();

	}

}
