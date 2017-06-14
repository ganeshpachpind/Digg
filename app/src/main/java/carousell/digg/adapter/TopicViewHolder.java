package carousell.digg.adapter;


import android.support.v7.widget.RecyclerView;

import carousell.digg.databinding.TopicRowBinding;
import carousell.digg.view.model.TopicViewModel;

public class TopicViewHolder extends RecyclerView.ViewHolder {

    private TopicRowBinding rowBinding;

    public TopicViewHolder(TopicRowBinding rowBinding) {
        super(rowBinding.getRoot());
        this.rowBinding = rowBinding;
    }

    public void bind(TopicViewModel topicViewModel) {
        rowBinding.setTopicViewModel(topicViewModel);
    }
}
