class UdemyRunner {

    public static void main(String[] course) {

        Udemy udemy = new Udemy();

        CourseRegistration courseOne = new CourseRegistration();
        courseOne.setCourseId(1);
        courseOne.setTitle("Java Programming");
        courseOne.setPrice(2000);
        courseOne.setInstructor("John");
        courseOne.setStudents(500);
        courseOne.setLevel("Beginner");
        courseOne.setRating(4);

        boolean isCourseAdded = udemy.addCourse(courseOne);
        System.out.println(isCourseAdded);

        CourseRegistration courseTwo = new CourseRegistration();
        courseTwo.setCourseId(2);
        courseTwo.setTitle("Python Programming");
        courseTwo.setPrice(1800);
        courseTwo.setInstructor("David");
        courseTwo.setStudents(600);
        courseTwo.setLevel("Beginner");
        courseTwo.setRating(5);

        isCourseAdded = udemy.addCourse(courseTwo);
        System.out.println(isCourseAdded);

        CourseRegistration courseThree = new CourseRegistration();
        courseThree.setCourseId(3);
        courseThree.setTitle("Web Development");
        courseThree.setPrice(2500);
        courseThree.setInstructor("Smith");
        courseThree.setStudents(450);
        courseThree.setLevel("Intermediate");
        courseThree.setRating(4);

        isCourseAdded = udemy.addCourse(courseThree);
        System.out.println(isCourseAdded);

        CourseRegistration courseFour = new CourseRegistration();
        courseFour.setCourseId(4);
        courseFour.setTitle("Data Science");
        courseFour.setPrice(3000);
        courseFour.setInstructor("Alice");
        courseFour.setStudents(400);
        courseFour.setLevel("Advanced");
        courseFour.setRating(5);

        isCourseAdded = udemy.addCourse(courseFour);
        System.out.println(isCourseAdded);

        CourseRegistration courseFive = new CourseRegistration();
        courseFive.setCourseId(5);
        courseFive.setTitle("Machine Learning");
        courseFive.setPrice(3500);
        courseFive.setInstructor("Bob");
        courseFive.setStudents(350);
        courseFive.setLevel("Advanced");
        courseFive.setRating(5);

        isCourseAdded = udemy.addCourse(courseFive);
        System.out.println(isCourseAdded);

        udemy.getCourseDetails();
    }
}