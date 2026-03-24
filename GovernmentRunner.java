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
        
    }
}