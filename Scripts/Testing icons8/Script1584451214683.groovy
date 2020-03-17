import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://icons8.com/icons#')

WebUI.click(findTestObject('Object Repository/Page_Free Icons/div_Icons_app-popup-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Free Icons/div_Lunacy'))

WebUI.click(findTestObject('Object Repository/Page_Free Graphic Design Software/div_Lunacy'))

WebUI.click(findTestObject('Object Repository/Page_Free Graphic Design Software/div_Moose'))

WebUI.click(findTestObject('Object Repository/Page_Free Stock Photos - Simply Beautiful C_7e79fc/div_Stock PhotosCollagesTransparent PNGBack_7a628e'))

WebUI.click(findTestObject('Object Repository/Page_Free Stock Photos - Simply Beautiful C_7e79fc/a_Stock Photos_logo nuxt-link-exact-active _ae525f'))

WebUI.click(findTestObject('Object Repository/Page_Free Graphic Design Software/div_Lunacy'))

WebUI.click(findTestObject('Object Repository/Page_Free Graphic Design Software/div_Music'))

WebUI.click(findTestObject('Object Repository/Page_Free Icons/a_Programming'))

WebUI.click(findTestObject('Object Repository/Page_Programming Icons/div_Trends198'))

