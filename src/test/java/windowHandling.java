import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
/*
driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
WebElement btn=driver.findElement(By.xpath("//button[@title='New Tab']"));
btn.click();

String parent=driver.getWindowHandle();
Set<String> allwindows=driver.getWindowHandles();

for(String all:allwindows) {
	driver.switchTo().window(all);
	String allTitle=driver.getTitle();
	System.out.println(allTitle);
	
}
driver.switchTo().window(parent);
String parentTile=driver.getTitle();
System.out.println(parentTile);
	*/
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
String allTitle=driver.getTitle();
System.out.println(allTitle);



driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
String allTitle1=driver.getTitle();
System.out.println(allTitle1);
	
	}

}
