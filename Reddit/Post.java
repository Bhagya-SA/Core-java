public class Post {

    private int postId;
    private String subbreddit;
    private int upVotes;
    private String title;
    private int comments;
    private String user;
    private int awards;

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostId() {
        return postId;
    }

    public void setSubbreddit(String subbreddit) {
        this.subbreddit = subbreddit;
    }

    public String getSubbreddit() {
        return subbreddit;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getComments() {
        return comments;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    public int getAwards() {
        return awards;
    }
}