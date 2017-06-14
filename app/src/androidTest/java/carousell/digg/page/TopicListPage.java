package carousell.digg.page;


import carousell.digg.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class TopicListPage {
    public void verifyTopicListActivityOpen() {
        onView(withText(R.string.topics)).check(matches(isDisplayed()));
    }
}
