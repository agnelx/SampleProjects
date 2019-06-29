package runner;

import java.io.*;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import manager.FileReaderManager;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/SampleFeature",
		 glue= {"stepDefinitions"},
		 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" } ,
		 monochrome = true
 )

public class SampleTestRunner {

	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 
	 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
     Reporter.setSystemInfo("Machine", "Windows 10" );
     Reporter.setSystemInfo("Selenium", "3.141.59");
     Reporter.setSystemInfo("Maven", "4.0.0");
     Reporter.setSystemInfo("Java Version", "1.8.0_202");
	 }
	
	
	
}
