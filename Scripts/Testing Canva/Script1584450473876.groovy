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

WebUI.navigateToUrl('https://www.canva.com/')

WebUI.click(findTestObject('Object Repository/Page_Collaborate  Create Amazing Graphic De_aa36ae/span_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Collaborate  Create Amazing Graphic De_aa36ae/input_OR_email'), 'yashinta10novita@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Collaborate  Create Amazing Graphic De_aa36ae/input_OR_s-JGcg n9zSJA ZTpOuQ T9BsEA'), 
    'Ou9ddXBven7Yhd0VpVEAsw==')

WebUI.click(findTestObject('Object Repository/Page_Collaborate  Create Amazing Graphic De_aa36ae/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Beranda - Canva/svg'))

WebUI.click(findTestObject('Object Repository/Page_Beranda - Canva/span_Pengaturan akun'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan akun - Canva/svg'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan akun - Canva/span_Rekomendasikan ke teman'))

WebUI.click(findTestObject('Object Repository/Page_Program Hadiah - Canva/svg'))

WebUI.click(findTestObject('Object Repository/Page_Program Hadiah - Canva/span_Dapatkan bantuan'))

WebUI.click(findTestObject('Object Repository/Page_Program Hadiah - Canva/svg'))

WebUI.click(findTestObject('Object Repository/Page_Program Hadiah - Canva/span_Keluar'))

