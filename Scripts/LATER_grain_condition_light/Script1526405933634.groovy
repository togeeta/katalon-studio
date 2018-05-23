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

WebUI.setText(findTestObject('grain_condition_light/Page_OPI Blue (1)/input_username'), 'opiopi20171+00028@gmail.com')

WebUI.setText(findTestObject('grain_condition_light/Page_OPI Blue (1)/input_password'), 'gWF7Q4IlreZBZUpxglt7')

WebUI.click(findTestObject('grain_condition_light/Page_OPI Blue (1)/span_Log In'))

WebUI.click(findTestObject('grain_condition_light/Page_Grain Condition - OPI Blue/a_Dashboard'))

switch (grainDangerCount) {
    case grainDangerCount > 0:
        WebUI.click(findTestObject('grain_condition_light/Page_Dashboard - OPI Blue/div_trafficRed'))

        break
    case grainDangerCount == 0:
        WebUI.click(findTestObject('grain_condition_light/Page_Grain Condition - OPI Blue/a_Dashboard'))

        break
    default:
        break
}

/*Just for practice:
 * Switch Statement			grainDangerCount
	Case Statement			Case grainDangerCount == 0
	Click		trafficRed
	Break Statement
	Case Statement			Case grainDangerCount > 0
	Click 		trafficRed
	Break Statement
	Case Statement			Case grainWarningCount == 0
	Click 		trafficYellow
	Break Statement
	Case Statement 			Case grainWarningCount > 0
	Click 		trafficYellow
	Break Statement
	Case Statement			Case grainDangerCount == 0
	Click 		trafficGreen
	Break Statement
	Case Statement			Case grainDangerCount > 0
	Click 		trafficGreen
	Break Statement
	Default Statement
	Click		div_grainTile
	Break Statement
 */

/*WebUI.click(findTestObject('grain_condition_light/Page_Dashboard - OPI Blue (1)/div_grainTile'))

WebUI.click(findTestObject('grain_condition_light/Page_Grain Condition - OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('grain_condition_light/Page_Dashboard - OPI Blue (1)/div_trafficRed'))

WebUI.click(findTestObject('grain_condition_light/Page_Grain Condition - OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('grain_condition_light/Page_Dashboard - OPI Blue (1)/div_trafficYellow'))

WebUI.click(findTestObject('grain_condition_light/Page_Grain Condition - OPI Blue/a_Dashboard'))

WebUI.click(findTestObject('grain_condition_light/Page_Dashboard - OPI Blue (1)/div_trafficGreen'))

WebUI.click(findTestObject('grain_condition_light/Page_Grain Condition - OPI Blue/a_Dashboard'))*/

WebUI.click(findTestObject('grain_condition_light/Page_Dashboard - OPI Blue (1)/a_Log out'))

WebUI.closeBrowser()

