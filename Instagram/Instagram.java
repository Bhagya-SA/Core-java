class Instagram {

    ProfileCreation profiles[] = new ProfileCreation[5];
    int index;

    public boolean addProfile(ProfileCreation profile) {

        boolean isProfileAdded = false;

        boolean isUserIdValid = false;
        boolean isUserNameValid = false;
        boolean isFollowersValid = false;
        boolean isBioValid = false;
        boolean isPostsValid = false;
        boolean isLocationValid = false;
        boolean isFollowingValid = false;

        int userId = profile.getUserId();
        if (userId > 0) {
            isUserIdValid = true;
        }

        String userName = profile.getUserName();
        if (userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }

        int followers = profile.getFollowers();
        if (followers >= 0) {
            isFollowersValid = true;
        }

        String bio = profile.getBio();
        if (bio != null && !bio.isEmpty()) {
            isBioValid = true;
        }

        int posts = profile.getPosts();
        if (posts >= 0) {
            isPostsValid = true;
        }

        String location = profile.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

        int following = profile.getFollowing();
        if (following >= 0) {
            isFollowingValid = true;
        }

        if (isUserIdValid && isUserNameValid && isFollowersValid &&
            isBioValid && isPostsValid && isLocationValid && isFollowingValid) {

            isProfileAdded = true;
            profiles[index++] = profile;
        }

        return isProfileAdded;
    }

    public void getProfileDetails() {

        System.out.println("The Instagram profile details are as follows :");

        for (ProfileCreation profile : profiles) {

            if (profile != null) {
                System.out.println("--------------------------------------------");
                System.out.println("User Id : " + profile.getUserId());
                System.out.println("User Name : " + profile.getUserName());
                System.out.println("Followers : " + profile.getFollowers());
                System.out.println("Bio : " + profile.getBio());
                System.out.println("Posts : " + profile.getPosts());
                System.out.println("Location : " + profile.getLocation());
                System.out.println("Following : " + profile.getFollowing());
                System.out.println("--------------------------------------------");
            }
        }
    }
}