package example.com.robolectricespressomenuissue

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleUnitTest {
    @get:Rule
    val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java, false, true)

    @Test
    fun testOpenMenuItem() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Espresso.openActionBarOverflowOrOptionsMenu(appContext)
        Espresso.onView(allOf(withId(R.id.title), withText(R.string.action_settings), isDisplayed())).perform(click());
    }
}
