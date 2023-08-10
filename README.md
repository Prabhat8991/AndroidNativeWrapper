# AndroidNativeWrapper

## Steps to integrate ReactNative app
1. From your ReactNative Repo; generate .aar for Android.
2. Add this .aar as dependency in Android Native project.
3. Generate index.android.bundle and assets, copy them to assets and res folder of native android app.

   Use this script: 
   npx react-native bundle --platform android --dev false --entry-file index.js --bundle-output \<path to your assets folder>/index.android.bundle --assets-dest \<path to your res folder>/
   
5. Open RN's MainActivity from Native MainActivity
