class Article {

    int articleId;
    String title;
    String authorName;

    public void displayArticleInfo() {
        System.out.println("Article Id : " + this.articleId);
        System.out.println("Title : " + this.title);
        System.out.println("Author Name : " + this.authorName);
    }
}