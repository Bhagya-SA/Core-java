class GitHub {

    RepositoryDetails repoDetails[] = new RepositoryDetails[5];
	int index;
    
    public boolean addRepository(RepositoryDetails repoDetails) {
        
        boolean isRepoAdded = false;
        
        boolean isRepoIdValid = false;
        boolean isRepoNameValid = false;
        boolean isStarsValid = false;
        boolean isOwnerValid = false;
        boolean isForksValid = false;
        boolean isLanguageValid = false;
        boolean isIssuesValid = false;
        
        int repoId = repoDetails.getRepoId();
        if(repoId > 0) {
            isRepoIdValid = true;
        }
        
        String repoName = repoDetails.getRepoName();
        if(repoName != null && !repoName.isEmpty()) {
            isRepoNameValid = true;
        }
        
        int stars = repoDetails.getStars();
        if(stars >= 0) {
            isStarsValid = true;
        }
        
        String owner = repoDetails.getOwner();
        if(owner != null && !owner.isEmpty()) {
            isOwnerValid = true;
        }
        
        int forks = repoDetails.getForks();
        if(forks >= 0) {
            isForksValid = true;
        }
        
        String language = repoDetails.getLanguage();
        if(language != null && !language.isEmpty()) {
            isLanguageValid = true;
        }
        
        int issues = repoDetails.getIssues();
        if(issues >= 0) {
            isIssuesValid = true;
        }
        
        if(isRepoIdValid && isRepoNameValid && isStarsValid && isOwnerValid && isForksValid && isLanguageValid && isIssuesValid) {
            
            isRepoAdded = true;
            repoDetails[index++] = repoDetails;
        }
        
        return isRepoAdded;
    }
    
    public void getRepositoryDetails() {
        
        System.out.println("The repository details are as follows :");
        
        for(RepositoryDetails repoDetail : repoDetails) {
            
			System.out.println("-----------------------------------------------------");
            System.out.println("Repository Id is : " + repoDetails.getRepoId());
            System.out.println("Repository Name is : " + repoDetails.getRepoName());
            System.out.println("Stars are : " + repoDetails.getStars());
            System.out.println("Owner is : " + repoDetails.getOwner());
            System.out.println("Forks are : " + repoDetails.getForks());
            System.out.println("Language is : " + repoDetails.getLanguage());
            System.out.println("Issues are : " + repoDetails.getIssues());
			System.out.println("-----------------------------------------------------");
        }
    }
}