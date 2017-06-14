package carousell.digg.page;


import android.support.test.espresso.contrib.RecyclerViewActions;

import carousell.digg.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class TopicListPage {
    public void verifyTopicListActivityOpen() {
        onView(withText(R.string.topics)).check(matches(isDisplayed()));
    }

    public void verifyTopicItemsInTheList() {
        onView(withId(R.id.topicList))
                .perform(RecyclerViewActions.scrollToPosition(10));

        onView(withText("topic 10")).check(matches(isDisplayed()));

    }
}
