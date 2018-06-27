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

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Dashboard - OPI Blue/a_Grain Condition'))

not_run: WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/md-content_Please wait loading'))

WebUI.scrollToPosition(603, 327)

//WebUI.scrollToElement(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/div_SecondBin'))

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/div_SecondBin'))

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/i_icon-edit'))

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/a_Grain Info'))

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/a_Parameters'))

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/a_Alarm details'))

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/a_Overview'))

WebUI.click(findTestObject('grain_condition_tile_edit_icon/Page_Grain Condition - OPI Blue/button_Cancel'))

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()

