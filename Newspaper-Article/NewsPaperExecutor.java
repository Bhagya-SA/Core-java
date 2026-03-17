class NewsPaperExecutor {

    public static void main(String[] newspaper) {

        /*NewsPaper n1 = new NewsPaper();
        n1.newsPaperId = 101;
        n1.newsPaperName = "The Hindu";
        n1.language = "English";
        Article a1 = new Article();
        a1.articleId = 201;
        a1.title = "Global Warming Effects";
        a1.authorName = "Rahul";
        n1.article = a1;
        n1.displayNewsPaperInfo();

        NewsPaper n2 = new NewsPaper();
        n2.newsPaperId = 102;
        n2.newsPaperName = "Times of India";
        n2.language = "English";
        Article a2 = new Article();
        a2.articleId = 202;
        a2.title = "AI in Healthcare";
        a2.authorName = "Anita";
        n2.article = a2;
        n2.displayNewsPaperInfo();

        NewsPaper n3 = new NewsPaper();
        n3.newsPaperId = 103;
        n3.newsPaperName = "Deccan Herald";
        n3.language = "English";
        Article a3 = new Article();
        a3.articleId = 203;
        a3.title = "Indian Economy Growth";
        a3.authorName = "Kiran";
        n3.article = a3;
        n3.displayNewsPaperInfo();

        NewsPaper n4 = new NewsPaper();
        n4.newsPaperId = 104;
        n4.newsPaperName = "Indian Express";
        n4.language = "English";
        Article a4 = new Article();
        a4.articleId = 204;
        a4.title = "Cricket World Cup";
        a4.authorName = "Sneha";
        n4.article = a4;
        n4.displayNewsPaperInfo();

        NewsPaper n5 = new NewsPaper();
        n5.newsPaperId = 105;
        n5.newsPaperName = "Economic Times";
        n5.language = "English";
        Article a5 = new Article();
        a5.articleId = 205;
        a5.title = "Startup Culture";
        a5.authorName = "Arjun";
        n5.article = a5;
        n5.displayNewsPaperInfo();

        NewsPaper n6 = new NewsPaper();
        n6.newsPaperId = 106;
        n6.newsPaperName = "The Hindu";
        n6.language = "English";
        Article a6 = new Article();
        a6.articleId = 206;
        a6.title = "Education Policy";
        a6.authorName = "Meera";
        n6.article = a6;
        n6.displayNewsPaperInfo();

        NewsPaper n7 = new NewsPaper();
        n7.newsPaperId = 107;
        n7.newsPaperName = "Times of India";
        n7.language = "English";
        Article a7 = new Article();
        a7.articleId = 207;
        a7.title = "Olympics Highlights";
        a7.authorName = "Ravi";
        n7.article = a7;
        n7.displayNewsPaperInfo();

        NewsPaper n8 = new NewsPaper();
        n8.newsPaperId = 108;
        n8.newsPaperName = "Deccan Herald";
        n8.language = "English";
        Article a8 = new Article();
        a8.articleId = 208;
        a8.title = "Technology Trends";
        a8.authorName = "Priya";
        n8.article = a8;
        n8.displayNewsPaperInfo();

        NewsPaper n9 = new NewsPaper();
        n9.newsPaperId = 109;
        n9.newsPaperName = "Indian Express";
        n9.language = "English";
        Article a9 = new Article();
        a9.articleId = 209;
        a9.title = "Cyber Security";
        a9.authorName = "Manoj";
        n9.article = a9;
        n9.displayNewsPaperInfo();

        NewsPaper n10 = new NewsPaper();
        n10.newsPaperId = 110;
        n10.newsPaperName = "Economic Times";
        n10.language = "English";
        Article a10 = new Article();
        a10.articleId = 210;
        a10.title = "Business Growth";
        a10.authorName = "Pooja";
        n10.article = a10;
        n10.displayNewsPaperInfo();

        NewsPaper n11 = new NewsPaper();
        n11.newsPaperId = 111;
        n11.newsPaperName = "The Hindu";
        n11.language = "English";
        Article a11 = new Article();
        a11.articleId = 211;
        a11.title = "Space Research";
        a11.authorName = "Sanjay";
        n11.article = a11;
        n11.displayNewsPaperInfo();

        NewsPaper n12 = new NewsPaper();
        n12.newsPaperId = 112;
        n12.newsPaperName = "Times of India";
        n12.language = "English";
        Article a12 = new Article();
        a12.articleId = 212;
        a12.title = "Medical Research";
        a12.authorName = "Divya";
        n12.article = a12;
        n12.displayNewsPaperInfo();

        NewsPaper n13 = new NewsPaper();
        n13.newsPaperId = 113;
        n13.newsPaperName = "Deccan Herald";
        n13.language = "English";
        Article a13 = new Article();
        a13.articleId = 213;
        a13.title = "Election Updates";
        a13.authorName = "Akash";
        n13.article = a13;
        n13.displayNewsPaperInfo();

        NewsPaper n14 = new NewsPaper();
        n14.newsPaperId = 114;
        n14.newsPaperName = "Indian Express";
        n14.language = "English";
        Article a14 = new Article();
        a14.articleId = 214;
        a14.title = "Renewable Energy";
        a14.authorName = "Lakshmi";
        n14.article = a14;
        n14.displayNewsPaperInfo();

        NewsPaper n15 = new NewsPaper();
        n15.newsPaperId = 115;
        n15.newsPaperName = "Economic Times";
        n15.language = "English";
        Article a15 = new Article();
        a15.articleId = 215;
        a15.title = "Stock Market Analysis";
        a15.authorName = "Rohit";
        n15.article = a15;
        n15.displayNewsPaperInfo();

        NewsPaper n16 = new NewsPaper();
        n16.newsPaperId = 116;
        n16.newsPaperName = "The Hindu";
        n16.language = "English";
        Article a16 = new Article();
        a16.articleId = 216;
        a16.title = "Digital India";
        a16.authorName = "Neha";
        n16.article = a16;
        n16.displayNewsPaperInfo();

        NewsPaper n17 = new NewsPaper();
        n17.newsPaperId = 117;
        n17.newsPaperName = "Times of India";
        n17.language = "English";
        Article a17 = new Article();
        a17.articleId = 217;
        a17.title = "Blockchain Technology";
        a17.authorName = "Karthik";
        n17.article = a17;
        n17.displayNewsPaperInfo();

        NewsPaper n18 = new NewsPaper();
        n18.newsPaperId = 118;
        n18.newsPaperName = "Deccan Herald";
        n18.language = "English";
        Article a18 = new Article();
        a18.articleId = 218;
        a18.title = "Network Security";
        a18.authorName = "Deepa";
        n18.article = a18;
        n18.displayNewsPaperInfo();

        NewsPaper n19 = new NewsPaper();
        n19.newsPaperId = 119;
        n19.newsPaperName = "Indian Express";
        n19.language = "English";
        Article a19 = new Article();
        a19.articleId = 219;
        a19.title = "Game Development";
        a19.authorName = "Vikram";
        n19.article = a19;
        n19.displayNewsPaperInfo();

        NewsPaper n20 = new NewsPaper();
        n20.newsPaperId = 120;
        n20.newsPaperName = "Economic Times";
        n20.language = "English";
        Article a20 = new Article();
        a20.articleId = 220;
        a20.title = "Cyber Security Trends";
        a20.authorName = "Anil";
        n20.article = a20;
        n20.displayNewsPaperInfo(); */
        Article a1 = new Article(201, "Global Warming Effects", "Rahul");
        NewsPaper n1 = new NewsPaper(101, "The Hindu", "English", a1);
        n1.displayNewsPaperInfo();

        Article a2 = new Article(202, "AI in Healthcare", "Anita");
        NewsPaper n2 = new NewsPaper(102, "Times of India", "English", a2);
        n2.displayNewsPaperInfo();

        Article a3 = new Article(203, "Indian Economy Growth", "Kiran");
        NewsPaper n3 = new NewsPaper(103, "Deccan Herald", "English", a3);
        n3.displayNewsPaperInfo();

        Article a4 = new Article(204, "Cricket World Cup", "Sneha");
        NewsPaper n4 = new NewsPaper(104, "Indian Express", "English", a4);
        n4.displayNewsPaperInfo();

        Article a5 = new Article(205, "Startup Culture", "Arjun");
        NewsPaper n5 = new NewsPaper(105, "Economic Times", "English", a5);
        n5.displayNewsPaperInfo();

        Article a6 = new Article(206, "Education Policy", "Meera");
        NewsPaper n6 = new NewsPaper(106, "The Hindu", "English", a6);
        n6.displayNewsPaperInfo();

        Article a7 = new Article(207, "Olympics Highlights", "Ravi");
        NewsPaper n7 = new NewsPaper(107, "Times of India", "English", a7);
        n7.displayNewsPaperInfo();

        Article a8 = new Article(208, "Technology Trends", "Priya");
        NewsPaper n8 = new NewsPaper(108, "Deccan Herald", "English", a8);
        n8.displayNewsPaperInfo();

        Article a9 = new Article(209, "Cyber Security", "Manoj");
        NewsPaper n9 = new NewsPaper(109, "Indian Express", "English", a9);
        n9.displayNewsPaperInfo();

        Article a10 = new Article(210, "Business Growth", "Pooja");
        NewsPaper n10 = new NewsPaper(110, "Economic Times", "English", a10);
        n10.displayNewsPaperInfo();

        Article a11 = new Article(211, "Space Research", "Sanjay");
        NewsPaper n11 = new NewsPaper(111, "The Hindu", "English", a11);
        n11.displayNewsPaperInfo();

        Article a12 = new Article(212, "Medical Research", "Divya");
        NewsPaper n12 = new NewsPaper(112, "Times of India", "English", a12);
        n12.displayNewsPaperInfo();

        Article a13 = new Article(213, "Election Updates", "Akash");
        NewsPaper n13 = new NewsPaper(113, "Deccan Herald", "English", a13);
        n13.displayNewsPaperInfo();

        Article a14 = new Article(214, "Renewable Energy", "Lakshmi");
        NewsPaper n14 = new NewsPaper(114, "Indian Express", "English", a14);
        n14.displayNewsPaperInfo();

        Article a15 = new Article(215, "Stock Market Analysis", "Rohit");
        NewsPaper n15 = new NewsPaper(115, "Economic Times", "English", a15);
        n15.displayNewsPaperInfo();

        Article a16 = new Article(216, "Digital India", "Neha");
        NewsPaper n16 = new NewsPaper(116, "The Hindu", "English", a16);
        n16.displayNewsPaperInfo();

        Article a17 = new Article(217, "Blockchain Technology", "Karthik");
        NewsPaper n17 = new NewsPaper(117, "Times of India", "English", a17);
        n17.displayNewsPaperInfo();

        Article a18 = new Article(218, "Network Security", "Deepa");
        NewsPaper n18 = new NewsPaper(118, "Deccan Herald", "English", a18);
        n18.displayNewsPaperInfo();

        Article a19 = new Article(219, "Game Development", "Vikram");
        NewsPaper n19 = new NewsPaper(119, "Indian Express", "English", a19);
        n19.displayNewsPaperInfo();

        Article a20 = new Article(220, "Cyber Security Trends", "Anil");
        NewsPaper n20 = new NewsPaper(120, "Economic Times", "English", a20);
        n20.displayNewsPaperInfo();
    
    }
}
