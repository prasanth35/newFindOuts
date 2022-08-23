//Disable Phone Selector API through kotlin code.
//When ever app is booted phone selector api asks for choose mobile number that is availabe from the device.
//you can disable it manually through code during automatic testing in espresso.

//CODE
//LANGUAGE:KOTLIN

    private val uiDevice: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    private val noneOfTheAboveButton: UiObject = uiDevice.findObject(UiSelector().text("NONE OF THE ABOVE"))
    private val deviceSettingsPhoneSelector:UiObject = uiDevice.findObject(UiSelector().text("Choose a phone number"))

    private fun disablePhoneSelectorApi() {
        SystemClock.sleep(1000)
        if (deviceSettingsPhoneSelector.exists() && deviceSettingsPhoneSelector.isEnabled) {
            uiDevice.pressBack()
        }
        SystemClock.sleep(1000)
    }
    
       private fun clickNoneOfTheAbove() {
        if (noneOfTheAboveButton.exists() && noneOfTheAboveButton.isEnabled) {
            noneOfTheAboveButton.click()
        }
    }
       
  //The above functions needs dependencies - *ui selector* that is need to be included in your build.gradle file.
  //Just call this function where ever you want.
  //This function overrides phone selector api during espresso testing.
  //This is just a idea.Where it just simply checks for the text in the ui and presses back button if the text is encountered.
