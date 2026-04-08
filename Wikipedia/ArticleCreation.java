public class ArticleCreation {

    private int articleId;
    private String title;
    private int words;
    private String category;
    private int references;
    private String language;
    private int edits;

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public int getWords() {
        return words;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setReferences(int references) {
        this.references = references;
    }

    public int getReferences() {
        return references;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setEdits(int edits) {
        this.edits = edits;
    }

    public int getEdits() {
        return edits;
    }
}