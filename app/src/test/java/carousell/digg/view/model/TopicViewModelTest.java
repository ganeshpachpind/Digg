package carousell.digg.view.model;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import carousell.digg.model.Topic;
import carousell.digg.repository.TopicRepository;
import carousell.digg.view.TopicListView;

import static org.mockito.Mockito.mock;

public class TopicViewModelTest {


    private TopicRepository topicRepository;
    private TopicListView topicListView;
    private Topic topic;
    private TopicViewModel topicViewModel;

    @Before
    public void setUp() throws Exception {
        topicRepository = mock(TopicRepository.class);
        topicListView = mock(TopicListView.class);
        topic = new Topic("XYZ");
        topicViewModel = new TopicViewModel(topic, topicRepository, topicListView);
    }

    @Test
    public void shouldUpdateTopicUpVoteCountInRepoOnTopicUpVote() throws Exception {
        topicViewModel.onUpVoteClicked(mock(View.class));

        InOrder inOrder = Mockito.inOrder(topicRepository, topicListView);
        inOrder.verify(topicRepository).updateTopicUpVoteCount(topic);
        inOrder.verify(topicListView).dataChanged();

    }

    @Test
    public void shouldUpdateTopicDownVoteCountInRepoOnTopicDownVote() throws Exception {
        topicViewModel.onDownVoteClicked(mock(View.class));

        InOrder inOrder = Mockito.inOrder(topicRepository, topicListView);
        inOrder.verify(topicRepository).updateTopicDownVoteCount(topic);
        inOrder.verify(topicListView).dataChanged();

    }
}