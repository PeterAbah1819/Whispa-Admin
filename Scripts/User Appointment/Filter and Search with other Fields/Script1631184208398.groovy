import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://whispa.enyata.com/')

WebUI.setText(findTestObject('Object Repository/Page_Whispa/input_Kindly enter your details to log in_email'), 'cynthia@enyata.com')

WebUI.setEncryptedText(findTestObject('Page_Whispa/input_Email Address_password'), '9HEJnltZHpR7Xt0c+CphqQ==')

WebUI.click(findTestObject('Object Repository/Page_Whispa/button_Log in'))

WebUI.click(findTestObject('user appointments/span_User Appointment'))

WebUI.verifyTextPresent('User Appointment', false)

WebUI.verifyTextPresent('View all new and done appointments from users', false)

WebUI.click(findTestObject('user appointments/Filter and Search/div_Schedule_appointment-header-left-single2'))

WebUI.click(findTestObject('user appointments/Filter and Search/div_Schedule_appointment-header-left-single'))

WebUI.sendKeys(findTestObject('user appointments/Filter and Search/input_Schedule_search-div'), Keys.chord(Keys.ENTER, 'john doe'))

