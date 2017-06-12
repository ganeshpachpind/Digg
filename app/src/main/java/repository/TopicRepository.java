package repository;

import java.util.ArrayList;
import java.util.List;

import model.Topic;

public class TopicRepository {
    List<Topic> topics;

    public TopicRepository() {
        topics = new ArrayList<>();
    }

    public void save(Topic topic) {
        topics.add(topic);
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
