class Education {

    int id;
    String institutionName;
    String type; // School, College, University
    String board; // CBSE, ICSE, State, etc.
    String principal;
    String city;
    String country;
    int establishedYear;
    int totalStudents;
    int totalStaff;
    int classrooms;
    int labs;
    boolean libraryAvailable;
    boolean sportsFacility;
    boolean hostelAvailable;
    double tuitionFee; // per year
    String coursesOffered;
    double rating;
    String accreditation;
    String status;

    
    public Education(int id, String institutionName, String type, String board, String principal,String city, String country, int establishedYear, int totalStudents, int totalStaff,int classrooms, int labs, boolean libraryAvailable, boolean sportsFacility,boolean hostelAvailable, double tuitionFee, String coursesOffered, double rating,String accreditation, String status) {

        this.id = id;
        this.institutionName = institutionName;
        this.type = type;
        this.board = board;
        this.principal = principal;
        this.city = city;
        this.country = country;
        this.establishedYear = establishedYear;
        this.totalStudents = totalStudents;
        this.totalStaff = totalStaff;
        this.classrooms = classrooms;
        this.labs = labs;
        this.libraryAvailable = libraryAvailable;
        this.sportsFacility = sportsFacility;
        this.hostelAvailable = hostelAvailable;
        this.tuitionFee = tuitionFee;
        this.coursesOffered = coursesOffered;
        this.rating = rating;
        this.accreditation = accreditation;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Type: " + type);
        System.out.println("Board: " + board);
        System.out.println("Principal: " + principal);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Staff: " + totalStaff);
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Labs: " + labs);
        System.out.println("Library Available: " + libraryAvailable);
        System.out.println("Sports Facility: " + sportsFacility);
        System.out.println("Hostel Available: " + hostelAvailable);
        System.out.println("Tuition Fee: " + tuitionFee);
        System.out.println("Courses Offered: " + coursesOffered);
        System.out.println("Rating: " + rating);
        System.out.println("Accreditation: " + accreditation);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}