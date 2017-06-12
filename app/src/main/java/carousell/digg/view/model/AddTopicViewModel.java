package carousell.digg.view.model;


import android.view.View;

import carousell.digg.model.Topic;
import carousell.digg.repository.TopicRepository;
import carousell.digg.view.AddTopicView;

public class AddTopicViewModel {
    private AddTopicView addTopicView;
    private Topic topic;
    private TopicRepository topicRepository;

    public AddTopicViewModel(AddTopicView addTopicView, Topic topic, TopicRepository topicRepository) {
        this.addTopicView = addTopicView;
        this.topic = topic;
        this.topicRepository = topicRepository;
    }

    public void onSubmitClicked(View view) {
        if (topic.isValid()) {
            topicRepository.save(topic);
            addTopicView.hideError();
        } else {
            addTopicView.showError();
        }
    }

    public Topic getTopic() {
        return topic;
    }

}
