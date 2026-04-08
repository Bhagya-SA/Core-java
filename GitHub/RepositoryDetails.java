public class RepositoryDetails {

    private int repoId;
    private String repoName;
    private int stars;
    private String owner;
    private int forks;
    private String language;
    private int issues;

    public void setRepoId(int repoId) {
        this.repoId = repoId;
    }

    public int getRepoId() {
        return repoId;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getForks() {
        return forks;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setIssues(int issues) {
        this.issues = issues;
    }

    public int getIssues() {
        return issues;
    }
}