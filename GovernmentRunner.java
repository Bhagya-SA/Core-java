class GovernmentRunner {

    public static void main(String[] govt) {
    
        Government govtexam = new Government();
        
        govtexam.addExam("UPSC Civil Services");
        govtexam.addExam("SSC CGL");
        govtexam.addExam("IBPS PO");
        govtexam.addExam("RRB NTPC");
        govtexam.addExam("SBI PO");
        govtexam.addExam("NDA");
        govtexam.addExam("CDS");
        govtexam.addExam("GATE");
        govtexam.addExam("UGC NET");
        
        govtexam.getExams();
		System.out.println("---------------------------------------------------");
		
		System.out.println(govtexam.getExamByIndex(7));
		System.out.println("---------------------------------------------------");
		
		System.out.println(govtexam.getIndexByExam("NDA"));
		System.out.println("---------------------------------------------------");
		
		
		govtexam.updateExamName("SSC CGL" , "SSC");
		System.out.println("The updated exam names is as follows : ");
		govtexam.getExams();
		System.out.println("---------------------------------------------------");

        
    }
}