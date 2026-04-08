class WikipediaRunner {

    public static void main(String[] article) {

        Wikipedia wikipedia = new Wikipedia();

        ArticleCreation articleOne = new ArticleCreation();
        articleOne.setArticleId(1);
        articleOne.setTitle("Java Programming Basics");
        articleOne.setWords(1200);
        articleOne.setCategory("Programming");
        articleOne.setReferences(5);
        articleOne.setLanguage("English");
        articleOne.setEdits(10);

        boolean isArticleAdded = wikipedia.addArticle(articleOne);
        System.out.println(isArticleAdded);

        ArticleCreation articleTwo = new ArticleCreation();
        articleTwo.setArticleId(2);
        articleTwo.setTitle("Python Data Analysis");
        articleTwo.setWords(1500);
        articleTwo.setCategory("Data Science");
        articleTwo.setReferences(7);
        articleTwo.setLanguage("English");
        articleTwo.setEdits(12);

        isArticleAdded = wikipedia.addArticle(articleTwo);
        System.out.println(isArticleAdded);

        ArticleCreation articleThree = new ArticleCreation();
        articleThree.setArticleId(3);
        articleThree.setTitle("Web Development Essentials");
        articleThree.setWords(1800);
        articleThree.setCategory("Web Development");
        articleThree.setReferences(6);
        articleThree.setLanguage("English");
        articleThree.setEdits(15);

        isArticleAdded = wikipedia.addArticle(articleThree);
        System.out.println(isArticleAdded);

        ArticleCreation articleFour = new ArticleCreation();
        articleFour.setArticleId(4);
        articleFour.setTitle("Machine Learning Overview");
        articleFour.setWords(2000);
        articleFour.setCategory("Artificial Intelligence");
        articleFour.setReferences(8);
        articleFour.setLanguage("English");
        articleFour.setEdits(20);

        isArticleAdded = wikipedia.addArticle(articleFour);
        System.out.println(isArticleAdded);

        ArticleCreation articleFive = new ArticleCreation();
        articleFive.setArticleId(5);
        articleFive.setTitle("Cybersecurity Basics");
        articleFive.setWords(1300);
        articleFive.setCategory("Security");
        articleFive.setReferences(4);
        articleFive.setLanguage("English");
        articleFive.setEdits(9);

        isArticleAdded = wikipedia.addArticle(articleFive);
        System.out.println(isArticleAdded);

        wikipedia.getArticleDetails();
    }
}