package carousell.digg;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import carousell.digg.page.HomePage;
import carousell.digg.view.HomeActivity;

@RunWith(AndroidJUnit4.class)
public class E2ETest {

    @Rule
    public ActivityTestRule<HomeActivity> activityTestRule = new ActivityTestRule<HomeActivity>(HomeActivity.class);

    @Test
    public void shouldAddMultipleTopicAndCheckThoseDisplayedProperly() throws Exception {

        HomePage homePage = new HomePage();

        for (int i = 0; i <= 10; i++) {
            homePage
                    .clickAddTopic()
                    .enterValidTopicDetailsAndSubmit("topic " + i);

        }

        homePage
                .clickShowTopic()
                .verifyTopicItemsInTheList();

    }
}
