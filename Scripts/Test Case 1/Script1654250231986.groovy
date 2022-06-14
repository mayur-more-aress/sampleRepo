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

WebUI.navigateToUrl('https://www.orangehrm.com/')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM HR Software  Free  Open Sour_43e816/a_Book a Free Demo'))

WebUI.setText(findTestObject('Object Repository/Page_Sign Up for a Free HR Software Demo  O_589e71/input_First Name_FirstName'), 
    'Name')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up for a Free HR Software Demo  O_589e71/input_Last Name_LastName'), 
    'last_Name')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up for a Free HR Software Demo  O_589e71/input_Email_Email'), 
    'mayur@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up for a Free HR Software Demo  O_589e71/input_Phone Number_Contact'), 
    '904990748')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sign Up for a Free HR Software Demo  O_589e71/select_- Select Country -AfghanistanAlbania_67af3b'), 
    'Bahamas', true)

