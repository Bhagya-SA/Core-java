public class QuestionsInfo {

    private int qusetionId;
    private String title;
    private int votes;
    private String tag;
    private int answers;
    private String userName;
    private int views;

    public void setQusetionId(int qusetionId) {
        this.qusetionId = qusetionId;
    }

    public int getQusetionId() {
        return qusetionId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getVotes() {
        return votes;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }

    public int getAnswers() {
        return answers;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getViews() {
        return views;
    }
}