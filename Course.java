class Course {

    int courseId;
    String courseName;
    String department;
    int credits;
    String instructorName;
    String schedule;
    String classroom;
    int maxStudents;
    long enrolledStudents;
    double courseFee;
    boolean isOnline;
    String description;

    
    Course(int courseId) {
        this.courseId = courseId;
    }

    
    Course(String courseName) {
        this.courseName = courseName;
    }

    
    Course(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    
    Course(int courseId, int credits) {
        this.courseId = courseId;
        this.credits = credits;
    }

    
    Course(String instructorName, String schedule , int courseId) {
        this.instructorName = instructorName;
        this.schedule = schedule;
		this.courseId = courseId;
    }

    
    Course(String classroom, int maxStudents) {
        this.classroom = classroom;
        this.maxStudents = maxStudents;
    }

    
    Course(long enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    
    Course(double courseFee) {
        this.courseFee = courseFee;
    }

    
    Course(boolean isOnline) {
        this.isOnline = isOnline;
    }

    
    Course(String courseName, double courseFee) {
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

   
    Course(String department, boolean isOnline) {
        this.department = department;
        this.isOnline = isOnline;
    }

    
    Course(String description, int credits, double courseFee) {
        this.description = description;
        this.credits = credits;
        this.courseFee = courseFee;
    }
}