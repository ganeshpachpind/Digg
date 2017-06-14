package carousell.digg.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.List;

import carousell.digg.R;
import carousell.digg.adapter.TopicAdapter;
import carousell.digg.databinding.TopicListBinding;
import carousell.digg.model.Topic;
import carousell.digg.repository.TopicRepository;

public class TopicListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TopicListBinding topicListBinding = DataBindingUtil.setContentView(this, R.layout.topic_list);
        topicListBinding.topicList.setLayoutManager(new LinearLayoutManager(this));

        TopicRepository topicRepository = TopicRepository.getInstance();

        List<Topic> topics = topicRepository.getTopics();

        TopicAdapter adapter = new TopicAdapter(topics);
        topicListBinding.topicList.setAdapter(adapter);
    }
}
