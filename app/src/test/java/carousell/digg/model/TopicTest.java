package carousell.digg.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TopicTest {
    @Test
    public void shouldIncrementUpVoteCountWhenUpVote() throws Exception {
        Topic topic = new Topic("Some content");

        topic.upVote();

        assertThat(topic.getUpVoteCount(), is(1L));
        assertThat(topic.getDownVoteCount(), is(0L));
    }

    @Test
    public void shouldIncrementDownVoteCountWhenDownVote() throws Exception {
        Topic topic = new Topic("Some content");

        topic.downVote();

        assertThat(topic.getDownVoteCount(), is(1L));
        assertThat(topic.getUpVoteCount(), is(0L));
    }
}