package pages;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpusConnectApp {

	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public OpusConnectApp(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Opus Connect App Login Details
	@FindBy(id = "com.authbridge.addressverification:id/userName")
	@CacheLookup
	WebElement txtuserName;

	@FindBy(id = "com.authbridge.addressverification:id/password")
	@CacheLookup
	WebElement txtEnterPasswordField;

	@FindBy(xpath = "com.authbridge.addressverification:id/password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	@CacheLookup
	WebElement clickOnOpusLoginBtn;

	// Click on Agree Button--Terms and Conditions
	@FindBy(id = "com.authbridge.addressverification:id/yes")
	@CacheLookup
	WebElement clickTermsConditionAgreeBtn;

	// Code Of Conduct
	@FindBy(id = "com.authbridge.addressverification:id/yes")
	@CacheLookup
	WebElement clickCodeOfConductAgreeBtn;

	// Click On Assigning Bucket Assigning Bucket
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
	@CacheLookup
	WebElement clickOnAssignCountNo;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[1]")
	@CacheLookup
	WebElement clickOnCheckName;

	// Click On Start Action
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[2]")
	@CacheLookup
	WebElement clickStartActionBtn;

	// Filling All details
	// Pin Code
	@FindBy(id = "//android.widget.EditText[@text='Pin Code *']")
	@CacheLookup
	WebElement txtPinCode;

	// Verification Type
	@FindBy(xpath = "//android.widget.Spinner[@index='1']")
	@CacheLookup
	WebElement clickVerificationTypeName;

	@FindBy(xpath = "//*[@text='Not Applicable']")
	@CacheLookup
	WebElement clickOnNotApplicableText;//

	// Verified Form
	@FindBy(id = "//android.widget.EditText[@text='Verified From *']")
	@CacheLookup
	WebElement txtVerifiedDate;// 02-02-2000

	// Relationship with Candidate
	@FindBy(xpath = "//android.widget.EditText[@text='Relationship with Candidate *']")
	@CacheLookup
	WebElement txtRelationshipCand;// Brother

	// Duration Of State.
	@FindBy(xpath = "//android.widget.EditText[@text='Duration of Stay *']")
	@CacheLookup
	WebElement txtDurationOfState;// 02-06-2000

	@FindBy(xpath = "//android.widget.EditText[@text='Any Other Comments *']")
	@CacheLookup
	WebElement txtOtherComments;// Good Comments

	@FindBy(xpath = "//android.widget.EditText[@text='Time of Verification']")
	@CacheLookup
	WebElement txtTimeOfVerification;// 12 PM

	// Gate Of Color
	@FindBy(id = "//android.widget.EditText[@text='Gate Color *']")
	@CacheLookup
	WebElement txtGateOfColor;// Red

	@FindBy(xpath = "//android.widget.EditText[@text='Color of Building *']")
	@CacheLookup
	WebElement txtColorOfBuilding;// Green

	// Period Of State(Date From)
	@FindBy(xpath = "//android.widget.EditText[@text='Period of Stay (Date From / To) *']")
	@CacheLookup
	WebElement txtPeriodOfState;// 02-07-2000

	// New Address Details Obtains
	@FindBy(xpath = "//android.widget.EditText[@text='New address details obtained *']")
	@CacheLookup
	WebElement txtNewAddressDetails;// Patherdewa

	// Residence Type
	@FindBy(xpath = "//android.widget.TextView[@text='--Select--']")
	@CacheLookup
	WebElement clickOnResidenceType;

	@FindBy(xpath = "//*[@text='Not Applicable']")
	@CacheLookup
	WebElement clickOnNotApplicableResidence;// Not Applicable

	// Camera Activity D
	@FindBy(xpath = "//android.widget.TextView[@text='Signature*']")
	@CacheLookup
	WebElement clickOnSignatureText;// Signature

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View")
	@CacheLookup
	WebElement clickOnSignaturePad;

	@FindBy(xpath = "//android.widget.Button[@text='Save']")
	@CacheLookup
	WebElement clickOnSignatureSaveBtn;

	// Id Proof
	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	@CacheLookup
	WebElement clickOnIdProofName;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Capture\"]")
	@CacheLookup
	WebElement clickOnIdProofCamera;

	@FindBy(xpath = "com.authbridge.addressverification:id/textViewDone")
	@CacheLookup
	WebElement clickOnIdProofSaveBtn;

	// Photo 1
	@FindBy(xpath = "//android.widget.RelativeLayout[@index='2']")
	@CacheLookup
	WebElement clickOnPhotoOne;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Capture\"]")
	@CacheLookup
	WebElement clickOnPhotoOneCamera;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
	@CacheLookup
	WebElement clickOnPhotoOneSaveBtn;

	// Photo 2
	@FindBy(xpath = "//android.widget.TextView[@text='Photo 2*']")
	@CacheLookup
	WebElement clickOnPhotoTwoText;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Capture\"]")
	@CacheLookup
	WebElement clickOnPhotoTwoCamera;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
	@CacheLookup
	WebElement clickOnPhotoTwoSaveBtn;// 2325-006295 ,10381462

	// Click On Save Button Finally Fulfill details
	@FindBy(xpath = "//android.widget.Button[@text='Save']")
	@CacheLookup
	WebElement clickOnFinallySaveBtn;

	// Click On Confirm Save Button
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
	@CacheLookup
	WebElement clickOnConfirmSaveBtn;

	// Click Ok Button Message -- No New Check Assigned
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	@CacheLookup
	WebElement clickOnOkMessageBtn;

	// Verify Bucket --- No New Check Assigned
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
	@CacheLookup
	WebElement verifyNoCheckMessageText;

	public void opusConnectLoginDetails(String username, String password) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtuserName));
		txtuserName.sendKeys(username);
		//ldriver.hideKeyboard();
		txtEnterPasswordField.sendKeys(Keys.TAB);
		txtPassword.sendKeys(password);
		// ldriver.hideKeyboard();
		clickOnOpusLoginBtn.click();
		/*
		 * boolean otp=true; while(otp) { WebElement otpBox =
		 * driver.findElementById("com.authbridge.addressverification:id/edtOtp1");
		 * otp=otpBox.isDisplayed(); if(otp) { Thread.currentThread().sleep(2000);
		 * System.out.print("Wait Loop is on"); }else {
		 * System.out.print("Wait Loop is broken"); } }
		 */

		Thread.sleep(40000);
	}

	public void checkIntialSetup() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickTermsConditionAgreeBtn));
		clickTermsConditionAgreeBtn.click();

		// Code Of Conduct
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickCodeOfConductAgreeBtn));
		clickCodeOfConductAgreeBtn.click();

		// Click On Assigning Bucket Assigning Bucket
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnAssignCountNo));
		clickOnAssignCountNo.click();
		Thread.sleep(2000);
		clickOnCheckName.click();
		// Click On Start Action
		Thread.sleep(2000);
		clickStartActionBtn.click();
	}

	// Filling All details
	public void formFillingAllDetails(String pinCode, String verifiedForm, String candidateName, String durationState,
			String comments, String timeVerification, String gateColor, String buildingColor, String periodOfState,
			String newAddress) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtPinCode));
		txtPinCode.sendKeys(pinCode);

		// Verification Type
		clickVerificationTypeName.click();
		Thread.sleep(1000);
		clickOnNotApplicableText.click();
		Thread.sleep(1000);

		// Verified Form
		txtVerifiedDate.sendKeys(verifiedForm);
		// Relationship with Candidate
		txtRelationshipCand.sendKeys(candidateName);

		// Duration Of State.
		txtDurationOfState.sendKeys(durationState);
		Thread.sleep(1000);
		txtOtherComments.sendKeys(comments);
		Thread.sleep(1000);
		txtTimeOfVerification.sendKeys(timeVerification);

		// Gate Of Color
		txtGateOfColor.sendKeys(gateColor);
		txtColorOfBuilding.sendKeys(buildingColor);

		// Period Of State(Date From)
		txtPeriodOfState.sendKeys(periodOfState);
		// New Address Details Obtains
		txtNewAddressDetails.sendKeys(newAddress);

		// Residence Type
		clickOnResidenceType.click();
		Thread.sleep(2000);
		clickOnNotApplicableResidence.click();
		Thread.sleep(10000);

		// Camera Activity D
		clickOnSignatureText.click();
		Thread.sleep(2000);
		clickOnSignaturePad.click();
		Thread.sleep(2000);
		clickOnSignatureSaveBtn.click();

		// Id Proof
		clickOnIdProofName.click();
		Thread.sleep(2000);
		clickOnIdProofCamera.click();
		Thread.sleep(10000);
		clickOnIdProofSaveBtn.click();
		Thread.sleep(10000);

		// Photo 1
		clickOnPhotoOne.click();
		Thread.sleep(2000);
		clickOnPhotoOneCamera.click();
		Thread.sleep(10000);
		clickOnPhotoOneSaveBtn.click();
		Thread.sleep(10000);

		// Photo 2
		clickOnPhotoTwoText.click();
		Thread.sleep(2000);
		clickOnPhotoTwoCamera.click();
		Thread.sleep(10000);
		clickOnPhotoTwoSaveBtn.click();
		Thread.sleep(10000);

		// Click On Save Button Finally Fulfill details
		clickOnFinallySaveBtn.click();
		Thread.sleep(2000);
		// Click On Confirm Save Button
		clickOnConfirmSaveBtn.click();
		Thread.sleep(2000);
		// Click Ok Button Message -- No New Check Assigned
		clickOnOkMessageBtn.click();
		Thread.sleep(2000);
	}

	// Verify Bucket --- No New Check Assigned
	public String verifyAssigningChecks() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyNoCheckMessageText));
		return verifyNoCheckMessageText.getText();
	}

}
