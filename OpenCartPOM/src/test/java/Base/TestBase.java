package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase 
{
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase()
	{
		prop = new Properties();
		FileInputStream fin;		
		
		String path = System.getProperty("user.dir")+"//src//test//resources//Properties//config.properties";
		
		try
		{
			fin = new FileInputStream(path);
			prop.load(fin);
		}
		catch(FileNotFoundException e)
		{e.printStackTrace();}
		catch(IOException e)
		{e.printStackTrace();}
	}
	
	public static void initialize()
	{
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("chromedriver"),prop.getProperty("chromedriverpath"));
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty(prop.getProperty("edgedriver"),prop.getProperty("edgedriverpath"));	
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("You have not given correct browser....");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	//	driver.get(prop.getProperty("URL"));
	}
	
}
