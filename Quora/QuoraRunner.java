class QuoraRunner {
    
    public static void main(String[] question) {
        
        Quora quora = new Quora();
        
        AnswerInfo answerOne = new AnswerInfo();
        answerOne.setAnswerId(1);
        answerOne.setQusetion("What is Java?");
        answerOne.setUpVotes(100);
        answerOne.setAuthor("James Gosling");
        answerOne.setViews(1000);
        answerOne.setTopic("Programming");
        answerOne.setShares(10);
        
        boolean isAnswerAdded = quora.addAnswer(answerOne);
        System.out.println(isAnswerAdded);
        
        AnswerInfo answerTwo = new AnswerInfo();
        answerTwo.setAnswerId(2);
        answerTwo.setQusetion("What is OOP?");
        answerTwo.setUpVotes(150);
        answerTwo.setAuthor("Jai");
        answerTwo.setViews(1200);
        answerTwo.setTopic("Concepts");
        answerTwo.setShares(15);
        
        isAnswerAdded = quora.addAnswer(answerTwo);
        System.out.println(isAnswerAdded);
        
        AnswerInfo answerThree = new AnswerInfo();
        answerThree.setAnswerId(3);
        answerThree.setQusetion("Explain Inheritance");
        answerThree.setUpVotes(130);
        answerThree.setAuthor("Anu shetty");
        answerThree.setViews(1100);
        answerThree.setTopic("OOP");
        answerThree.setShares(12);
        
        isAnswerAdded = quora.addAnswer(answerThree);
        System.out.println(isAnswerAdded);
        
        AnswerInfo answerFour = new AnswerInfo();
        answerFour.setAnswerId(4);
        answerFour.setQusetion("What is Polymorphism?");
        answerFour.setUpVotes(140);
        answerFour.setAuthor("Kiran");
        answerFour.setViews(1150);
        answerFour.setTopic("OOP");
        answerFour.setShares(14);
        
        isAnswerAdded = quora.addAnswer(answerFour);
        System.out.println(isAnswerAdded);
        
        AnswerInfo answerFive = new AnswerInfo();
        answerFive.setAnswerId(5);
        answerFive.setQusetion("What is Encapsulation?");
        answerFive.setUpVotes(160);
        answerFive.setAuthor("Ram");
        answerFive.setAuthor("Ram");
        answerFive.setViews(1300);
        answerFive.setTopic("OOP");
        answerFive.setShares(18);
        
        isAnswerAdded = quora.addAnswer(answerFive);
		System.out.println(isAnswerAdded);
		
        quora.getAnswerDetails();
        
    }
}