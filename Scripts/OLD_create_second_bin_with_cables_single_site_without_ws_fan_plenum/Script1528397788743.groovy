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

WebUI.click(findTestObject('create_bin/Page_Dashboard - OPI Blue/span_Sites and Bins'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/a_Bins'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Create a Bin'))

WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_name'), 'Bin-1')

/*WebUI.waitForElementPresent(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b'), 3)

WebUI.waitForElementClickable(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b'), 3)

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/div_Site-1'))*/
WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue'))

WebUI.waitForElementPresent(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b_1'), 3)

WebUI.waitForElementClickable(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b_1'), 3)

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b_1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/div_919'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/b_2'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/div_Blackbean'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue_1'))

WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_ng-pristine ng-untouched'), '2018-01-01')

WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_capacity'), '1000')

not_run: WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_autoDetectGrainLevel'))

not_run: WebUI.setText(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/input_level'), '1000')

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue_1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue_1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/i_icon-plus'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/a_edit-btn'))

//WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/div_Add Cables'))
WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue_1'))

WebUI.waitForElementPresent(findTestObject('create_bin/create_bin_ws_contd_btn/Page_Sites and Bins - OPI Blue/Page_Sites and Bins - OPI Blue/button_Continue'), 
    3)

WebUI.waitForElementClickable(findTestObject('create_bin/create_bin_ws_contd_btn/Page_Sites and Bins - OPI Blue/Page_Sites and Bins - OPI Blue/button_Continue'), 
    3)

WebUI.click(findTestObject('create_bin/create_bin_ws_contd_btn/Page_Sites and Bins - OPI Blue/Page_Sites and Bins - OPI Blue/button_Continue'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue_1'))

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_Continue_3'))

WebUI.waitForElementPresent(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_View Bin'), 3)

WebUI.waitForElementClickable(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_View Bin'), 3)

WebUI.click(findTestObject('create_bin/Page_Sites and Bins - OPI Blue/button_View Bin'))

/*WebUI.click(findTestObject('create_bin/create_bin_add_fan/Page_Sites and Bins - OPI Blue/a_Fans'))

WebUI.click(findTestObject('create_bin/create_bin_add_fan/Page_Sites and Bins - OPI Blue/button_Add a Fan'))

WebUI.click(findTestObject('create_bin/create_bin_add_fan/Page_Sites and Bins - OPI Blue/span_Select'))

WebUI.click(findTestObject('create_bin/create_bin_add_fan/Page_Sites and Bins - OPI Blue/div_089CDB - FNR (MAC HFF0004)'))

WebUI.click(findTestObject('create_bin/create_bin_add_fan/Page_Sites and Bins - OPI Blue/b'))

WebUI.click(findTestObject('create_bin/create_bin_add_fan/Page_Sites and Bins - OPI Blue/div_1'))

WebUI.click(findTestObject('create_bin/create_bin_add_fan/Page_Sites and Bins - OPI Blue/button_Save'))*/

WebUI.waitForElementPresent(GlobalVariable.logOut, 5)

WebUI.waitForElementClickable(GlobalVariable.logOut, 5)

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()

