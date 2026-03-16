class Doctor {

    int doctorId;
    String firstName;
    String lastName;
    int age;
    String gender;
    String specialization;
    String phone;
    String email;
    String hospitalName;
    int experience;
    double consultationFee;
    boolean isAvailable;

    Doctor(int doctorId){
        this.doctorId = doctorId;
    }

    Doctor(String firstName){
        this.firstName = firstName;
    }

    Doctor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Doctor(int age, String gender){
        this.age = age;
        this.gender = gender;
    }

    Doctor(String specialization, boolean dummy){
        this.specialization = specialization;
    }

    Doctor(String phone, long emailNumber){
        this.phone = phone;
        this.experience = (int)emailNumber; // dummy mapping to avoid conflict
    }

    Doctor(String hospitalName, int experience){
        this.hospitalName = hospitalName;
        this.experience = experience;
    }

    Doctor(double consultationFee){
        this.consultationFee = consultationFee;
    }

    Doctor(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    Doctor(int doctorId, String firstName){
        this.doctorId = doctorId;
        this.firstName = firstName;
    }

    Doctor(String specialization, double consultationFee){
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    Doctor(String firstName, String lastName, String hospitalName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hospitalName = hospitalName;
    }
}