package carousell.digg.model;


import java.util.Comparator;

public class TopicComparator implements Comparator<Topic> {
    @Override
    public int compare(Topic topic1, Topic topic2) {
        return (int) (topic2.getUpVoteCount() - topic1.getUpVoteCount());
    }
}
