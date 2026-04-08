class Wikipedia {

    ArticleCreation articles[] = new ArticleCreation[5];
    int index;

    public boolean addArticle(ArticleCreation article) {

        boolean isArticleAdded = false;

        boolean isArticleIdValid = false;
        boolean isTitleValid = false;
        boolean isWordsValid = false;
        boolean isCategoryValid = false;
        boolean isReferencesValid = false;
        boolean isLanguageValid = false;
        boolean isEditsValid = false;

        int articleId = article.getArticleId();
        if (articleId > 0) {
            isArticleIdValid = true;
        }

        String title = article.getTitle();
        if (title != null && !title.isEmpty()) {
            isTitleValid = true;
        }

        int words = article.getWords();
        if (words > 0) {
            isWordsValid = true;
        }

        String category = article.getCategory();
        if (category != null && !category.isEmpty()) {
            isCategoryValid = true;
        }

        int references = article.getReferences();
        if (references >= 0) {
            isReferencesValid = true;
        }

        String language = article.getLanguage();
        if (language != null && !language.isEmpty()) {
            isLanguageValid = true;
        }

        int edits = article.getEdits();
        if (edits >= 0) {
            isEditsValid = true;
        }

        if (isArticleIdValid && isTitleValid && isWordsValid &&
            isCategoryValid && isReferencesValid &&
            isLanguageValid && isEditsValid) {

            isArticleAdded = true;
            articles[index++] = article;
        }

        return isArticleAdded;
    }

    public void getArticleDetails() {

        System.out.println("The article details are as follows :");

        for (ArticleCreation article : articles) {

            if (article != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Article Id is : " + article.getArticleId());
                System.out.println("Title is : " + article.getTitle());
                System.out.println("Words are : " + article.getWords());
                System.out.println("Category is : " + article.getCategory());
                System.out.println("References are : " + article.getReferences());
                System.out.println("Language is : " + article.getLanguage());
                System.out.println("Edits are : " + article.getEdits());
                System.out.println("--------------------------------------------");
            }
        }
    }
}