package utilites;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports createInstance() {

		String reportPath = System.getProperty("user.dir") + "/target/extent-report.html";

		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		spark.config().setReportName("Functional Testing");
		spark.config().setDocumentTitle("Automation Report");

		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Tester", "QA Engineer");
		return extent;

	}
}