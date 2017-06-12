package carousell.digg.model;


public class Topic {
    private String content;
    private long upVoteCount;
    private long downVoteCount;

    public Topic(String content) {
        this.content = content;
    }

    public void upVote() {
        upVoteCount++;
    }

    public String getContent() {
        return content;
    }

    public long getUpVoteCount() {
        return upVoteCount;
    }

    public long getDownVoteCount() {
        return downVoteCount;
    }

    public void downVote() {
        downVoteCount++;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isValid() {
        return content.length() <= 256;
    }
}
