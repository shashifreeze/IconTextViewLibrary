Add dependecy to build.gradle file (Project level)

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Add dependecy to build.gradle file (App level)
  implementation 'com.github.shashifreeze:IconTextViewLibrary:1.0.0'
  
  
