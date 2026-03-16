class Diabetes {

    int id;
    String patientName;
    int age;
    String gender;
    double weight;
    double height;
    double bloodSugarFasting;
    double bloodSugarPP;
    double hba1c;
    boolean insulinRequired;
    String diabetesType;
    String medication;
    String dietPlan;
    String exercisePlan;
    String doctorName;
    String hospital;
    String city;
    String country;
    String status;
    double rating; 

    
    public Diabetes(int id, String patientName, int age, String gender, double weight,double height, double bloodSugarFasting, double bloodSugarPP, double hba1c,boolean insulinRequired, String diabetesType, String medication, String dietPlan,String exercisePlan, String doctorName, String hospital, String city, String country,String status, double rating) {

        this.id = id;
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.bloodSugarFasting = bloodSugarFasting;
        this.bloodSugarPP = bloodSugarPP;
        this.hba1c = hba1c;
        this.insulinRequired = insulinRequired;
        this.diabetesType = diabetesType;
        this.medication = medication;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.doctorName = doctorName;
        this.hospital = hospital;
        this.city = city;
        this.country = country;
        this.status = status;
        this.rating = rating;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Blood Sugar Fasting: " + bloodSugarFasting);
        System.out.println("Blood Sugar PP: " + bloodSugarPP);
        System.out.println("HbA1c: " + hba1c);
        System.out.println("Insulin Required: " + insulinRequired);
        System.out.println("Diabetes Type: " + diabetesType);
        System.out.println("Medication: " + medication);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Exercise Plan: " + exercisePlan);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Hospital: " + hospital);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Status: " + status);
        System.out.println("Rating: " + rating);
        System.out.println("-----------------------------------");
    }
}