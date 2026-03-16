class AttendanceExecutor {

	public static void main(String[] attend) {
	
		Attendance attendance1 = new Attendance(1);
		System.out.println("Attendance Id : " + attendance1.attendanceId);
		
		Attendance attendance2 = new Attendance(101 , 201);
		System.out.println("Student Id : " + attendance2.studentId);
		System.out.println("Course Id : " + attendance2.courseId);
		
		Attendance attendance3 = new Attendance("15/03/2026");
		System.out.println("Date : " + attendance3.date);
		
		Attendance attendance4 = new Attendance("Present", true);
		System.out.println("Status : " + attendance4.status);
		System.out.println("Is Present : " + attendance4.isPresent);
		
		Attendance attendance5 = new Attendance("09:00 AM" , "10:00 AM");
		System.out.println("Time In : " + attendance5.timeIn);
		System.out.println("Time Out : " + attendance5.timeOut);
		
		Attendance attendance6 = new Attendance("Professor", 40);
		System.out.println("Marked By : " + attendance6.markedBy);
		System.out.println("Total Classes : " + attendance6.totalClasses);
		
		Attendance attendance7 = new Attendance("Good", "Semester 1", 60);
		System.out.println("Remarks : " + attendance7.remarks);
		System.out.println("Semester : " + attendance7.semester);
		System.out.println("Total Classes : " + attendance7.totalClasses);
		
		Attendance attendance8 = new Attendance(50, true);
		System.out.println("Total Classes : " + attendance8.totalClasses);
		System.out.println("Is Present : " + attendance8.isPresent);
		
		Attendance attendance9 = new Attendance(45, true, 101);
		System.out.println("Attended Classes : " + attendance9.attendedClasses);
		System.out.println("Is Present : " + attendance9.isPresent);
		System.out.println("Student Id : " + attendance9.studentId);
		
		Attendance attendance10 = new Attendance(1 , "15/03/2026");
		System.out.println("Attendance Id : " + attendance10.attendanceId);
		System.out.println("Date : " + attendance10.date);
		
		Attendance attendance11 = new Attendance("Semester 2" , 70 , 1);
		System.out.println("Semester : " + attendance11.semester);
		System.out.println("Total Classes : " + attendance11.totalClasses);
		System.out.println("Attendance Id : " + attendance11.attendanceId);
		
		Attendance attendance12 = new Attendance(1 , 101 , 201);
		System.out.println("Attendance Id : " + attendance12.attendanceId);
		System.out.println("Student Id : " + attendance12.studentId);
		System.out.println("Course Id : " + attendance12.courseId);
	}
}