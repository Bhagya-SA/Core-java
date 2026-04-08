class CourseraRunner {

    public static void main(String[] course) {

        Coursera coursera = new Coursera();

        CourseRegistration courseOne = new CourseRegistration();
        courseOne.setCourseId(1);
        courseOne.setTitle("Java Programming");
        courseOne.setDuration(40);
        courseOne.setInstructorName("John");
        courseOne.setStudents(500);
        courseOne.setLevel("Beginner");
        courseOne.setRating(4);

        boolean isCourseAdded = coursera.addCourse(courseOne);
        System.out.println(isCourseAdded);

        CourseRegistration courseTwo = new CourseRegistration();
        courseTwo.setCourseId(2);
        courseTwo.setTitle("Python Programming");
        courseTwo.setDuration(35);
        courseTwo.setInstructorName("David");
        courseTwo.setStudents(600);
        courseTwo.setLevel("Beginner");
        courseTwo.setRating(5);

        isCourseAdded = coursera.addCourse(courseTwo);
        System.out.println(isCourseAdded);

        CourseRegistration courseThree = new CourseRegistration();
        courseThree.setCourseId(3);
        courseThree.setTitle("Web Development");
        courseThree.setDuration(45);
        courseThree.setInstructorName("Smith");
        courseThree.setStudents(450);
        courseThree.setLevel("Intermediate");
        courseThree.setRating(4);

        isCourseAdded = coursera.addCourse(courseThree);
        System.out.println(isCourseAdded);

        CourseRegistration courseFour = new CourseRegistration();
        courseFour.setCourseId(4);
        courseFour.setTitle("Data Science");
        courseFour.setDuration(50);
        courseFour.setInstructorName("Alice");
        courseFour.setStudents(400);
        courseFour.setLevel("Advanced");
        courseFour.setRating(5);

        isCourseAdded = coursera.addCourse(courseFour);
        System.out.println(isCourseAdded);

        CourseRegistration courseFive = new CourseRegistration();
        courseFive.setCourseId(5);
        courseFive.setTitle("Machine Learning");
        courseFive.setDuration(60);
        courseFive.setInstructorName("Bob");
        courseFive.setStudents(350);
        courseFive.setLevel("Advanced");
        courseFive.setRating(5);

        isCourseAdded = coursera.addCourse(courseFive);
        System.out.println(isCourseAdded);

        coursera.getCourseDetails();
    }
}