class Coursera {

    CourseRegistration courseRegistrations[] = new CourseRegistration[5];
    int index;

    public boolean addCourse(CourseRegistration courseRegistration) {

        boolean isCourseAdded = false;

        boolean isCourseIdValid = false;
        boolean isTitleValid = false;
        boolean isDurationValid = false;
        boolean isInstructorValid = false;
        boolean isStudentsValid = false;
        boolean isLevelValid = false;
        boolean isRatingValid = false;

        int courseId = courseRegistration.getCourseId();
        if (courseId > 0) {
            isCourseIdValid = true;
        }

        String title = courseRegistration.getTitle();
        if (title != null && !title.isEmpty()) {
            isTitleValid = true;
        }

        int duration = courseRegistration.getDuration();
        if (duration > 0) {
            isDurationValid = true;
        }

        String instructorName = courseRegistration.getInstructorName();
        if (instructorName != null && !instructorName.isEmpty()) {
            isInstructorValid = true;
        }

        int students = courseRegistration.getStudents();
        if (students >= 0) {
            isStudentsValid = true;
        }

        String level = courseRegistration.getLevel();
        if (level != null && !level.isEmpty()) {
            isLevelValid = true;
        }

        int rating = courseRegistration.getRating();
        if (rating >= 0) {
            isRatingValid = true;
        }

        if (isCourseIdValid && isTitleValid && isDurationValid &&
            isInstructorValid && isStudentsValid &&
            isLevelValid && isRatingValid) {

            isCourseAdded = true;
            courseRegistrations[index++] = courseRegistration;
        }

        return isCourseAdded;
    }

    public void getCourseDetails() {

        System.out.println("The course details are as follows :");

        for (CourseRegistration courseRegistration : courseRegistrations) {

            if (courseRegistration != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Course Id is : " + courseRegistration.getCourseId());
                System.out.println("Title is : " + courseRegistration.getTitle());
                System.out.println("Duration is : " + courseRegistration.getDuration());
                System.out.println("Instructor Name is : " + courseRegistration.getInstructorName());
                System.out.println("Students are : " + courseRegistration.getStudents());
                System.out.println("Level is : " + courseRegistration.getLevel());
                System.out.println("Rating is : " + courseRegistration.getRating());
                System.out.println("--------------------------------------------");
            }
        }
    }
}