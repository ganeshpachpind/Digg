package carousell.digg.smoke;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import carousell.digg.page.HomePage;
import carousell.digg.view.HomeActivity;

@RunWith(AndroidJUnit4.class)
public class HomeActivityTest {
    @Rule
    public ActivityTestRule<HomeActivity> activityRule = new ActivityTestRule<>(HomeActivity.class);

    @Test
    public void shouldNavigateToAddTopicActivityOnAddTopicClicked() throws Exception {
        HomePage homePage = new HomePage();

        homePage.
                clickAddTopic()
                .verifyAddTopicActivityOpen();

    }

    @Test
    public void shouldNavigateToTopicListActivityOnShowTopicClicked() throws Exception {
        HomePage homePage = new HomePage();

        homePage.
                clickShowTopic()
                .verifyTopicListActivityOpen();

    }
}
