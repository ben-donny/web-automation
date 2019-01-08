package login

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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class LoginHelper {

	@Keyword
	public void loginIntoApplication(String applicationUrl, String username, String password){

		WebUI.openBrowser(applicationUrl)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.maximizeWindow()
		WebUI.waitForElementVisible(findTestObject('Efc/EfcLoginPage/EfcLogo'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Efc/EfcLoginPage/SearchButton'), GlobalVariable.timeOut)
		WebUI.click(findTestObject('Efc/EfcLoginPage/LoginButton'))
		WebUI.clearText(findTestObject('Efc/EfcLoginPage/UserName'))
		WebUI.sendKeys(findTestObject('Efc/EfcLoginPage/UserName'), username)
		WebUI.clearText(findTestObject('Efc/EfcLoginPage/Password'), FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(findTestObject('Efc/EfcLoginPage/Password'), password)
		WebUI.click(findTestObject('Efc/EfcLoginPage/LoginLink'))
		WebUI.delay(1)
	}


	@Keyword
	public void loginIntoApplicationWithGlobalVariable(){

		loginIntoApplication(GlobalVariable.baseUrl, GlobalVariable.username, GlobalVariable.password)
	}


	@Keyword
	public void logoutFromApplication(){

		WebUI.waitForElementVisible(findTestObject('Efc/EfcLoginPage/ProfileLink'), GlobalVariable.timeOut)
		WebUI.click(findTestObject('Efc/EfcLoginPage/ProfileLink'))

		WebUI.scrollToElement(findTestObject('Efc/EfcLoginPage/Logout'), GlobalVariable.timeOut)

		WebUI.click(findTestObject('Efc/EfcLoginPage/Logout'))

		WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
	}
}
