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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://training.openspan.com/login')

WebUI.setText(findTestObject('Object Repository/Login/Page_Sign In  Pega Studio Training Web Application/input_Please enter a user name of at least 4 characters_user_name'), 
    'Emmanuel')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Sign In  Pega Studio Training Web Application/input_Please enter a password of at least 4 characters_user_pass'), 
    '1XZoPq4kDiISqWkbUw207A==')

WebUI.sendKeys(findTestObject('Object Repository/Login/Page_Sign In  Pega Studio Training Web Application/input_Please enter a password of at least 4 characters_user_pass'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

