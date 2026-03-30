class PhonePayRunner {

    public static void main(String[] names) {
    
        PhonePay phonepe = new PhonePay();
        
        phonepe.addInsuranceName("Health Insurance");
        phonepe.addInsuranceName("Term Life Insurance");
        phonepe.addInsuranceName("Car Insurance");
        phonepe.addInsuranceName("Bike Insurance");
        phonepe.addInsuranceName("Travel Insurance");
        phonepe.addInsuranceName("Accident Insurance");
        phonepe.addInsuranceName("Family Health Plan");
        phonepe.addInsuranceName("Critical Illness Cover");
        phonepe.addInsuranceName("Home Insurance");
        phonepe.addInsuranceName("Senior Citizen Health Plan");
        phonepe.addInsuranceName("Dental Insurance");
        phonepe.addInsuranceName("Personal Accident Cover");
        phonepe.addInsuranceName("Mobile Insurance");
        phonepe.addInsuranceName("Pet Insurance");
        phonepe.addInsuranceName("Child Education Plan");
        phonepe.addInsuranceName("Cancer Insurance");
        phonepe.addInsuranceName("Group Health Insurance");
        phonepe.addInsuranceName("Two-Wheeler Insurance");
        phonepe.addInsuranceName("Fire Insurance");
        phonepe.addInsuranceName("Disability Insurance");
        phonepe.addInsuranceName("Maternity Cover");
        phonepe.addInsuranceName("Hospital Cash Plan");
        phonepe.addInsuranceName("Unit Linked Insurance Plan (ULIP)");
        phonepe.addInsuranceName("Income Protection Plan");
        phonepe.addInsuranceName("Surgical Cover");
        phonepe.addInsuranceName("Top-up Health Insurance");
        phonepe.addInsuranceName("International Travel Insurance");
        
        phonepe.getInsuranceNames();
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(phonepe.getNamebyIndex(11));
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(phonepe.getIndexByName("Car Insurance"));
		System.out.println("-----------------------------------------------------------------");
		
		phonepe.updateinsuranceName("Hospital Cash Plan" , "Hospital Plan");
		System.out.println("The updated insurance names is as follows :");
		phonepe.getInsuranceNames();
		System.out.println("-----------------------------------------------------------------");
		
        
    }
}