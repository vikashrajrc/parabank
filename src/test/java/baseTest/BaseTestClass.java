package baseTest;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTestClass {

	public static WebDriver driver;
	public static Properties properties;
	public static org.apache.logging.log4j.Logger logger;
	public static String username = RandomStringUtils.randomAlphabetic(6).toLowerCase().toString();

	public ExtentReports extentReports;
	public ExtentSparkReporter extentSparkReporter;
//	extentReports.attachReporter(extentSparkReporter);
	public ExtentTest extentTest;

	@BeforeClass
	public void start(ITestContext context) throws IOException {

		FileReader fileReader = new FileReader(
				"/Users/vikash/eclipse-workspace/paraBankAutomation/src/test/resources/confg.properties");

		properties = new Properties();
		properties.load(fileReader);

		logger = LogManager.getLogger(this.getClass());

		logger.info("->>> testcase is started <<<-");

		driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup(); 

		extentReports = new ExtentReports();
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("report.html");
		extentReports.attachReporter(extentSparkReporter);

//		extentReports.createTest(Context.)
		extentTest = extentReports.createTest(context.getName());
		
		extentTest.log(Status.INFO, "chrome launched and navigated to url");

		driver.get(properties.getProperty("url"));

		logger.info("url opened");

//		System.out.println(username);

	}

	@AfterClass
	public void stop() throws IOException {

		driver.quit();
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}
}
