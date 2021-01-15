package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTests;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Test1 extends BaseTests {

	@Description("test 1")
	@Epic("EP001")
	@Feature("feature1: Test1")
	@Story("story1")
	@Step("step1")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 1)
	public void test1() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Test1");
		WebElement button = driver.findElement(By.name("btnK"));
		button.click();

		assertTrue(false, "text not equal");

	}

	@Description("test 2")
	@Epic("EP002")
	@Feature("feature2: Test2")
	@Story("story2")
	@Step("step2")
	@Severity(SeverityLevel.BLOCKER)
	@Test(priority = 2)
	public void test2() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Test2");
		WebElement button = driver.findElement(By.name("btnK"));
		button.click();

	}

	@Description("test 3")
	@Epic("EP003")
	@Feature("feature3: Test3")
	@Story("story3")
	@Step("step3")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 3)
	public void test3() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Test3");
		WebElement button = driver.findElement(By.name("btnK"));
		button.click();
		throw new SkipException("test-case skipped");

	}

	@Description("test 4")
	@Epic("EP004")
	@Feature("feature4: Test4")
	@Story("story4")
	@Step("step4")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 4)
	public void test4() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Text4");
		WebElement button = driver.findElement(By.name("btnK"));
		button.click();

	}
}
