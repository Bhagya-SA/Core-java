class JioHotstarRunner {

    public static void main(String[] entertainment) {
        
        JioHotstar hotstar = new JioHotstar();
        
        ShowInfo showOne = new ShowInfo();
        showOne.setShowId(1);
        showOne.setTitle("The Office");
        showOne.setViews(5000);
        showOne.setDuration("22min");
        showOne.setLanguage("English");
        showOne.setRating(9);
        
        boolean isShowAdded = hotstar.addShow(showOne);
        System.out.println(isShowAdded);
        
        ShowInfo showTwo = new ShowInfo();
        showTwo.setShowId(2);
        showTwo.setTitle("Friends");
        showTwo.setViews(6000);
        showTwo.setDuration("23min");
        showTwo.setLanguage("English");
        showTwo.setRating(10);
        
        isShowAdded = hotstar.addShow(showTwo);
        System.out.println(isShowAdded);
        
        ShowInfo showThree = new ShowInfo();
        showThree.setShowId(3);
        showThree.setTitle("Money Heist");
        showThree.setViews(8000);
        showThree.setDuration("45min");
        showThree.setLanguage("Spanish");
        showThree.setRating(9);
        
        isShowAdded = hotstar.addShow(showThree);
        System.out.println(isShowAdded);
        
        ShowInfo showFour = new ShowInfo();
        showFour.setShowId(4);
        showFour.setTitle("Breaking Bad");
        showFour.setViews(9000);
        showFour.setDuration("50min");
        showFour.setLanguage("English");
        showFour.setRating(10);
        
        isShowAdded = hotstar.addShow(showFour);
        System.out.println(isShowAdded);
        
        ShowInfo showFive = new ShowInfo();
        showFive.setShowId(5);
        showFive.setTitle("Stranger Things");
        showFive.setViews(7000);
        showFive.setDuration("55min");
        showFive.setLanguage("English");
        showFive.setRating(9);
        
        isShowAdded = hotstar.addShow(showFive);
		System.out.println(isShowAdded);
        hotstar.getShowDetails();
        
    }
}