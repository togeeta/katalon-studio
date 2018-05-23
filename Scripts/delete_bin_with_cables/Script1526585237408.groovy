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

WebUI.setText(findTestObject('delete_bin_with_cables/Page_OPI Blue/input_username'), 'opiopi20171+00028@gmail.com')

WebUI.setText(findTestObject('delete_bin_with_cables/Page_OPI Blue/input_password'), 'gWF7Q4IlreZBZUpxglt7')

WebUI.click(findTestObject('delete_bin_with_cables/Page_OPI Blue/button_Log In'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Dashboard - OPI Blue/span_Sites and Bins'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/a_Bins'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/button_Delete'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/button_Delete'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/button_Cancel'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/a_Cables'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/button_Edit'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/i_icon-pencil'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/i_icon-cancel-circled unmap-ic'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/i_icon-pencil_1'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/i_icon-cancel-circled unmap-ic_1'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/span_Save'))

WebUI.waitForElementClickable(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue (1)/button_Delete'), 
    2)

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue (1)/button_Delete'))

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/button_Delete'))

WebUI.waitForElementPresent(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/a_Log out'), 5)

WebUI.waitForElementClickable(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/a_Log out'), 5)

WebUI.click(findTestObject('delete_bin_with_cables/Page_Sites and Bins - OPI Blue/a_Log out'))

WebUI.closeBrowser()

