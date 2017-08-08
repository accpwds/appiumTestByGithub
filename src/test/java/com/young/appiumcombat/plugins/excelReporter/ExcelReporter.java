package com.young.appiumcombat.plugins.excelReporter;
import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import com.young.appiumcombat.plugins.excelReporter.utils.CreateExcelForResult;

public class ExcelReporter implements IReporter {
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		CreateExcelForResult.createExcelReport(xmlSuites, suites,outputDirectory);
		
	}

	
}
