package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	static public WebDriver driver;
	public Logger logger;
	public Properties p;
	
//	@BeforeClass(groups= {"sanity","regression","master"})
//	@Parameters({"os", "browser"})
	
	@BeforeClass
	public void setup() throws Exception {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		
	}
	
	@AfterClass(groups = {"sanity", "regression", "master"})
	public void tearDown() {
		
		driver.quit();
	}
	
	
//	public String randomeString()
//	{
//		String generatedString=RandomStringUtils.randomAlphabetic(5);
//		return generatedString;
//	}
//	
//	public String randomeNumber()
//	{
//		String generatedString=RandomStringUtils.randomNumeric(10);
//		return generatedString;
//	}
//	
//	public String randomAlphaNumeric()
//	{
//		String str=RandomStringUtils.randomAlphabetic(3);
//		String num=RandomStringUtils.randomNumeric(3);
//		
//		return (str+"@"+num);
//	}
//	
//	public String captureScreen(String tname) throws IOException {
//
//		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//				
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		
//		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
//		File targetFile=new File(targetFilePath);
//		
//		sourceFile.renameTo(targetFile);
//			
//		return targetFilePath;
//
//	}

}
