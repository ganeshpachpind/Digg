package carousell.digg.view.model;

import android.view.View;

import org.junit.Test;

import carousell.digg.model.Topic;
import carousell.digg.repository.TopicRepository;
import carousell.digg.view.AddTopicView;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class AddTopicViewModelTest {

    @Test
    public void shouldSaveTopicOnSubmitClicked() throws Exception {

        AddTopicView addTopicView = mock(AddTopicView.class);
        Topic topic = new Topic("Details");
        TopicRepository topicRepository = mock(TopicRepository.class);
        AddTopicViewModel addTopicViewModel = new AddTopicViewModel(addTopicView, topic, topicRepository);

        addTopicViewModel.onSubmitClicked(mock(View.class));

        verify(topicRepository).save(topic);
        verify(addTopicView).hideError();
        verify(addTopicView, never()).showError();
        verify(addTopicView).close();
    }

    @Test
    public void shouldShowErrorMessageOnSubmitClickedButTopicIsInvalid() throws Exception {

        String content = "This length is more than 256 char will cause issue , " +
                "This length is more than 256 char will cause issue This length is more" +
                " than 256 char will cause issue This length is more than 256 char will cause issue" +
                "This length is more than 256 char will cause issue" +
                "This length is more than 256 char will cause issue ";

        AddTopicView addTopicView = mock(AddTopicView.class);
        Topic topic = new Topic(content);

        TopicRepository topicRepository = mock(TopicRepository.class);
        AddTopicViewModel addTopicViewModel = new AddTopicViewModel(addTopicView, topic, topicRepository);

        addTopicViewModel.onSubmitClicked(mock(View.class));

        verify(addTopicView).showError();
        verify(topicRepository, never()).save(topic);
        verify(addTopicView, never()).hideError();
        verify(addTopicView, never()).close();
    }

}