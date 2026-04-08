class GitHubRunner {

    public static void main(String[] git) {
        
        GitHub github = new GitHub();
        
        RepositoryDetails repoOne = new RepositoryDetails();
        repoOne.setRepoId(1);
        repoOne.setRepoName("DataStructures");
        repoOne.setStars(500);
        repoOne.setOwner("Aarav");
        repoOne.setForks(50);
        repoOne.setLanguage("Java");
        repoOne.setIssues(10);
        
        boolean isRepoAdded = github.addRepository(repoOne);
        github.getRepositoryDetails();
        System.out.println("--------------------------------------");
        
        RepositoryDetails repoTwo = new RepositoryDetails();
        repoTwo.setRepoId(2);
        repoTwo.setRepoName("Algorithms");
        repoTwo.setStars(450);
        repoTwo.setOwner("Bharath");
        repoTwo.setForks(40);
        repoTwo.setLanguage("Python");
        repoTwo.setIssues(5);
        
        isRepoAdded = github.addRepository(repoTwo);
        github.getRepositoryDetails();
        System.out.println("--------------------------------------");
        
        RepositoryDetails repoThree = new RepositoryDetails();
        repoThree.setRepoId(3);
        repoThree.setRepoName("MachineLearning");
        repoThree.setStars(600);
        repoThree.setOwner("Chaya");
        repoThree.setForks(70);
        repoThree.setLanguage("Python");
        repoThree.setIssues(12);
        
        isRepoAdded = github.addRepository(repoThree);
        github.getRepositoryDetails();
        System.out.println("--------------------------------------");
        
        RepositoryDetails repoFour = new RepositoryDetails();
        repoFour.setRepoId(4);
        repoFour.setRepoName("WebDevelopment");
        repoFour.setStars(350);
        repoFour.setOwner("DilRam");
        repoFour.setForks(30);
        repoFour.setLanguage("JavaScript");
        repoFour.setIssues(8);
        
        isRepoAdded = github.addRepository(repoFour);
        github.getRepositoryDetails();
        System.out.println("--------------------------------------");
        
        RepositoryDetails repoFive = new RepositoryDetails();
        repoFive.setRepoId(5);
        repoFive.setRepoName("CloudComputing");
        repoFive.setStars(400);
        repoFive.setOwner("Anira");
        repoFive.setForks(35);
        repoFive.setLanguage("Go");
        repoFive.setIssues(6);
        
        isRepoAdded = github.addRepository(repoFive);
        github.getRepositoryDetails();
        System.out.println("--------------------------------------");
    }
}