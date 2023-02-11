package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LauchApplication {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.salesforce.com/in/");
	
	EdgeDriver edge = new EdgeDriver();
	edge.get("http://leaftaps.com/opentaps/control/main");
	}
}
