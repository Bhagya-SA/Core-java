class Linkedln {

    JobPosting jobPostings[] = new JobPosting[5];
    int index;

    public boolean addJob(JobPosting job) {

        boolean isJobAdded = false;

        boolean isJobIdValid = false;
        boolean isJobTitleValid = false;
        boolean isSalaryValid = false;
        boolean isCompanyValid = false;
        boolean isExperienceValid = false;
        boolean isLocationValid = false;
        boolean isApplicantsValid = false;

        int jobId = job.getJobId();
        if (jobId > 0) {
            isJobIdValid = true;
        }

        String jobTitle = job.getJobTitle();
        if (jobTitle != null && !jobTitle.isEmpty()) {
            isJobTitleValid = true;
        }

        double salary = job.getSalary();
        if (salary >= 0) {
            isSalaryValid = true;
        }

        String company = job.getCompany();
        if (company != null && !company.isEmpty()) {
            isCompanyValid = true;
        }

        int experience = job.getExperience();
        if (experience >= 0) {
            isExperienceValid = true;
        }

        String location = job.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

        int applicants = job.getApplicants();
        if (applicants >= 0) {
            isApplicantsValid = true;
        }

        if (isJobIdValid && isJobTitleValid && isSalaryValid &&
            isCompanyValid && isExperienceValid && isLocationValid &&
            isApplicantsValid) {

            isJobAdded = true;
            jobPostings[index++] = job;
        }

        return isJobAdded;
    }

    public void getJobDetails() {

        System.out.println("The job posting details are as follows :");

        for (JobPosting job : jobPostings) {

            if (job != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Job Id : " + job.getJobId());
                System.out.println("Job Title : " + job.getJobTitle());
                System.out.println("Salary : " + job.getSalary());
                System.out.println("Company : " + job.getCompany());
                System.out.println("Experience Required : " + job.getExperience() + " years");
                System.out.println("Location : " + job.getLocation());
                System.out.println("Number of Applicants : " + job.getApplicants());
                System.out.println("--------------------------------------------");
            }
        }
    }
}