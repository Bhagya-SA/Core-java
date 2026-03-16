class TourismAngadi {

    int tourismId;
    String touristName;
    String email;
    Package pkg;

    public void displayTourismInfo() {
        System.out.println("Tourism Id : " + this.tourismId);
        System.out.println("Tourist Name : " + this.touristName);
        System.out.println("Email : " + this.email);
        this.pkg.displayPackageInfo();
        System.out.println("--------------------------------------------------");
    }
}



