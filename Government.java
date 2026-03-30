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
	
	public String getExamByIndex(int index) {
	
		String exam = null;
		if(index < exams.length) {
			exam = exams[index];
		}
		return exam;
	}
	
	public int getIndexByExam(String exam) {
		int i = 0;
		for(String name : exams) {
			if(name == exam) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updateExamName(String existingExamName , String updatedExamName) {
		boolean isExamNameUpdated = false;
		for(int index = 0; index < exams.length; index++) {
			if(exams[index] == existingExamName) {
				exams[index] = updatedExamName;
				isExamNameUpdated = true;
			}
		}
		return isExamNameUpdated;
	}

}