This repository is a sample app to reproduce an issue seen with Robolectric/Espresso tests.

The app is created from the "Basic Activity" template in Android Studio.
It has a `MainActivity`, which has a menu with a `Setting` item. Tapping on this Settings item does nothing.

The repository has two tests. Both tests do the same thing:
* Launch `MainActivity`
* Open the overflow menu
* Attempt to select the "Settings" item from the menu.


* `ExampleInstrumentedTest` in the `androidTest` sourceSet and runs on a device or emulator.
* `ExampleUnitTest` is in the `test` sourceSet and runs using Robolectric.

The code for the two tests are identical.

Expected behavior: both tests pass
Actual behavior:
* The `androidTest` test passes
* The `test` test fails, not finding the Settings item in the menu:
```
androidx.test.espresso.NoMatchingViewException: No views in hierarchy found matching: (with id: example.com.robolectricespressomenuissue:id/title and with string from resource id: <2131623975> and is displayed on the screen to the user)
```
