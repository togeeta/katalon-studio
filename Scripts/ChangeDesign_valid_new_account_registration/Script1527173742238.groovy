import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ra.managegrain.com/#/dashboard/userPreferences')

WebUI.click(findTestObject('valid_new_account_registration/Page_OPI Blue/a_Register new account'))

WebUI.setText(findTestObject('valid_new_account_registration/Page_OPI Blue/input_email'), 'opiopi20171+200@gmail.com')

WebUI.setText(findTestObject('valid_new_account_registration/Page_OPI Blue/input_firstname'), 'Test-FN')

WebUI.setText(findTestObject('valid_new_account_registration/Page_OPI Blue/input_lastname'), 'Test-LN')

WebUI.setText(findTestObject('valid_new_account_registration/Page_OPI Blue/input_password'), 'Test-2000')

WebUI.setText(findTestObject('valid_new_account_registration/Page_OPI Blue/input_confirmPassword'), 'Test-2000')

WebUI.click(findTestObject('valid_new_account_registration/Page_OPI Blue/span_Register'))

WebUI.closeBrowser()

