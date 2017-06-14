package carousell.digg.view.model;


import android.view.View;

import carousell.digg.view.HomeView;

public class HomeViewModel {
    private HomeView homeView;

    public HomeViewModel(HomeView homeView) {
        this.homeView = homeView;
    }

    public void onAddTopicClicked(View view) {
        homeView.navigateToAddTopicActivity();
    }

    public void onShowTopicsClicked(View view) {
        homeView.navigateToTopicListActivity();
    }
}
