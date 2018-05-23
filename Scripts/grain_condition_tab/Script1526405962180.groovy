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

WebUI.setText(findTestObject('grain_condition_tab/Page_OPI Blue/input_username'), 'opiopi20171+00028@gmail.com')

WebUI.setText(findTestObject('grain_condition_tab/Page_OPI Blue/input_password'), 'gWF7Q4IlreZBZUpxglt7')

WebUI.click(findTestObject('grain_condition_tab/Page_OPI Blue/span_Log In'))

WebUI.click(findTestObject('grain_condition_tab/Page_Dashboard - OPI Blue/a_Grain Condition'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_Grain Type'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_Total (bu)'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_Value ()'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_Max Temp (F)'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_Avg MC ()'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_Bin Name'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_View Settings'))

WebUI.click(findTestObject('grain_condition_tab/Page_Sites and Bins - OPI Blue/a_Grain Condition'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/a_Show Legend'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/a_Hide Legend'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/i_icon-edit'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_Cancel'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/div_Temperature'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/span_Moisture Content'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/button_View Data'))

WebUI.click(findTestObject('grain_condition_tab/Page_Bin Data - OPI Blue/a_Grain Condition'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/span_Hide Filters'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/span_Show Filters'))

WebUI.click(findTestObject('grain_condition_tab/Page_Grain Condition - OPI Blue/span_Hide Filters'))

WebUI.closeBrowser()

