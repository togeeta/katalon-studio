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

WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Dashboard - OPI Blue/span_Sites and Bins'))

WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/a_Bins'))

WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/a_Plenum'))

WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/button_Add a Plenum Sensor'))

WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/span_Select'))

//WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/div_089CDB - FNR'))
WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/spy_web/Page_Sites and Bins - OPI Blue/div_089CDB-FN'))

WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/button_Save'))

/*WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/button_Remove'))

WebUI.click(findTestObject('create_bin_add_plenum_only/Page_Sites and Bins - OPI Blue/button_Remove_1'))*/

WebUI.waitForElementPresent(GlobalVariable.logOut, 5)

WebUI.waitForElementClickable(GlobalVariable.logOut, 5)

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()

