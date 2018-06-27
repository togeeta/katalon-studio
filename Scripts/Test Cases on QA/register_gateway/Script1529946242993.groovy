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

WebUI.setText(GlobalVariable.setUsername, GlobalVariable.username)

WebUI.setText(GlobalVariable.setPassword, GlobalVariable.password)

WebUI.click(GlobalVariable.logInBtn)

WebUI.click(findTestObject('register_gateway/Page_System Settings - OPI Blue/span_Gateways and Nodes'))

WebUI.waitForElementPresent(findTestObject('register_gateway/Page_OPI Blue/Page_Gateways and Nodes - OPI Blue/button_Register a Gateway'), 
    3)

WebUI.waitForElementVisible(findTestObject('register_gateway/Page_OPI Blue/Page_Gateways and Nodes - OPI Blue/button_Register a Gateway'), 
    2)

WebUI.waitForElementClickable(findTestObject('register_gateway/Page_OPI Blue/Page_Gateways and Nodes - OPI Blue/button_Register a Gateway'), 
    2)

WebUI.click(findTestObject('register_gateway/Page_OPI Blue/Page_Gateways and Nodes - OPI Blue/button_Register a Gateway'))

WebUI.setText(findTestObject('register_gateway/Page_Gateways and Nodes - OPI Blue/input_gatewayId'), '5F7DC8')

WebUI.setText(findTestObject('register_gateway/Page_Gateways and Nodes - OPI Blue/input_pin'), '4724')

WebUI.setText(findTestObject('register_gateway/Page_Gateways and Nodes - OPI Blue/input_gatewayName'), '5F7DC8-GW')

WebUI.click(findTestObject('register_gateway/Page_Gateways and Nodes - OPI Blue/button_Register'))

WebUI.waitForElementPresent(GlobalVariable.logOut, 5)

WebUI.waitForElementClickable(GlobalVariable.logOut, 5)

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()
