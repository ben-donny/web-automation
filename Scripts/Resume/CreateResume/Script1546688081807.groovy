import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.SetupTestCase as SetupTestCase
import com.kms.katalon.core.annotation.TearDown as TearDown
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

WebUI.verifyElementPresent(findTestObject('Efc/EfcLoginPage/WelcomeMessage'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Efc/EfcLoginPage/ProfileLink'))

WebUI.delay(20)

WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/profilebutton'))

WebUI.delay(20)

CustomKeywords.'efc.CustomOpenBrowser.closeRandomWindow'()

WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/documentlibrarylink'))

WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/uploadCvLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.timeOut)

WebUI.waitForElementVisible(findTestObject('Efc/ResumeUploadandCoverLetter/browserforyourcv'), GlobalVariable.timeOut)

WebUI.uploadFile(findTestObject('Efc/ResumeUploadandCoverLetter/browserforyourcv'), 'C:\\Users\\user\\Desktop\\TestingResume\\BurningGlassResumeInPDFFormat.pdf')

WebUI.waitForElementVisible(findTestObject('Efc/ResumeUploadandCoverLetter/uploadCV2'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/uploadCV2'))

WebUI.waitForElementVisible(findTestObject('Efc/ResumeUploadandCoverLetter/cvuploadedsuccessmessage'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/cvuploadedsuccessmessage'))

WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/deleteresume'))

WebUI.waitForElementVisible(findTestObject('Efc/ResumeUploadandCoverLetter/confirmresumedelete'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Efc/ResumeUploadandCoverLetter/confirmresumedelete'))

@com.kms.katalon.core.annotation.SetUp
def initialize() {
    CustomKeywords.'login.LoginHelper.loginIntoApplicationWithGlobalVariable'()
}

