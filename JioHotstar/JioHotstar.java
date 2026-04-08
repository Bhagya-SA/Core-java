class JioHotstar {

    ShowInfo showInfos[] = new ShowInfo[5];
	int index;
    
    public boolean addShow(ShowInfo showInfo) {
        
        boolean isShowAdded = false;
        
        boolean isShowIdValid = false;
        boolean isTitleValid = false;
        boolean isViewsValid = false;
        boolean isDurationValid = false;
        boolean isLanguageValid = false;
        boolean isRatingValid = false;
        
        int showId = showInfo.getShowId();
        if(showId > 0) {
            isShowIdValid = true;
        }
        
        String title = showInfo.getTitle();
        if(title != null && !title.isEmpty()) {
            isTitleValid = true;
        }
        
        int views = showInfo.getViews();
        if(views >= 0) {
            isViewsValid = true;
        }
        
        String duration = showInfo.getDuration();
        if(duration != null && !duration.isEmpty()) {
            isDurationValid = true;
        }
        
        String language = showInfo.getLanguage();
        if(language != null && !language.isEmpty()) {
            isLanguageValid = true;
        }
        
        int rating = showInfo.getRating();
        if(rating >= 0) {
            isRatingValid = true;
        }
        
        if(isShowIdValid && isTitleValid && isViewsValid && isDurationValid 
            && isLanguageValid && isRatingValid) {
            
            isShowAdded = true;
            showInfos[index++] = showInfo;
        }
        
        return isShowAdded;
    }
    
    public void getShowDetails() {
        
        System.out.println("The show details are as follows :");
        
        for(ShowInfo showInfo : showInfos) {
            
            System.out.println("Show Id is : " + showInfo.getShowId());
            System.out.println("Title is : " + showInfo.getTitle());
            System.out.println("Views are : " + showInfo.getViews());
            System.out.println("Duration is : " + showInfo.getDuration());
            System.out.println("Language is : " + showInfo.getLanguage());
            System.out.println("Rating is : " + showInfo.getRating());
        }
    }
}