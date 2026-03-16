class Organ {

    int id;
    String name;
    String type;
    String location;
    double weight; 
    double length; 
    String function;
    String tissueType;
    String bloodSupply;
    boolean vital;
    String associatedSystem;
    String healthStatus;
    String diseaseRisk;
    String donor;
    String recipient;
    String transplantStatus;
    String manufacturer; 
    String country;
    double rating; 
    String notes;

    
    public Organ(int id, String name, String type, String location, double weight, double length,String function, String tissueType, String bloodSupply, boolean vital,String associatedSystem, String healthStatus, String diseaseRisk, String donor,String recipient, String transplantStatus, String manufacturer, String country,double rating, String notes) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.weight = weight;
        this.length = length;
        this.function = function;
        this.tissueType = tissueType;
        this.bloodSupply = bloodSupply;
        this.vital = vital;
        this.associatedSystem = associatedSystem;
        this.healthStatus = healthStatus;
        this.diseaseRisk = diseaseRisk;
        this.donor = donor;
        this.recipient = recipient;
        this.transplantStatus = transplantStatus;
        this.manufacturer = manufacturer;
        this.country = country;
        this.rating = rating;
        this.notes = notes;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Length: " + length + "cm");
        System.out.println("Function: " + function);
        System.out.println("Tissue Type: " + tissueType);
        System.out.println("Blood Supply: " + bloodSupply);
        System.out.println("Vital: " + vital);
        System.out.println("Associated System: " + associatedSystem);
        System.out.println("Health Status: " + healthStatus);
        System.out.println("Disease Risk: " + diseaseRisk);
        System.out.println("Donor: " + donor);
        System.out.println("Recipient: " + recipient);
        System.out.println("Transplant Status: " + transplantStatus);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Rating: " + rating);
        System.out.println("Notes: " + notes);
        System.out.println("-----------------------------------");
    }
}