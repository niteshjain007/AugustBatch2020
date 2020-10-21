package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



import utilities.TestUtilities;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public TestBase(){
		prop=new Properties();
		try {
		FileInputStream fi = new FileInputStream("src\\main\\java\\config\\config.properties");
		prop.load(fi);
		}catch(FileNotFoundException f)
		{
			f.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void openBrowser(){
		
		String testBrowser=prop.getProperty("browser");
		if(testBrowser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		if(testBrowser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
			driver=new FirefoxDriver(); 
		}
		
		driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		String testURL= prop.getProperty("url");
		driver.get(testURL);
	}
	
	public WebDriver getDriverInstance()
	{
		return this.driver;
	}
}
