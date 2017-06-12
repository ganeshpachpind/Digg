package carousell.digg.model;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

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


    @Test
    public void shouldReturnTopicValidWhenTopicContentLengthLessThanOrEqual256Char() throws Exception {

        String content = " Some topic conetnet";
        Topic topic = new Topic(content);
        assertTrue(topic.isValid());

    }
    @Test
    public void shouldReturnTopicInvalidWhenTopicContentLengthGreaterThan256Char() throws Exception {

        String content = "some lengthy topic some lengthy topic " +
                "some lengthy topic some lengthy topic some lengthy " +
                "topic some lengthy topic some lengthy topic" +
                " some lengthy topic some lengthy topic some lengthy topic" +
                "some lengthy topic some lengthy topic some lengthy topic some lengthy topic";
        Topic topic = new Topic(content);
        assertFalse(topic.isValid());

    }
}