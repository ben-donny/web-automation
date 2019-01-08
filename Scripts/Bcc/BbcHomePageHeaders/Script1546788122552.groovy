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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.applicationUrl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(GlobalVariable.timeOut)

WebUI.click(findTestObject('Bbc/News'))

WebUI.waitForElementVisible(findTestObject('Bbc/NewLogo'), GlobalVariable.timeOut)

WebUI.back()

WebUI.click(findTestObject('Bbc/Sport'))

WebUI.waitForElementVisible(findTestObject('Bbc/SportLogo'), GlobalVariable.timeOut)

WebUI.back()

WebUI.click(findTestObject('Bbc/Weather'))

WebUI.waitForElementVisible(findTestObject('Bbc/WeatherLogo'), GlobalVariable.timeOut)

WebUI.back()

WebUI.click(findTestObject('Bbc/iPlayer'))

WebUI.waitForElementVisible(findTestObject('Bbc/iPlayerLogo'), GlobalVariable.timeOut)

WebUI.back()

WebUI.click(findTestObject('Bbc/Sound'))

WebUI.waitForElementVisible(findTestObject('Bbc/SoundLogo'), GlobalVariable.timeOut)

WebUI.closeBrowser()

