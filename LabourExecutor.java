class LabourExecutor {

	public static void main(String[] workers) {
	
		Labour labour = new Labour();
		
		labour.name = "Ram";
		String name = labour.name;
		labour.salary = 90000;
		double salary = labour.salary;
		
		String[] idProofs = {"Aadhar card" , "Passbook" , "Passport"};
		labour.idProofs = idProofs;
		
		System.out.println("Name of the labour : " + name);
		System.out.println("Salary of the labour : " + salary);
		
		System.out.println("Labour's idProofs are as follows");
		for(String idProof : idProofs) {
			System.out.println(idProof);
		}
		
		
	
	}

}