package carousell.digg.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import carousell.digg.R;
import carousell.digg.databinding.AddTopicBinding;
import carousell.digg.model.Topic;
import carousell.digg.repository.TopicRepository;
import carousell.digg.view.model.AddTopicViewModel;

public class AddTopicActivity extends Activity implements AddTopicView {

    private AddTopicBinding addTopicBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addTopicBinding = DataBindingUtil.setContentView(this, R.layout.add_topic);

        TopicRepository topicRepository = TopicRepository.getInstance();
        AddTopicViewModel addTopicViewModel = new AddTopicViewModel(this, new Topic(""), topicRepository);
        addTopicBinding.setAddTopicModel(addTopicViewModel);
    }

    @Override
    public void showError() {
        addTopicBinding.contentLayout.setError(getString(R.string.invalid_topic));
    }

    @Override
    public void hideError() {
        addTopicBinding.contentLayout.setError(null);
    }
}
