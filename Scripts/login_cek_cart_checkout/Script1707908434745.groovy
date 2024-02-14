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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\BRI\\Downloads\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/login/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText (1)'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText (2)'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/login/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('cek cart/keranjang'), 0)

try  {
	Mobile.verifyElementExist(findTestObject('Object Repository/cek cart/text_no_items_in_cart'), 0)
	
	Mobile.pressBack()

    Mobile.tap(findTestObject('Object Repository/shoping/pilih laptop'), 0)

    Mobile.tap(findTestObject('Object Repository/shoping/hp_chromebook'), 0)

    Mobile.tap(findTestObject('Object Repository/shoping/add_cart'), 0)

    Mobile.tap(findTestObject('cek cart/keranjang'), 0)

    Mobile.tap(findTestObject('Object Repository/shoping/CHECKOUT'), 0) //	Mobile.tap(findTestObject('Object Repository/shoping/keranjang'), 0)
	
	} catch (Exception e) {
		Mobile.tap(findTestObject('Object Repository/shoping/CHECKOUT'), 0)
		}

//Mobile.tap(findTestObject('Object Repository/shoping/pilih_payment methode'), 0)

//Mobile.setText(findTestObject('Object Repository/shoping/safe_pay_username'), username_safepay, 0)

//Mobile.setText(findTestObject('Object Repository/shoping/safe_pay_password'), password_safepay, 0)

//Mobile.tap(findTestObject('Object Repository/shoping/apply_order_method'), 0)

Mobile.tap(findTestObject('Object Repository/shoping/PAY NOW'), 0)

Mobile.tap(findTestObject('Object Repository/shoping/close_order_payment'), 0)

Mobile.verifyElementExist(findTestObject('cek cart/Text_advantage'), 0)

