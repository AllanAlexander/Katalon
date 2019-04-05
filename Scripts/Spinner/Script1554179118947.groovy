import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demoqa.com/spinner/')
WebUI.setText(findTestObject('Object Repository/SpinnerTestCase/TextField'), '1')
WebUI.sendKeys(findTestObject('Object Repository/SpinnerTestCase/TextField'), Keys.chord(Keys.TAB))
WebUI.getAttribute(findTestObject('Object Repository/SpinnerTestCase/TextField'), 'aria-valuenow')
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/Toggle'))
WebUI.verifyElementNotClickable(findTestObject('Object Repository/SpinnerTestCase/TextField'))
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/Toggle'))
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/WidgetUp'))
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/WidgetUp'))
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/SpinnerTestCase/TextField'), 'aria-valuenow', '3', 0)
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/WdgetDown'))
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/SpinnerTestCase/TextField'), 'aria-valuenow', '2', 0)
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/Widget'))
WebUI.verifyElementNotHasAttribute(findTestObject('Object Repository/SpinnerTestCase/TextField'), 'span', 0)
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/Widget'))
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/SetButton'))
WebUI.click(findTestObject('Object Repository/SpinnerTestCase/GetButton'))
alertText = WebUI.getAlertText()
WebUI.verifyMatch(alertText, '5', false)
WebUI.acceptAlert()
