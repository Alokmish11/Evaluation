package ExtendReport;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportTest {
	ExtentReports extent;
	ExtentTest test;
  
	// import BeforeMethod
	@BeforeTest
	public void setup() {

		// Create Extent Report
		extent=new ExtentReports();
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("report.html");
		extent.attachReporter(reporter);
		
	}
	// import Test Annotations
	@Test
	public void textExample() {
		test = extent.createTest("Example Test");
		Assert.assertTrue(true);
		test.pass("Test passed");
				
	}
	// AfteMethod
	@AfterTest
	public void tearDown() {
		extent.flush();
	}
	
	
}
