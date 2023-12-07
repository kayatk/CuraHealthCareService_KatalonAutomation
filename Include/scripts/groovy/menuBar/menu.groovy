package menuBar

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

import internal.GlobalVariable
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class menu {

	@When("User clicks on Side Menu")
	def clickOnMenu() {
		WebUI.click(findTestObject('Object Repository/Sidemenu/a_CURA Healthcare_menu-toggle'))
	}

	@And("Click on the (.*)")
	def clickOnOption(String option) {
		WebUI.click(findTestObject('Object Repository/Sidemenu/a_'+option ))
	}

	@Then ("User should navigate to respective page (.*)")
	def verifyNavigatedPage(String option) {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/'+option),0)
	}

	@And ("close the browser")
	def closeBrowser() {
		WebUI.closeBrowser()
	}
}
