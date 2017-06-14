package carousell.digg.smoke;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import carousell.digg.page.AddTopicPage;
import carousell.digg.view.AddTopicActivity;

@RunWith(AndroidJUnit4.class)
public class AddTopicActivityTest {
    @Rule
    public ActivityTestRule<AddTopicActivity> activityRule = new ActivityTestRule<>(AddTopicActivity.class);


    @Test
    public void shouldShowErrorWhenSaveClickedForInValidTopic() throws Exception {
        AddTopicPage addTopicPage = new AddTopicPage();
        addTopicPage
                .enterInValidTopicDetailsAndSubmit()
                .verifyErrorMessageShown();

    }

    @Test
    public void shouldSaveValidTopic() throws Exception {
        AddTopicPage addTopicPage = new AddTopicPage();
        addTopicPage
                .enterValidTopicDetailsAndSubmit("Some details");

    }

}
