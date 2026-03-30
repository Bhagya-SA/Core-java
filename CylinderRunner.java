class CylinderRunner {

	public static void main(String[] cylinder) {
	
		Cylinder cy = new Cylinder();
		
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		cy.addCylinderName();
		
		cy.getCylinderNames();
		System.out.println("---------------------------------------------");
		
		System.out.println(cy.getNameByIndex(8));
		System.out.println("---------------------------------------------");
		
		System.out.println(cy.getIndexByName(""));
		System.out.println("---------------------------------------------");
		
		cy.updateCylinderName("" , "");
		System.out.println("The updated cylinder names is as follows :");
		System.out.println("---------------------------------------------");
		
		
	
	}

}