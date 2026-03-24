class Gym {

	private String equipments[] = new String[16];
	int index;
	
	public boolean addEquipment(String equipment) {
		
		boolean isEquipmentAdded = false;
		
		if(equipment != null && !equipment.isEmpty()) {
			equipments[index] = equipment;
			index++;
			isEquipmentAdded = true;
		
		}
		else {
			System.out.println("Please add valid equipment name");
		}
		return isEquipmentAdded;
	}
	
	public void getEquipmentNames() {
		for(String equipment : equipments) {
			System.out.println(equipment);
		}
		
	}

}