package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class Login {

	@Given("User navigated to the Cura Healthcare system using URL")
	def naviagateToHomePage() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Login/h1_CURA Healthcare Service'))
	}


	@When ("User clicks on Make appointment button")
	def clickOnMakeAppointmentButton() {
		WebUI.click(findTestObject('Object Repository/Login/a_Make Appointment'))
	}

	@Then ("User should navigiates to Login Page")
	def verifyLoginPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/h2_Login'),0)
	}

	@When("User enters (.*) and (.*)")
	def enterValidCredentials(String userName, String password){
		WebUI.setText(findTestObject('Object Repository/Login/input_Username_username'),userName)
		WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_password'), password)
	}

	@And("User clicks on Login button")
	def clickOnLoginButton() {
		WebUI.click(findTestObject('Object Repository/Login/button_Login'))
	}

	@Then ("User should be navigated to the Appointment Homepage")
	def verifyAppointmentPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/h2_Make Appointment'),0)
		WebUI.closeBrowser()
	}
	
	@Then("Error message should appear")
	def verifyErrorMessage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/LoginErrorMessage'),0)
		WebUI.closeBrowser()
	}
}
