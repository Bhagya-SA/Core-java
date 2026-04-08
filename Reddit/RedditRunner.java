class RedditRunner {

    public static void main(String[] posts) {
        
        Reddit reddit = new Reddit();
        
        Post postOne = new Post();
        postOne.setPostId(1);
        postOne.setSubbreddit("Java");
        postOne.setUpVotes(120);
        postOne.setTitle("Understanding OOP Concepts");
        postOne.setComments(25);
        postOne.setUser("Shruthi");
        postOne.setAwards(3);
        
        boolean isPostAdded = reddit.addPost(postOne);
		System.out.println(isPostAdded);
        
        
        Post postTwo = new Post();
        postTwo.setPostId(2);
        postTwo.setSubbreddit("Programming");
        postTwo.setUpVotes(200);
        postTwo.setTitle("Best Coding Practices");
        postTwo.setComments(40);
        postTwo.setUser("Kavitha");
        postTwo.setAwards(5);
        
        isPostAdded = reddit.addPost(postTwo);
		System.out.println(isPostAdded);
        
        
        Post postThree = new Post();
        postThree.setPostId(3);
        postThree.setSubbreddit("Technology");
        postThree.setUpVotes(150);
        postThree.setTitle("Latest Tech Trends");
        postThree.setComments(30);
        postThree.setUser("Radhika");
        postThree.setAwards(2);
        
        isPostAdded = reddit.addPost(postThree);
		System.out.println(isPostAdded);
        
        
        Post postFour = new Post();
        postFour.setPostId(4);
        postFour.setSubbreddit("Coding");
        postFour.setUpVotes(180);
        postFour.setTitle("Data Structures Guide");
        postFour.setComments(35);
        postFour.setUser("Ram");
        postFour.setAwards(4);
        
        isPostAdded = reddit.addPost(postFour);
		System.out.println(isPostAdded);
        
        
        Post postFive = new Post();
        postFive.setPostId(5);
        postFive.setSubbreddit("Developers");
        postFive.setUpVotes(220);
        postFive.setTitle("Career in Software Development");
        postFive.setComments(50);
        postFive.setUser("Sita");
        postFive.setAwards(6);
        
        isPostAdded = reddit.addPost(postFive);
		System.out.println(isPostAdded);
		
        reddit.getPostDetails();
        
    }
}