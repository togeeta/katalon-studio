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

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Dashboard - OPI Blue/span_Sites and Bins'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/a_Bins'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/a_Cables'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Edit'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/i_icon-pencil'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/i_icon-cancel-circled unmap-ic'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/i_icon-pencil_1'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/i_icon-cancel-circled unmap-ic_1'))

//WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/div_Bin-1'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Save'))

not_run: WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/a_Weather'))

WebUI.waitForElementPresent(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/a_Fans'), 
    3)

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/a_Fans'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Remove Fan'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Remove'))

WebUI.waitForElementPresent(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/a_Plenum'), 
    3)

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/a_Plenum'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Remove_1'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Remove'))

WebUI.waitForElementPresent(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Delete'), 
    3)

WebUI.waitForElementClickable(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Delete'), 
    3)

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Delete'))

WebUI.click(findTestObject('delete_bin_with_cables/delete_bin_with_cables_ws_fan_plenum/Page_Sites and Bins - OPI Blue/button_Delete'))

WebUI.waitForElementPresent(GlobalVariable.logOut, 5)

WebUI.waitForElementClickable(GlobalVariable.logOut, 5)

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()

