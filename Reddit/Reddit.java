class Reddit {

    Post posts[] = new Post[5];
	int index;
    
    public boolean addPost(Post post) {
        
        boolean isPostAdded = false;
        
        boolean isPostIdValid = false;
        boolean isSubbredditValid = false;
        boolean isUpVotesValid = false;
        boolean isTitleValid = false;
        boolean isCommentsValid = false;
        boolean isUserValid = false;
        boolean isAwardsValid = false;
        
        int postId = post.getPostId();
        if(postId > 0) {
            isPostIdValid = true;
        }
        
        String subbreddit = post.getSubbreddit();
        if(subbreddit != null && !subbreddit.isEmpty()) {
            isSubbredditValid = true;
        }
        
        int upVotes = post.getUpVotes();
        if(upVotes > 0) {
            isUpVotesValid = true;
        }
        
        String title = post.getTitle();
        if(title != null && !title.isEmpty()) {
            isTitleValid = true;
        }
        
        int comments = post.getComments();
        if(comments >= 0) {
            isCommentsValid = true;
        }
        
        String user = post.getUser();
        if(user != null && !user.isEmpty()) {
            isUserValid = true;
        }
        
        int awards = post.getAwards();
        if(awards >= 0) {
            isAwardsValid = true;
        }
        
        if(isPostIdValid && isSubbredditValid && isUpVotesValid && isTitleValid && isCommentsValid && isUserValid && isAwardsValid) {
            
            isPostAdded = true;
            posts[index++] = post;
        }
        
        return isPostAdded;
    }
    
    public void getPostDetails() {
        
        System.out.println("The post details are as follows :");
        
        for(Post post : posts) {
            System.out.println("----------------------------------------------");
            System.out.println("Post Id is : " + post.getPostId());
            System.out.println("Subbreddit is : " + post.getSubbreddit());
            System.out.println("UpVotes are : " + post.getUpVotes());
            System.out.println("Title is : " + post.getTitle());
            System.out.println("Comments are : " + post.getComments());
            System.out.println("User is : " + post.getUser());
            System.out.println("Awards are : " + post.getAwards());
			System.out.println("----------------------------------------------");
        }
    }
}