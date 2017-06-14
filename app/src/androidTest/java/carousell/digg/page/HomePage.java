package carousell.digg.page;


import carousell.digg.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class HomePage {
    public AddTopicPage clickAddTopic() {
        onView(withId(R.id.addTopic)).perform(click());
        return new AddTopicPage();
    }

    public TopicListPage clickShowTopic() {
        onView(withId(R.id.showTopics)).perform(click());
        return new TopicListPage();
    }
}
