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

WebUI.setText(findTestObject('side_navigation/Page_OPI Blue/input_username'), 'geetab@opisystems.com')

WebUI.setEncryptedText(findTestObject('side_navigation/Page_OPI Blue/input_password'), 'AxJDTdLFrIxqgdrTG1y5FQ==')

WebUI.click(findTestObject('side_navigation/Page_OPI Blue/button_Log In'))

WebUI.click(findTestObject('side_navigation/Page_Dashboard - OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('side_navigation/Page_Dashboard - OPI Blue/a_Grain Condition'))

WebUI.click(findTestObject('side_navigation/Page_Grain Condition - OPI Blue/span_Site Summary'))

WebUI.click(findTestObject('side_navigation/Page_Site Summary - OPI Blue/span_Bin Data'))

WebUI.click(findTestObject('side_navigation/Page_Bin Data - OPI Blue/a_Fan Control'))

WebUI.click(findTestObject('side_navigation/Page_Fan Control - OPI Blue/a_Inventory'))

WebUI.click(findTestObject('side_navigation/Page_Inventory - OPI Blue/a_Global View'))

WebUI.click(findTestObject('side_navigation/Page_Global View - OPI Blue/a_System Status'))

WebUI.click(findTestObject('side_navigation/Page_System Status - OPI Blue/a_System Settings'))

WebUI.click(findTestObject('side_navigation/Page_System Settings - OPI Blue/span_Gateways and Nodes'))

WebUI.click(findTestObject('side_navigation/Page_Gateways and Nodes - OPI Blue/span_Sites and Bins'))

WebUI.click(findTestObject('side_navigation/Page_Sites and Bins - OPI Blue/a_Account Details'))

WebUI.click(findTestObject('side_navigation/Page_Account Details - OPI Blue/span_Members'))

WebUI.click(findTestObject('side_navigation/Page_Members - OPI Blue/span_View as Customer'))

not_run: WebUI.click(findTestObject('side_navigation/Page_View as Customer - OPI Blue/a_1-800-661-1055 (opt 2)'))

WebUI.click(findTestObject('side_navigation/Page_View as Customer - OPI Blue/a_helpopisystems.com'))

WebUI.click(findTestObject('side_navigation/Page_View as Customer - OPI Blue/a_View manual'))

WebUI.waitForElementPresent(GlobalVariable.logOut, 2)

WebUI.waitForElementClickable(GlobalVariable.logOut, 2)

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()

