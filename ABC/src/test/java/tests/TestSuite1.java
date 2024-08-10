package tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestSuite1 {

	@Test
	public void test1() {
		String path="C:\\Users\\suman\\eclipse-workspace_3\\ABC\\target\\report.html";
		ExtentReports report=new ExtentReports(path);
		ExtentTest test=report.startTest("test1");
		test.log(LogStatus.PASS, "test strated");
		test.log(LogStatus.INFO, "test is getting executed ");
		test.log(LogStatus.PASS, "test completed");
		report.endTest(test);
		report.flush();
		report.close();
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}

}
