package carousell.digg.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import carousell.digg.databinding.TopicRowBinding;
import carousell.digg.model.Topic;
import carousell.digg.model.TopicComparator;
import carousell.digg.repository.TopicRepository;
import carousell.digg.view.TopicListView;
import carousell.digg.view.model.TopicViewModel;

public class TopicAdapter extends RecyclerView.Adapter<TopicViewHolder> implements TopicListView {

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
        TopicViewModel topicViewModel = new TopicViewModel(topics.get(position), TopicRepository.getInstance(), this);
        holder.bind(topicViewModel);
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    @Override
    public void dataChanged() {
        // sort();     we could call this method to allow sorting as soon as user interact
        notifyDataSetChanged();
    }

    public void sort() {
        Collections.sort(topics, new TopicComparator());
    }
}
