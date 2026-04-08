class LinkedlnRunner {

    public static void main(String[] args) {

        Linkedln linkedln = new Linkedln();

        JobPosting jobOne = new JobPosting();
        jobOne.setJobId(1);
        jobOne.setJobTitle("Software Engineer");
        jobOne.setSalary(1200000);
        jobOne.setCompany("TCS");
        jobOne.setExperience(2);
        jobOne.setLocation("Mumbai");
        jobOne.setApplicants(150);

        boolean isJobAdded = linkedln.addJob(jobOne);
        System.out.println(isJobAdded);

        JobPosting jobTwo = new JobPosting();
        jobTwo.setJobId(2);
        jobTwo.setJobTitle("Data Analyst");
        jobTwo.setSalary(900000);
        jobTwo.setCompany("Infosys");
        jobTwo.setExperience(1);
        jobTwo.setLocation("Bangalore");
        jobTwo.setApplicants(120);

        isJobAdded = linkedln.addJob(jobTwo);
        System.out.println(isJobAdded);

        JobPosting jobThree = new JobPosting();
        jobThree.setJobId(3);
        jobThree.setJobTitle("Project Manager");
        jobThree.setSalary(1800000);
        jobThree.setCompany("Wipro");
        jobThree.setExperience(5);
        jobThree.setLocation("Chennai");
        jobThree.setApplicants(80);

        isJobAdded = linkedln.addJob(jobThree);
        System.out.println(isJobAdded);

        JobPosting jobFour = new JobPosting();
        jobFour.setJobId(4);
        jobFour.setJobTitle("UI/UX Designer");
        jobFour.setSalary(1000000);
        jobFour.setCompany("Capgemini");
        jobFour.setExperience(3);
        jobFour.setLocation("Pune");
        jobFour.setApplicants(60);

        isJobAdded = linkedln.addJob(jobFour);
        System.out.println(isJobAdded);

        JobPosting jobFive = new JobPosting();
        jobFive.setJobId(5);
        jobFive.setJobTitle("Cloud Engineer");
        jobFive.setSalary(1500000);
        jobFive.setCompany("Accenture");
        jobFive.setExperience(4);
        jobFive.setLocation("Hyderabad");
        jobFive.setApplicants(90);

        isJobAdded = linkedln.addJob(jobFive);
        System.out.println(isJobAdded);

        linkedln.getJobDetails();
    }
}