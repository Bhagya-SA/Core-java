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
	public String getEquipmentByIndex(int index){
		String equipment = null;
		if(index < equipments.length) equipment = equipments[index];
		return equipment;
		
	}
	
	public int getIndexByEquipment(String equipment){
		int i = 0;
		for(String name : equipments) {
			if(name == equipment) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updateEquipmentName(String existingEquipmentName , String updatedEquipmentName) {
		boolean isEquipmentNameUpdated = false;
		for(int index = 0; index < equipments.length; index++) {
			if(equipments[index] == existingEquipmentName) {
				equipments[index] = updatedEquipmentName;
				isEquipmentNameUpdated = true;
			}
		}
		return isEquipmentNameUpdated;
	}
	

}