class Twitter {

    CreateTweet tweets[] = new CreateTweet[5];
    int index;

    public boolean addTweet(CreateTweet tweet) {

        boolean isTweetAdded = false;

        boolean isTweetIdValid = false;
        boolean isUserNameValid = false;
        boolean isLikesValid = false;
        boolean isTextValid = false;
        boolean isRetweetsValid = false;
        boolean isLanguageValid = false;
        boolean isRepliesValid = false;

        int tweetId = tweet.getTweetId();
        if (tweetId > 0) {
            isTweetIdValid = true;
        }

        String userName = tweet.getUserName();
        if (userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }

        int likes = tweet.getLikes();
        if (likes >= 0) {
            isLikesValid = true;
        }

        String text = tweet.getText();
        if (text != null && !text.isEmpty()) {
            isTextValid = true;
        }

        int retweets = tweet.getRetweets();
        if (retweets >= 0) {
            isRetweetsValid = true;
        }

        String language = tweet.getLanguage();
        if (language != null && !language.isEmpty()) {
            isLanguageValid = true;
        }

        int replies = tweet.getReplies();
        if (replies >= 0) {
            isRepliesValid = true;
        }

        if (isTweetIdValid && isUserNameValid && isLikesValid &&
            isTextValid && isRetweetsValid && isLanguageValid &&
            isRepliesValid) {

            isTweetAdded = true;
            tweets[index++] = tweet;
        }

        return isTweetAdded;
    }

    public void getTweetDetails() {

        System.out.println("The tweet details are as follows :");

        for (CreateTweet tweet : tweets) {

            if (tweet != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Tweet Id : " + tweet.getTweetId());
                System.out.println("User Name : " + tweet.getUserName());
                System.out.println("Likes : " + tweet.getLikes());
                System.out.println("Text : " + tweet.getText());
                System.out.println("Retweets : " + tweet.getRetweets());
                System.out.println("Language : " + tweet.getLanguage());
                System.out.println("Replies : " + tweet.getReplies());
                System.out.println("--------------------------------------------");
            }
        }
    }
}