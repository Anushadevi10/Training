package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		//Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.foundit.in/seeker/registration");
        
        WebElement clickC = driver.findElement(By.xpath("//span[text()='Choose CV']"));
        clickC.click();
        
        
        Robot robo = new Robot();
        
        StringSelection path = new StringSelection("C:\\Drivers\\Test_RobotClass");
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
        robo.delay(2000);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(2000);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        
        robo.delay(2000);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.delay(2000);
        robo.keyRelease(KeyEvent.VK_V);
      
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(2000);
        robo.keyRelease(KeyEvent.VK_ENTER);
        		
        robo.delay(2000);
        driver.quit();

	}

}
