class YouTubeRunner {

    public static void main(String[] args) {

        YouTube youtube = new YouTube();

        VideoInfo videoOne = new VideoInfo();
        videoOne.setVideoId(1);
        videoOne.setTitle("Java Tutorial for Beginners");
        videoOne.setViews(12000);
        videoOne.setChannelName("Code Academy");
        videoOne.setLikes(500);
        videoOne.setCategory("Education");
        videoOne.setDuration(600);

        boolean isVideoAdded = youtube.addVideo(videoOne);
        System.out.println(isVideoAdded);

        VideoInfo videoTwo = new VideoInfo();
        videoTwo.setVideoId(2);
        videoTwo.setTitle("Top 10 Travel Destinations");
        videoTwo.setViews(15000);
        videoTwo.setChannelName("Travel Vlogs");
        videoTwo.setLikes(700);
        videoTwo.setCategory("Travel");
        videoTwo.setDuration(480);

        isVideoAdded = youtube.addVideo(videoTwo);
        System.out.println(isVideoAdded);

        VideoInfo videoThree = new VideoInfo();
        videoThree.setVideoId(3);
        videoThree.setTitle("Healthy Recipes at Home");
        videoThree.setViews(9000);
        videoThree.setChannelName("Foodie Fun");
        videoThree.setLikes(450);
        videoThree.setCategory("Food");
        videoThree.setDuration(300);

        isVideoAdded = youtube.addVideo(videoThree);
        System.out.println(isVideoAdded);

        VideoInfo videoFour = new VideoInfo();
        videoFour.setVideoId(4);
        videoFour.setTitle("Morning Yoga Routine");
        videoFour.setViews(8000);
        videoFour.setChannelName("Fitness Daily");
        videoFour.setLikes(400);
        videoFour.setCategory("Fitness");
        videoFour.setDuration(420);

        isVideoAdded = youtube.addVideo(videoFour);
        System.out.println(isVideoAdded);

        VideoInfo videoFive = new VideoInfo();
        videoFive.setVideoId(5);
        videoFive.setTitle("Music Hits 2026");
        videoFive.setViews(20000);
        videoFive.setChannelName("Top Music");
        videoFive.setLikes(1000);
        videoFive.setCategory("Music");
        videoFive.setDuration(360);

        isVideoAdded = youtube.addVideo(videoFive);
        System.out.println(isVideoAdded);

        youtube.getVideoDetails();
    }
}