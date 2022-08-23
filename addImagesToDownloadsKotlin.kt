// Kotlin Espresso :
//   Injecting Sample image from drawables folders during time of automatic testing.
  
  
//   CODE:
//   LANGUAGE:Kotlin
  
  private fun addImageToDownloads() {
        val extStorageDirectory =Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        val fileName = File("$extStorageDirectory/sample.png")
        var fileExists = fileName.exists()
        val bm = BitmapFactory.decodeResource(ApplicationProvider.getApplicationContext<Context>().resources,
            R.drawable.sample
        )
        val file = File(extStorageDirectory, "sample.png")
        if(fileExists){
            print("$fileName File exists")
        } else {
            var outStream = FileOutputStream(file)
            bm.compress(Bitmap.CompressFormat.PNG, 100, outStream)
            outStream.flush()
            outStream.close()
        }
    }
    
    
//     Uses Case:
//     1. When you have a component that needs a image to be uploaded on click,
//       when you dont have a image in your folder/path espresso testing will crash.
    
//     2.To avoid this you can have a sample image in your drawables folder.
//     3.Then,at the time of running the test the image from your drawables folder will be added to downloads folder if the image dose not exist already.
    
//     LOGIC:
//       - get the downloads directory path
//       - get check for the sample image exists on the path
//       - if dose not exists convert the sample image from the drawables folder to bitmap image
//       - use file concepts to push the image to the android device.
