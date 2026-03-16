class Hospital {

    int hospitalId;
    String name;
    String location;
    String phone;
    String email;
    int totalBeds;
    int availableBeds;
    int doctorsCount;
    int nursesCount;
    String emergencyContact;
    String directorName;
    boolean hasEmergency;

    Hospital(int hospitalId){
        this.hospitalId = hospitalId;
    }

    Hospital(String name){
        this.name = name;
    }

    Hospital(String location, String phone){
        this.location = location;
        this.phone = phone;
    }

    Hospital(String email, int totalBeds){
        this.email = email;
        this.totalBeds = totalBeds;
    }

    Hospital(int availableBeds, int doctorsCount){
        this.availableBeds = availableBeds;
        this.doctorsCount = doctorsCount;
    }

    Hospital(int nursesCount, String emergencyContact){
        this.nursesCount = nursesCount;
        this.emergencyContact = emergencyContact;
    }

    Hospital(String directorName , boolean hasEmergency){
        this.directorName = directorName;
		this.hasEmergency = hasEmergency;
    }

    Hospital(boolean hasEmergency){
        this.hasEmergency = hasEmergency;
    }

    Hospital(int hospitalId, String name , String location){
        this.hospitalId = hospitalId;
        this.name = name;
		this.location = location;
    }

    Hospital(String location, int totalBeds , int hospitalId){
        this.location = location;
        this.totalBeds = totalBeds;
		this.hospitalId = hospitalId;
    }

    Hospital(String phone, String email, boolean hasEmergency){
        this.phone = phone;
        this.email = email;
        this.hasEmergency = hasEmergency;
    }

    Hospital(String directorName, String emergencyContact, int doctorsCount){
        this.directorName = directorName;
        this.emergencyContact = emergencyContact;
        this.doctorsCount = doctorsCount;
    }
}