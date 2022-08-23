//Disable OneSignal pushes and in-app in kotlin

  private fun disableOneSignal(){
        OneSignal.pauseInAppMessages(true)
        OneSignal.disablePush(true)
    }
  
 //true - disables
 //false - enables
 
 //Use Cases:
 //May be in some cases you need to disable push and in-App from oneSignal,eg.you dont need to send push when a user is logged out from the app.When the user is logged out you can disable the push from oneSignal.
