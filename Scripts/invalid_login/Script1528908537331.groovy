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

WebUI.navigateToUrl(GlobalVariable.baseUrl)

//valid user name
WebUI.setText(GlobalVariable.setUsername, GlobalVariable.username)

//valid password
WebUI.setText(GlobalVariable.setPassword, GlobalVariable.password)

//invalid user name
//WebUI.setText(findTestObject('invalid_login/Page_OPI Blue/input_username'), 'dsf@gmail.com')

//invalid password
//WebUI.setText(findTestObject('invalid_login/Page_OPI Blue/input_password'), '1234')

WebUI.click(GlobalVariable.logInBtn)

//WebUI.click(findTestObject('invalid_login/Page_OPI Blue/div_Invalid username or passwo'))

WebUI.click(findTestObject('invalid_login/Page_OPI Blue/div_Invalid username or passwo_1'))

WebUI.getText(findTestObject('invalid_login/Page_OPI Blue/div_Invalid username or passwo_1'))

WebUI.verifyTextPresent("Invalid username or password", true)

WebUI.closeBrowser()

