class StackOverFlow {

    QuestionsInfo questionInfos[] = new QuestionsInfo[5];
    
    public boolean addQuestion(QuestionsInfo questionInfo) {
        
        boolean isQuestionAdded = false;
        
        boolean isQuestionIdValid = false;
        boolean isTitleValid = false;
        boolean isVotesValid = false;
        boolean isTagValid = false;
        boolean isAnswersValid = false;
        boolean isUserNameValid = false;
        boolean isViewsValid = false;
        
        int qusetionId = questionInfo.getQusetionId();
        if(qusetionId > 0) {
            isQuestionIdValid = true;
        }
        
        String title = questionInfo.getTitle();
        if(title != null && !title.isEmpty()) {
            isTitleValid = true;
        }
        
        int votes = questionInfo.getVotes();
        if(votes >= 0) {
            isVotesValid = true;
        }
        
        String tag = questionInfo.getTag();
        if(tag != null && !tag.isEmpty()) {
            isTagValid = true;
        }
        
        int answers = questionInfo.getAnswers();
        if(answers >= 0) {
            isAnswersValid = true;
        }
        
        String userName = questionInfo.getUserName();
        if(userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }
        
        int views = questionInfo.getViews();
        if(views >= 0) {
            isViewsValid = true;
        }
        
        if(isQuestionIdValid && isTitleValid && isVotesValid && isTagValid 
            && isAnswersValid && isUserNameValid && isViewsValid) {
            
            isQuestionAdded = true;
            questionInfos[index++] = questionInfo;
        }
        
        return isQuestionAdded;
    }
    
    public void getQuestionDetails() {
        
        System.out.println("The question details are as follows :");
        
        for(QuestionsInfo questionInfo : questionInfos) {
            
			System.out.println("-------------------------------------------------");
            System.out.println("Question Id is : " + questionInfo.getQusetionId());
            System.out.println("Title is : " + questionInfo.getTitle());
            System.out.println("Votes are : " + questionInfo.getVotes());
            System.out.println("Tag is : " + questionInfo.getTag());
            System.out.println("Answers are : " + questionInfo.getAnswers());
            System.out.println("User Name is : " + questionInfo.getUserName());
            System.out.println("Views are : " + questionInfo.getViews());
			System.out.println("-------------------------------------------------");
        }
    }
}