class YouTube {

    VideoInfo videos[] = new VideoInfo[5];
    int index;

    public boolean addVideo(VideoInfo video) {

        boolean isVideoAdded = false;

        boolean isVideoIdValid = false;
        boolean isTitleValid = false;
        boolean isViewsValid = false;
        boolean isChannelNameValid = false;
        boolean isLikesValid = false;
        boolean isCategoryValid = false;
        boolean isDurationValid = false;

        int videoId = video.getVideoId();
        if (videoId > 0) {
            isVideoIdValid = true;
        }

        String title = video.getTitle();
        if (title != null && !title.isEmpty()) {
            isTitleValid = true;
        }

        int views = video.getViews();
        if (views >= 0) {
            isViewsValid = true;
        }

        String channelName = video.getChannelName();
        if (channelName != null && !channelName.isEmpty()) {
            isChannelNameValid = true;
        }

        int likes = video.getLikes();
        if (likes >= 0) {
            isLikesValid = true;
        }

        String category = video.getCategory();
        if (category != null && !category.isEmpty()) {
            isCategoryValid = true;
        }

        int duration = video.getDuration();
        if (duration > 0) {
            isDurationValid = true;
        }

        if (isVideoIdValid && isTitleValid && isViewsValid &&
            isChannelNameValid && isLikesValid && isCategoryValid &&
            isDurationValid) {

            isVideoAdded = true;
            videos[index++] = video;
        }

        return isVideoAdded;
    }

    public void getVideoDetails() {

        System.out.println("The YouTube video details are as follows :");

        for (VideoInfo video : videos) {

            if (video != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Video Id : " + video.getVideoId());
                System.out.println("Title : " + video.getTitle());
                System.out.println("Views : " + video.getViews());
                System.out.println("Channel Name : " + video.getChannelName());
                System.out.println("Likes : " + video.getLikes());
                System.out.println("Category : " + video.getCategory());
                System.out.println("Duration : " + video.getDuration() + " sec");
                System.out.println("--------------------------------------------");
            }
        }
    }
}