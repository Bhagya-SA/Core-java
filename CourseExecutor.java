class CourseExecutor {

	public static void main(String[] courses) {
	
		Course course1 = new Course(101);
		System.out.println("Course Id : " + course1.courseId);
		
		Course course2 = new Course("Java Programming");
		System.out.println("Course Name : " + course2.courseName);
		
		
		Course course3 = new Course("Data Structures" , "Computer Science");
		System.out.println("Course Name : " + course3.courseName);
		System.out.println("Department : " + course3.department);
		
		
		Course course4 = new Course(102 , 4);
		System.out.println("Course Id : " + course4.courseId);
		System.out.println("Credits : " + course4.credits);
		
		
		Course course5 = new Course("Dr. Smith" , "Mon-Wed 10AM" , 101);
		System.out.println("Instructor Name : " + course5.instructorName);
		System.out.println("Schedule : " + course5.schedule);
		System.out.println("Course Id : " + course5.courseId);
		
		
		Course course6 = new Course("Room A101" , 50);
		System.out.println("Classroom : " + course6.classroom);
		System.out.println("Maximum Students : " + course6.maxStudents);
		
		
		Course course7 = new Course(120L);
		System.out.println("Enrolled Students : " + course7.enrolledStudents);
		
		
		Course course8 = new Course(1500.50);
		System.out.println("Course Fee : " + course8.courseFee);
		
		
		Course course9 = new Course(true);
		System.out.println("Is Online : " + course9.isOnline);
		
		
		Course course10 = new Course("Python Programming" , 2000.00);
		System.out.println("Course Name : " + course10.courseName);
		System.out.println("Course Fee : " + course10.courseFee);
		
		
		Course course11 = new Course("Information Technology" , false);
		System.out.println("Department : " + course11.department);
		System.out.println("Is Online : " + course11.isOnline);
		
		
		Course course12 = new Course("Advanced Java Course" , 5 , 3500.00);
		System.out.println("Description : " + course12.description);
		System.out.println("Credits : " + course12.credits);
		System.out.println("Course Fee : " + course12.courseFee);
		
	}
}