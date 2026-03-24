class Government {

	private String exams[] = new String[9];
	int index;
	
	public boolean addExam(String exam) {
	
		boolean isExamAdded = false;
		
		if(exam != null && !exam.isEmpty()) {
			exams[index++] = exam;
			isExamAdded = true;
			
		}
		else {
			System.out.println("Please enter valid exam name");
		}
		return isExamAdded;
	}
	
	public void getExams() {
	
	for(String exam : exams) System.out.println(exam);
	}

}