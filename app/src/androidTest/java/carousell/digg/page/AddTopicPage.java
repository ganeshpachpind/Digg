package carousell.digg.page;


import carousell.digg.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static carousell.digg.util.CustomMatcher.hasTextInputLayoutErrorText;

public class AddTopicPage {

    public AddTopicPage enterValidTopicDetailsAndSubmit() throws InterruptedException {
        enterContent("Some details of the topic");
        clickSubmit();
        return this;
    }

    public AddTopicPage enterInValidTopicDetailsAndSubmit() throws InterruptedException {
        String content = " very long content added, very long content added,  very long content added,  " +
                "very long content added,  very long content added,  very long content added,  very long content added, " +
                " very long content added,  very long content added,  very long content added,  very long content added, " +
                " very long content added,  very long content added,  very long content added,  very long content added,  " +
                "very long content added,  very long content added,  ";

        enterContent(content);
        clickSubmit();
        return this;
    }

    private void enterContent(String content) {
        onView(withId(R.id.content)).perform(typeText(content));
        onView(withId(R.id.content)).perform(closeSoftKeyboard());
    }

    private void clickSubmit() {
        onView(withId(R.id.submit)).perform(click());
    }

    public void verifyErrorMessageShown() {
        onView(withId(R.id.contentLayout)).check(matches(hasTextInputLayoutErrorText("Topic content length cannot be more than 256 char")));
    }
}
