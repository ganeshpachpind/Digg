package carousell.digg.page;


import android.support.test.espresso.contrib.RecyclerViewActions;

import carousell.digg.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static carousell.digg.util.CustomAction.clickChildViewWithId;

public class TopicListPage {
    public void verifyTopicListActivityOpen() {
        onView(withText(R.string.topics)).check(matches(isDisplayed()));
    }

    public void verifyTopicItemAndCountInTheList() {

        onView(withId(R.id.topicList))
                .perform(RecyclerViewActions.scrollToPosition(1));

        onView(withText("topic 1")).check(matches(isDisplayed()));

        onView(withId(R.id.topicList))
                .perform(RecyclerViewActions.scrollToPosition(10));

        onView(withText("topic 9")).check(matches(isDisplayed()));

    }

    public TopicListPage increaseUpVote() {
        onView(withId(R.id.topicList))
                .perform(RecyclerViewActions.actionOnItemAtPosition(1, clickChildViewWithId(R.id.upVote)));
        return this;
    }

    public TopicListPage increaseDownVote() {
        onView(withId(R.id.topicList))
                .perform(RecyclerViewActions.actionOnItemAtPosition(1, clickChildViewWithId(R.id.downVote)));
        return this;
    }
}
