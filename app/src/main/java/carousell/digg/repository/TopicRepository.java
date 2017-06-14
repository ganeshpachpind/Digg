package carousell.digg.repository;

import java.util.ArrayList;
import java.util.List;

import carousell.digg.model.Topic;

public class TopicRepository {
    private static TopicRepository topicRepository;
    private List<Topic> topics;

    private TopicRepository() {
        topics = new ArrayList<>();
    }

    public static TopicRepository getInstance() {
        if (topicRepository == null) {
            topicRepository = new TopicRepository();
        }
        return topicRepository;
    }

    public void save(Topic topic) {
        topics.add(topic);
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void updateTopicUpVoteCount(Topic topic) {
        for (Topic element : topics) {
            if (element.equals(topic)) {
                topic.upVote();
            }
        }
    }

    public void updateTopicDownVoteCount(Topic topic) {
        for (Topic element : topics) {
            if (element.equals(topic)) {
                topic.downVote();
            }
        }
    }
}
