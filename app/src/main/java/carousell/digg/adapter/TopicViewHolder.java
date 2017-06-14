package carousell.digg.adapter;


import android.support.v7.widget.RecyclerView;

import carousell.digg.databinding.TopicRowBinding;
import carousell.digg.model.Topic;

public class TopicViewHolder extends RecyclerView.ViewHolder {

    private TopicRowBinding rowBinding;

    public TopicViewHolder(TopicRowBinding rowBinding) {
        super(rowBinding.getRoot());
        this.rowBinding = rowBinding;
    }

    public void bind(Topic topic) {
        rowBinding.setTopicViewModel(topic);
        rowBinding.executePendingBindings();
    }
}
