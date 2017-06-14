package carousell.digg.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import carousell.digg.R;
import carousell.digg.databinding.AddTopicBinding;
import carousell.digg.model.Topic;
import carousell.digg.repository.TopicRepository;
import carousell.digg.view.model.AddTopicViewModel;

public class AddTopicActivity extends AppCompatActivity implements AddTopicView {

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
        addTopicBinding.errorMessage.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideError() {
        addTopicBinding.errorMessage.setVisibility(View.GONE);
    }

    @Override
    public void close() {
        finish();
    }
}
