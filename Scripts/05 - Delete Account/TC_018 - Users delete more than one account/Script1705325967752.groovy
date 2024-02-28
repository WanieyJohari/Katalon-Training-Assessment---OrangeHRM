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

WebUI.callTestCase(findTestCase('01 - Login Functionality/POSITIVE/TC_001 - User Successfully Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('03 - Search Users/03- TC_008-search_Invalid_User/Page_OrangeHRM/li_User Management'))

WebUI.click(findTestObject('03 - Search Users/03- TC_008-search_Invalid_User/Page_OrangeHRM/li_Users'))

WebUI.click(findTestObject('05 - Delete Account/05-TC_018-delete_More_Than_One/Page_OrangeHRM/label_Joe'))

WebUI.click(findTestObject('05 - Delete Account/05-TC_018-delete_More_Than_One/Page_OrangeHRM/label_Cecil'))

WebUI.click(findTestObject('05 - Delete Account/05-TC_018-delete_More_Than_One/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('05 - Delete Account/05-TC_018-delete_More_Than_One/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementPresent(findTestObject('05 - Delete Account/05-TC_017-success_Account_Delete/Page_OrangeHRM/p_Success'), 
    5)
