package com.CommonUtilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Verifications {
	@Keyword
	def VerifyElementPresentAndStopExecutionIfFailed(TestObject object, def FailureDescription) {
		if(!(WebUI.verifyElementPresent(object, 0, FailureHandling.OPTIONAL))) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(FailureDescription)
		}
	}
}
