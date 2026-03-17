class NewsPaper {

    int newsPaperId;
    String newsPaperName;
    String language;
    Article article;

     public NewsPaper(int newsPaperId, String newsPaperName, String language, Article article) {
        this.newsPaperId = newsPaperId;
        this.newsPaperName = newsPaperName;
        this.language = language;
        this.article = article;
    }

    public void displayNewsPaperInfo() {
        System.out.println("NewsPaper Id : " + this.newsPaperId);
        System.out.println("NewsPaper Name : " + this.newsPaperName);
        System.out.println("Language : " + this.language);
        this.article.displayArticleInfo();
        System.out.println("--------------------------------------------------");
    }
}



