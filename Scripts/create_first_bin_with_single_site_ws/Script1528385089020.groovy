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

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/span_Sites and Bins'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/a_Bins'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_Create a Bin'))

WebUI.setText(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/input_name'), 'FirstBin')

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_Continue'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/strong_skip this step'))

/*WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/span_Select'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/div_919'))

WebUI.waitForElementPresent(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/span_Select'), 
    2)

WebUI.waitForElementClickable(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/span_Select'), 
    2)

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/span_Select'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/div_Blackbean'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_Continue_1'))*/

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/strong_skip this step'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_Continue_1'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/strong_skip this step'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_Continue_2'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/strong_skip this step'))

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/strong_skip this step'))

WebUI.waitForElementPresent(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_View Bin'), 
    2)

WebUI.waitForElementClickable(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_View Bin'), 
    2)

WebUI.click(findTestObject('create_first_bin_with_single_site_ws/Page_Sites and Bins - OPI Blue/button_View Bin'))

WebUI.waitForElementPresent(GlobalVariable.logOut, 2)

WebUI.waitForElementClickable(GlobalVariable.logOut, 2)

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()

