kotchan sample
==============
The repository is the samples of [kotchan](https://github.com/inoutch/kotchan) for multiplatform(JVM, iOS, Android).

### Running
1. Setup java environment
2. Clone this repository
3. Run or install for each platforms

    - JVM
    
           $ ./gradlew run
           
    - iOS
    
           $ ./gradlew :iosApp:build
           $ open iosApp/kotchan-sample/kotchan-sample.xcodeproj
           
           In xcode: Product > Run

    - Android
    
           $ ./gradlew :androidApp:installDebug
           
### Resource Licenses
This sample uses a [free image](https://opengameart.org/content/skeleton-animations) packed by TexturePacker.
