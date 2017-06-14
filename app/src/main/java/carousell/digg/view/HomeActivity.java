package carousell.digg.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import carousell.digg.R;
import carousell.digg.databinding.HomeBinding;
import carousell.digg.view.model.HomeViewModel;

public class HomeActivity extends AppCompatActivity implements HomeView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomeBinding homeBinding = DataBindingUtil.setContentView(this, R.layout.home);
        homeBinding.setHomeViewModel(new HomeViewModel(this));
    }

    @Override
    public void navigateToAddTopicActivity() {
        startActivity(new Intent(this, AddTopicActivity.class));
    }

    @Override
    public void navigateToTopicListActivity() {
        startActivity(new Intent(this, TopicListActivity.class));
    }
}
