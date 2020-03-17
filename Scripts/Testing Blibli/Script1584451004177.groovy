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

WebUI.navigateToUrl('https://www.blibli.com/')

WebUI.click(findTestObject('Object Repository/Page_/img_Bantuan 247_top-menu__chevron'))

WebUI.click(findTestObject('Object Repository/Page_/a_Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Pembayaran  Pusat Bantuan/a_Kembali'))

WebUI.click(findTestObject('Object Repository/Page_/a_Pengiriman'))

WebUI.click(findTestObject('Object Repository/Page_/span_Bantuan 247'))

WebUI.click(findTestObject('Object Repository/Page_/a_Pengembalian'))

WebUI.click(findTestObject('Object Repository/Page_/a_Panduan Lainnya'))

WebUI.click(findTestObject('Object Repository/Page_/span_customercarebliblicom'))

