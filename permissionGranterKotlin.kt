//  Grant Permissions in kotlin.

//  CODE:
//  LANGUAGE:KOTLIN

    val permissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.CAMERA,
        Manifest.permission.CALL_PHONE,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    )
    
  //  This can be used to grant permissions to your application ,during run time while using espresso.
  //   Meanwhile,you need to install some dependencies for espresso.
    
  //  LOGIC:
  //  Just gets the permissions that are fetched for the application from the manifest file and grants them.
    
  //  may be usefull:
  //  You can also grant permission through adb shell commands,but sometimes read write permissions cannot be granted through adb shell commands.
