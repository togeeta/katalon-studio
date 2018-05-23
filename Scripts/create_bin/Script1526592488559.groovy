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

WebUI.setText(findTestObject('create_bin/Page_OPI Blue/input_username'), 'opiopi20171+00028@gmail.com')

WebUI.setText(findTestObject('create_bin/Page_OPI Blue/input_password'), 'gWF7Q4IlreZBZUpxglt7')

WebUI.click(findTestObject('create_bin/Page_OPI Blue/button_Log In'))

WebUI.click(findTestObject('create_bin/Page_Dashboard - OPI Blue/span_Sites and Bins'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/a_Bins'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Create a Bin'))

WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_name'), 'Bin-1')

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/div_Site-1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b_1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/div_919'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b_2'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/div_Blackbean'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/span_Continue'))

WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue (1)/input_ng-pristine ng-untouched'), '2018-01-01')

not_run: WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/td_Jan'))

not_run: WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/td_1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue (1)/input_autoDetectGrainLevel'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue (1)/input_capacity'), '100000')

not_run: WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_capacity'), '100000')

not_run: WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_autoDetectGrainLevel'))

not_run: WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_level'), '100000')

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/span_Continue'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/span_Continue'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/i_icon-plus'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/i_icon-plus_1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/span_Continue'))

WebUI.waitForElementClickable(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_View Bin'), 2)

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_View Bin'))

WebUI.waitForElementPresent(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/a_Log out'), 5)

WebUI.waitForElementClickable(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/a_Log out'), 5)

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/a_Log out'))

WebUI.closeBrowser()

