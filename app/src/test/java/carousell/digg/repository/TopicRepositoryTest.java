package carousell.digg.repository;

import org.junit.Test;

import java.util.List;

import carousell.digg.model.Topic;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TopicRepositoryTest {

    @Test
    public void shouldIncreaseTopicListOnTopicSaved() throws Exception {

        TopicRepository topicRepository = TopicRepository.getInstance();

        Topic topic = new Topic("some content");
        topicRepository.save(topic);

        List<Topic> topics = topicRepository.getTopics();
        assertThat(topics.size(), is(1));
        assertThat(topics.get(0), is(topic));
    }
}