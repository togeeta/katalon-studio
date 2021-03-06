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

/*WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(GlobalVariable.setUsername, GlobalVariable.username)

WebUI.setText(GlobalVariable.setPassword, GlobalVariable.password)

WebUI.click(GlobalVariable.logInBtn)

WebUI.click(findTestObject('dashboard_tiles/Page_Dashboard - OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('dashboard_tiles/Page_Dashboard - OPI Blue/figure_Grain Condition'))

WebUI.click(findTestObject('dashboard_tiles/Page_Dashboard - OPI Blue/a_Dashboard'))

//WebUI.click(findTestObject('dashboard_tiles/Page_Grain Condition - OPI Blue/a_Dashboard'))
WebUI.click(findTestObject('dashboard_tiles/Page_Dashboard - OPI Blue/figure_Inventory'))

WebUI.click(findTestObject('dashboard_tiles/Page_Inventory - OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('dashboard_tiles/Page_Dashboard - OPI Blue/div_1                        1'))

WebUI.click(findTestObject('dashboard_tiles/Page_Global View - OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('dashboard_tiles/Page_Dashboard - OPI Blue/figure_System Status'))

WebUI.click(findTestObject('dashboard_tiles/Page_System Status - OPI Blue/a_Dashboard'))

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()*/

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(GlobalVariable.setUsername, GlobalVariable.username)

WebUI.setText(GlobalVariable.setPassword, GlobalVariable.password)

WebUI.click(GlobalVariable.logInBtn)

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/figure_Grain Condition'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/figure_Inventory    0 bu'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/figure_Global View    1 0   Si'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/figure_System Status    0'))

WebUI.click(findTestObject('dashboard_tiles/qa/Page_OPI Blue/a_Dashboard'))

WebUI.click(GlobalVariable.logOut)

WebUI.closeBrowser()

