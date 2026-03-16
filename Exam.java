class Exam {

    int examId;
    String examName;
    int courseId;
    String examDate;
    String examTime;
    String examType;
    int totalMarks;
    int passingMarks;
    String examinerName;
    String examRoom;
    double durationMinutes;
    boolean isOnline;
	String instructions;

    Exam(int examId){
        this.examId = examId;
    }

    Exam(String examName , int examId){
        this.examName = examName;
		this.examId = examId;
    }

    Exam(int courseId, String examDate){
        this.courseId = courseId;
        this.examDate = examDate;
    }

    Exam(String examTime, String examType){
        this.examTime = examTime;
        this.examType = examType;
    }

    Exam(int totalMarks, int passingMarks){
        this.totalMarks = totalMarks;
        this.passingMarks = passingMarks;
    }

    Exam(String examinerName , boolean isOnline){
        this.examinerName = examinerName;
		this.isOnline = isOnline;
    }

    Exam(String examRoom, double durationMinutes){
        this.examRoom = examRoom;
        this.durationMinutes = durationMinutes;
    }

    Exam(boolean isOnline){
        this.isOnline = isOnline;
    }

    Exam(int examId, String examName , boolean isOnline){
        this.examId = examId;
        this.examName = examName;
		this.isOnline = isOnline;
    }

    Exam(String examType, int totalMarks , boolean isOnline){
        this.examType = examType;
        this.totalMarks = totalMarks;
		this.isOnline = isOnline;
    }

    Exam(String instructions){
        this.instructions = instructions;
    }

    Exam(int examId, String examName, int courseId){
        this.examId = examId;
        this.examName = examName;
        this.courseId = courseId;
    }
}