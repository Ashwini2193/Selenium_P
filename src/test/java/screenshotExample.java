import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
public class screenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
TakesScreenshot sc=(TakesScreenshot)driver;
File src=sc.getScreenshotAs(OutputType.FILE);
File dest=new File("C://Users/amutte/OneDrive - Capgemini/Desktop/a.jpg");
FileUtils.copyFile(src, dest);



	}

}
