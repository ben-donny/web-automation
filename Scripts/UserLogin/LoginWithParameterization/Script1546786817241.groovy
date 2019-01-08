import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.applicationUrl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(GlobalVariable.timeOut)

WebUI.waitForElementVisible(findTestObject('Efc/EfcLoginPage/EfcLogo'), GlobalVariable.timeOut)

WebUI.verifyElementPresent(findTestObject('Efc/EfcLoginPage/SearchButton'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Efc/EfcLoginPage/LoginButton'))

WebUI.clearText(findTestObject('Efc/EfcLoginPage/UserName'))

WebUI.sendKeys(findTestObject('Efc/EfcLoginPage/UserName'), findTestData('UserData/New Test Data').getValue(1, 1))

WebUI.clearText(findTestObject('Efc/EfcLoginPage/Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Efc/EfcLoginPage/Password'), findTestData('UserData/New Test Data').getValue(2, 1))

WebUI.click(findTestObject('Efc/EfcLoginPage/LoginLink'))

WebUI.verifyElementPresent(findTestObject('Efc/EfcLoginPage/WelcomeMessage'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Efc/EfcLoginPage/ProfileLink'))

WebUI.scrollToElement(findTestObject('Efc/EfcLoginPage/Logout'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Efc/EfcLoginPage/Logout'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

