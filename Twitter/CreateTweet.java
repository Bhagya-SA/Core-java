public class CreateTweet {

    private int tweetId;
    private String userName;
    private int likes;
    private String text;
    private int retweets;
    private String language;
    private int replies;

    public void setTweetId(int tweetId) {
        this.tweetId = tweetId;
    }

    public int getTweetId() {
        return tweetId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setRetweets(int retweets) {
        this.retweets = retweets;
    }

    public int getRetweets() {
        return retweets;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public int getReplies() {
        return replies;
    }
}