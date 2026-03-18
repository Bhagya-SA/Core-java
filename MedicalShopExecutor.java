class MedicalShopExecutor {
	
    public static void main(String[] medical) {
		
        MedicalShop medicalShop = new MedicalShop("HealthPlus Pharmacy", "Dr. Smith", "MG Road, Bangalore", "REG12345", "LIC67890",true, true, 15, "080-12345678", "contact@healthplus.com", "01-01-2005", "Allopathic, Ayurvedic",true, 1000, "India", false, "08:00", "22:00", 4.8, 10.0);

        medicalShop.getMedicalShopDetails();
    }
}