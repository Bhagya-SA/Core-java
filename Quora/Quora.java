class Quora {

    AnswerInfo answerInfos[] = new AnswerInfo[5];
	int index;
    
    public boolean addAnswer(AnswerInfo answerInfo) {
        
        boolean isAnswerAdded = false;
        
        boolean isAnswerIdValid = false;
        boolean isQuestionValid = false;
        boolean isUpVotesValid = false;
        boolean isAuthorValid = false;
        boolean isViewsValid = false;
        boolean isTopicValid = false;
        boolean isSharesValid = false;
        
        int answerId = answerInfo.getAnswerId();
        if(answerId > 0) {
            isAnswerIdValid = true;
        }
        
        String question = answerInfo.getQusetion();
        if(question != null && !question.isEmpty()) {
            isQuestionValid = true;
        }
        
        int upVotes = answerInfo.getUpVotes();
        if(upVotes > 0) {
            isUpVotesValid = true;
        }
        
        String author = answerInfo.getAuthor();
        if(author != null && !author.isEmpty()) {
            isAuthorValid = true;
        }
        
        int views = answerInfo.getViews();
        if(views > 0) {
            isViewsValid = true;
        }
        
        String topic = answerInfo.getTopic();
        if(topic != null && !topic.isEmpty()) {
            isTopicValid = true;
        }
        
        int shares = answerInfo.getShares();
        if(shares >= 0) {
            isSharesValid = true;
        }
        
        if(isAnswerIdValid && isQuestionValid && isUpVotesValid && isAuthorValid && isViewsValid && isTopicValid && isSharesValid) {
            
            isAnswerAdded = true;
            answerInfos[index++] = answerInfo;
        }
        
        return isAnswerAdded;
    }
    
    public void getAnswerDetails() {
        
        System.out.println("The answer details are as follows :");
        
        for(AnswerInfo answerInfo : answerInfos) {
            System.out.println("-------------------------------------------------");
            System.out.println("Answer Id is : " + answerInfo.getAnswerId());
            System.out.println("Question is : " + answerInfo.getQusetion());
            System.out.println("UpVotes are : " + answerInfo.getUpVotes());
            System.out.println("Author is : " + answerInfo.getAuthor());
            System.out.println("Views are : " + answerInfo.getViews());
            System.out.println("Topic is : " + answerInfo.getTopic());
            System.out.println("Shares are : " + answerInfo.getShares());
			System.out.println("-------------------------------------------------");
        }
    }
}