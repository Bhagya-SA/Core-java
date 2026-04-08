class StackOverFlowRunner {

    public static void main(String[] stacks) {
        
        StackOverFlow stack = new StackOverFlow();
        
        QuestionsInfo questionOne = new QuestionsInfo();
        questionOne.setQusetionId(1);
        questionOne.setTitle("What is Java?");
        questionOne.setVotes(100);
        questionOne.setTag("Programming");
        questionOne.setAnswers(10);
        questionOne.setUserName("Ram");
        questionOne.setViews(1000);
        
        boolean isQuestionAdded = stack.addQuestion(questionOne);
        System.out.println(isQuestionAdded);
       
        
        QuestionsInfo questionTwo = new QuestionsInfo();
        questionTwo.setQusetionId(2);
        questionTwo.setTitle("Explain OOP Concepts");
        questionTwo.setVotes(150);
        questionTwo.setTag("Java");
        questionTwo.setAnswers(15);
        questionTwo.setUserName("Lakshman");
        questionTwo.setViews(1200);
        
        isQuestionAdded = stack.addQuestion(questionTwo);
        System.out.println(isQuestionAdded);
        
        
        QuestionsInfo questionThree = new QuestionsInfo();
        questionThree.setQusetionId(3);
        questionThree.setTitle("What is Inheritance?");
        questionThree.setVotes(120);
        questionThree.setTag("OOP");
        questionThree.setAnswers(12);
        questionThree.setUserName("Sita");
        questionThree.setViews(1100);
        
        isQuestionAdded = stack.addQuestion(questionThree);
        System.out.println(isQuestionAdded);
        
        
        QuestionsInfo questionFour = new QuestionsInfo();
        questionFour.setQusetionId(4);
        questionFour.setTitle("What is Polymorphism?");
        questionFour.setVotes(140);
        questionFour.setTag("OOP");
        questionFour.setAnswers(14);
        questionFour.setUserName("Hanuman");
        questionFour.setViews(1150);
        
        isQuestionAdded = stack.addQuestion(questionFour);
        System.out.println(isQuestionAdded);
        
        
        QuestionsInfo questionFive = new QuestionsInfo();
        questionFive.setQusetionId(5);
        questionFive.setTitle("Explain Encapsulation");
        questionFive.setVotes(160);
        questionFive.setTag("OOP");
        questionFive.setAnswers(18);
        questionFive.setUserName("Krishna");
        questionFive.setViews(1300);
        
        isQuestionAdded = stack.addQuestion(questionFive);
        stack.getQuestionDetails();
        
    }
}