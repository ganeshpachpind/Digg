package carousell.digg.view.model;


import android.view.View;

import carousell.digg.model.Topic;
import carousell.digg.repository.TopicRepository;
import carousell.digg.view.TopicListView;

public class TopicViewModel {

    private Topic topic;
    private TopicRepository topicRepository;
    private TopicListView topicListView;

    public TopicViewModel(Topic topic, TopicRepository topicRepository, TopicListView topicListView) {
        this.topic = topic;
        this.topicRepository = topicRepository;
        this.topicListView = topicListView;
    }

    public void onUpVoteClicked(View view) {
        topicRepository.updateTopicUpVoteCount(topic);
        topicListView.dataChanged();
    }

    public void onDownVoteClicked(View view) {
        topicRepository.updateTopicDownVoteCount(topic);
        topicListView.dataChanged();
    }

    public Topic getTopic() {
        return topic;
    }
}
