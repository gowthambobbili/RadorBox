
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject



def static "com.CommonUtilities.Navigations.launchBrowserAndGoToBaseUrl"() {
    (new com.CommonUtilities.Navigations()).launchBrowserAndGoToBaseUrl()
}


def static "com.CommonUtilities.Verifications.VerifyElementPresentAndStopExecutionIfFailed"(
    	TestObject object	
     , 	Object FailureDescription	) {
    (new com.CommonUtilities.Verifications()).VerifyElementPresentAndStopExecutionIfFailed(
        	object
         , 	FailureDescription)
}


def static "com.CommonUtilities.HomePageVerifications.verifyHomePageElements"() {
    (new com.CommonUtilities.HomePageVerifications()).verifyHomePageElements()
}


def static "com.CommonUtilities.Login.loginToRadorBox"(
    	Object email	
     , 	Object password	) {
    (new com.CommonUtilities.Login()).loginToRadorBox(
        	email
         , 	password)
}
