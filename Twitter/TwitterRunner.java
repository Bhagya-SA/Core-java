class TwitterRunner {

    public static void main(String[] args) {

        Twitter twitter = new Twitter();

        CreateTweet tweetOne = new CreateTweet();
        tweetOne.setTweetId(1);
        tweetOne.setUserName("Alice");
        tweetOne.setLikes(120);
        tweetOne.setText("Hello world! Excited to join Twitter.");
        tweetOne.setRetweets(15);
        tweetOne.setLanguage("English");
        tweetOne.setReplies(10);

        boolean isTweetAdded = twitter.addTweet(tweetOne);
        System.out.println(isTweetAdded);

        CreateTweet tweetTwo = new CreateTweet();
        tweetTwo.setTweetId(2);
        tweetTwo.setUserName("Bob");
        tweetTwo.setLikes(200);
        tweetTwo.setText("Just had the best coffee ever!");
        tweetTwo.setRetweets(30);
        tweetTwo.setLanguage("English");
        tweetTwo.setReplies(5);

        isTweetAdded = twitter.addTweet(tweetTwo);
        System.out.println(isTweetAdded);

        CreateTweet tweetThree = new CreateTweet();
        tweetThree.setTweetId(3);
        tweetThree.setUserName("Charlie");
        tweetThree.setLikes(150);
        tweetThree.setText("Learning Java is fun!");
        tweetThree.setRetweets(20);
        tweetThree.setLanguage("English");
        tweetThree.setReplies(8);

        isTweetAdded = twitter.addTweet(tweetThree);
        System.out.println(isTweetAdded);

        CreateTweet tweetFour = new CreateTweet();
        tweetFour.setTweetId(4);
        tweetFour.setUserName("Diana");
        tweetFour.setLikes(180);
        tweetFour.setText("Good morning everyone!");
        tweetFour.setRetweets(25);
        tweetFour.setLanguage("English");
        tweetFour.setReplies(12);

        isTweetAdded = twitter.addTweet(tweetFour);
        System.out.println(isTweetAdded);

        CreateTweet tweetFive = new CreateTweet();
        tweetFive.setTweetId(5);
        tweetFive.setUserName("Ethan");
        tweetFive.setLikes(210);
        tweetFive.setText("Check out my new blog post!");
        tweetFive.setRetweets(40);
        tweetFive.setLanguage("English");
        tweetFive.setReplies(15);

        isTweetAdded = twitter.addTweet(tweetFive);
        System.out.println(isTweetAdded);

        twitter.getTweetDetails();
    }
}