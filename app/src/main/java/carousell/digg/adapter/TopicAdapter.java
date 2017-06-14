package carousell.digg.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import carousell.digg.databinding.TopicRowBinding;
import carousell.digg.model.Topic;

public class TopicAdapter extends RecyclerView.Adapter<TopicViewHolder> {

    private List<Topic> topics;

    public TopicAdapter(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public TopicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        TopicRowBinding rowBinding = TopicRowBinding.inflate(layoutInflater, parent, false);
        return new TopicViewHolder(rowBinding);
    }

    @Override
    public void onBindViewHolder(TopicViewHolder holder, int position) {
        Topic topic = topics.get(position);
        holder.bind(topic);
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }
}
