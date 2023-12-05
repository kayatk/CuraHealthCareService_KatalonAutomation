package appoinment

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

public class MakeAppointment {
	@Given ("User logged into the system with valid credentials (.*) and (.*)")
	def loginSystem(String userName,String password) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		WebUI.click(findTestObject('Object Repository/Login/a_Make Appointment'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/h2_Login'),0)
		WebUI.setText(findTestObject('Object Repository/Login/input_Username_username'),userName)
		WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_password'), password)
		WebUI.click(findTestObject('Object Repository/Login/button_Login'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/h2_Make Appointment'),0)
	}

	@When ("User selects (.*)")
	def selectFacility(String facility) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Appointment/facility'),
				facility, true)
	}

	@And("Selects healthcare (.*)")
	def selectsHealthcareProgram(String program) {
		WebUI.click(findTestObject('Object Repository/Appointment/input_'+program+'_programs'))
	}

	@And("Select a (.*) to the Appointment")
	def selectAppointmentDate(String date) {
		//WebUI.waitForElementClickable('Object Repository/Appointment/input_Visit Date (Required)_visit_date', 30)
		WebUI.setText(findTestObject('Object Repository/Appointment/visitDate'),
				date)
	}

	@And ("enter (.*)")
	def enterComments(String comments) {
		WebUI.setText(findTestObject('Object Repository/Appointment/textarea_Comment_comment'), comments)
	}

	@And("Click on book Appointment button")
	def clickAppointmentButton() {
		WebUI.click(findTestObject('Object Repository/Appointment/button_Book Appointment'))
	}

	@Then ("Appointment Confirmation message should appear")
	def verifyConfirmationMessage() {
		WebUI.click(findTestObject('Object Repository/Appointment/h2_Appointment Confirmation'))
	}
}
