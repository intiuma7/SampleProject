package reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;



public class Reporter {
	

	
	public static ExtentReports extent;
	//public static ExtentTest test;
	
	public static void intiReports()
	{
		if(Objects.isNull(extent)) {
		extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("Report.html");
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("bank Report");
		spark.config().setReportName("Web Auto Report");
	}}
	
	
	public static void fulshReport() throws IOException 
	{
		
		extent.flush();
	
		 Desktop.getDesktop().browse(new File("Report.html").toURI());
		}
	
	
	public static ExtentTest createTest(String Testcasename)
    {
		ExtentTest test=extent.createTest(Testcasename);
		return test;
		
    }
	

	
	

	}
