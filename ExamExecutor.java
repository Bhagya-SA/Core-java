class ExamExecutor {

    public static void main(String[] exams) {

        Exam exam1 = new Exam(201);
        System.out.println("Exam Id : " + exam1.examId);

        Exam exam2 = new Exam("Midterm Exam", 202);
        System.out.println("Exam Name : " + exam2.examName);
        System.out.println("Exam Id : " + exam2.examId);

        Exam exam3 = new Exam(301, "2026-03-25");
        System.out.println("Course Id : " + exam3.courseId);
        System.out.println("Exam Date : " + exam3.examDate);

        Exam exam4 = new Exam("09:00 AM", "Written");
        System.out.println("Exam Time : " + exam4.examTime);
        System.out.println("Exam Type : " + exam4.examType);

        Exam exam5 = new Exam(100, 40);
        System.out.println("Total Marks : " + exam5.totalMarks);
        System.out.println("Passing Marks : " + exam5.passingMarks);

        Exam exam6 = new Exam("Dr. Smith", true);
        System.out.println("Examiner Name : " + exam6.examinerName);
        System.out.println("Is Online : " + exam6.isOnline);

        Exam exam7 = new Exam("Room 101", 120.0);
        System.out.println("Exam Room : " + exam7.examRoom);
        System.out.println("Duration (minutes) : " + exam7.durationMinutes);

        Exam exam8 = new Exam(false);
        System.out.println("Is Online : " + exam8.isOnline);

        Exam exam9 = new Exam(203, "Final Exam", true);
        System.out.println("Exam Id : " + exam9.examId);
        System.out.println("Exam Name : " + exam9.examName);
        System.out.println("Is Online : " + exam9.isOnline);

        Exam exam10 = new Exam("Practical", 50, true);
        System.out.println("Exam Type : " + exam10.examType);
        System.out.println("Total Marks : " + exam10.totalMarks);
        System.out.println("Is Online : " + exam10.isOnline);

        Exam exam11 = new Exam("Instructions for Exam");
        System.out.println("Instructions : " + exam11.instructions);

        Exam exam12 = new Exam(204, "Quiz", 302);
        System.out.println("Exam Id : " + exam12.examId);
        System.out.println("Exam Name : " + exam12.examName);
        System.out.println("Course Id : " + exam12.courseId);
    }
}