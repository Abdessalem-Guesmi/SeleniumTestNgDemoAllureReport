package base;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTests {
	protected static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public static WebDriver initialize_driver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		tdriver.set(driver);
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	/*
	 * @BeforeSuite void setAllureEnvironment() {
	 * allureEnvironmentWriter(ImmutableMap.<String, String>builder().put("Browser",
	 * "Chrome") .put("Browser.Version", "70.0.3538.77").put("URL",
	 * "https://google.com").build(), System.getProperty("user.dir") +
	 * "/allure-results/"); }
	 */

	@BeforeSuite
	public void setAllureEnvironment() {
		Date d = new Date();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		allureEnvironmentWriter(
				ImmutableMap.<String, String>builder().put("Date", date).put("Browser", "Chrome")
						.put("Tester", "Abdessalem-Guesmi").put("Browser.Version", "70.0.3538.77")
						.put("URL", "https://google.com").put("System", "Window 7").build(),
				System.getProperty("user.dir") + "/allure-results/");
	}

	@BeforeMethod
	public void setUp() {
		initialize_driver();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
