public class AnswerInfo {

    private int answerId;
    private String qusetion;
    private int upVotes;
    private String author;
    private int views;
    private String topic;
    private int shares;

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setQusetion(String qusetion) {
        this.qusetion = qusetion;
    }

    public String getQusetion() {
        return qusetion;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getViews() {
        return views;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public int getShares() {
        return shares;
    }
}