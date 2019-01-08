package efc

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class CustomOpenBrowser {

	@Keyword
	public void openBrowser(){

		WebUI.openBrowser("https://www.efinancialcareers.co.uk")
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.maximizeWindow()
	}

	@Keyword
	public void closeBrowser(){

		WebUI.switchToDefaultContent()
		WebUI.switchToWindowIndex(0)
		WebUI.closeBrowser()
	}

	@Keyword
	public void closeRandomWindow(){

		if(WebUI.verifyElementPresent(findTestObject('Efc/ResumeUploadandCoverLetter/closerandomwindow'), GlobalVariable.timeOut, FailureHandling.OPTIONAL)){

			WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/closerandomwindow'), FailureHandling.CONTINUE_ON_FAILURE)
		}
	}
}