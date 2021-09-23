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

WebUI.setEncryptedText(findTestObject('Page_Whispa/input_Email Address_password'), '8SQVv/p9jVQz2gZTiSc0Fg==')

WebUI.click(findTestObject('Object Repository/Page_Whispa/button_Log in'))

WebUI.delay(2)

WebUI.navigateToUrl('https://whispa.enyata.com/facility')

WebUI.verifyTextPresent('Facility Management', false)

WebUI.click(findTestObject('Facility/Add Facility/span_Add Facility'))

WebUI.setText(findTestObject('Facility/Add Facility/input__name'), 'JohnnaDoeson')

WebUI.click(findTestObject('Facility/Add Facility/div_Select an option'))

WebUI.click(findTestObject('Facility/Add Facility/div_Akwa Ibom'))

WebUI.setText(findTestObject('Facility/Add Facility/input_Select an option_city'), 'Oha Fia')

WebUI.setText(findTestObject('Facility/Add Facility/input_City_closest_landmark'), 'Church of Christ')

WebUI.setText(findTestObject('Facility/Add Facility/input_Landmark_full_address'), '3 Ohafia road by church of christ')

WebUI.click(findTestObject('Facility/Add Facility/input_STDs_STDs'))

WebUI.click(findTestObject('Facility/Add Facility/input_Cancer prevention_Cancer prevention'))

WebUI.click(findTestObject('Facility/Add Facility/input_STDsa_STDsa'))

WebUI.click(findTestObject('Facility/Add Facility/button_Create Facility'))

WebUI.closeBrowser()

