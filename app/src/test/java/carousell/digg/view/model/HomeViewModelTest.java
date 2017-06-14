package carousell.digg.view.model;

import android.view.View;

import org.junit.Test;

import carousell.digg.view.HomeView;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HomeViewModelTest {

    @Test
    public void shouldNavigateToAddTopicActivityOnAddTopicClick() throws Exception {
        HomeView homeView = mock(HomeView.class);
        HomeViewModel homeViewModel = new HomeViewModel(homeView);

        homeViewModel.onAddTopicClicked(mock(View.class));

        verify(homeView).navigateToAddTopicActivity();
    }


    @Test
    public void shouldNavigateToTopicListActivityOnShowTopicClick() throws Exception {
        HomeView homeView = mock(HomeView.class);
        HomeViewModel homeViewModel = new HomeViewModel(homeView);

        homeViewModel.onShowTopicsClicked(mock(View.class));

        verify(homeView).navigateToTopicListActivity();
    }
}