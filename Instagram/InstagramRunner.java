class InstagramRunner {

    public static void main(String[] insta) {

        Instagram instagram = new Instagram();

        ProfileCreation profileOne = new ProfileCreation();
        profileOne.setUserId(1);
        profileOne.setUserName("Anu");
        profileOne.setFollowers(500);
        profileOne.setBio("Love photography and travel.");
        profileOne.setPosts(50);
        profileOne.setLocation("Mumbai");
        profileOne.setFollowing(200);

        boolean isProfileAdded = instagram.addProfile(profileOne);
        System.out.println(isProfileAdded);

        ProfileCreation profileTwo = new ProfileCreation();
        profileTwo.setUserId(2);
        profileTwo.setUserName("Bharathi");
        profileTwo.setFollowers(300);
        profileTwo.setBio("Foodie and blogger.");
        profileTwo.setPosts(35);
        profileTwo.setLocation("Bangalore");
        profileTwo.setFollowing(150);

        isProfileAdded = instagram.addProfile(profileTwo);
        System.out.println(isProfileAdded);

        ProfileCreation profileThree = new ProfileCreation();
        profileThree.setUserId(3);
        profileThree.setUserName("Charvi");
        profileThree.setFollowers(800);
        profileThree.setBio("Fitness enthusiast.");
        profileThree.setPosts(70);
        profileThree.setLocation("Delhi");
        profileThree.setFollowing(400);

        isProfileAdded = instagram.addProfile(profileThree);
        System.out.println(isProfileAdded);

        ProfileCreation profileFour = new ProfileCreation();
        profileFour.setUserId(4);
        profileFour.setUserName("Diya");
        profileFour.setFollowers(600);
        profileFour.setBio("Travel and lifestyle.");
        profileFour.setPosts(55);
        profileFour.setLocation("Pune");
        profileFour.setFollowing(350);

        isProfileAdded = instagram.addProfile(profileFour);
        System.out.println(isProfileAdded);

        ProfileCreation profileFive = new ProfileCreation();
        profileFive.setUserId(5);
        profileFive.setUserName("Gowri");
        profileFive.setFollowers(900);
        profileFive.setBio("Tech geek and gamer.");
        profileFive.setPosts(80);
        profileFive.setLocation("Hyderabad");
        profileFive.setFollowing(500);

        isProfileAdded = instagram.addProfile(profileFive);
        System.out.println(isProfileAdded);

        instagram.getProfileDetails();
    }
}