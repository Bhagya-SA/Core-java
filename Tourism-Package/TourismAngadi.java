class TourismAngadi {

    int tourismId;
    String touristName;
    String email;
    Package pkg;

    public TourismAngadi(int tourismId, String touristName, String email, Package pkg) {
        this.tourismId = tourismId;
        this.touristName = touristName;
        this.email = email;
        this.pkg = pkg;
    }

    public void displayTourismInfo() {
        System.out.println("Tourism Id : " + this.tourismId);
        System.out.println("Tourist Name : " + this.touristName);
        System.out.println("Email : " + this.email);
        this.pkg.displayPackageInfo();
        System.out.println("--------------------------------------------------");
    }
}



