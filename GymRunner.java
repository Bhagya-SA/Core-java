class GymRunner {

    public static void main(String[] equipment) {
    
        Gym gym = new Gym();
        
        gym.addEquipment("Treadmill");
        gym.addEquipment("Dumbbells");
        gym.addEquipment("Barbell");
        gym.addEquipment("Bench Press");
        gym.addEquipment("Leg Press Machine");
        gym.addEquipment("Lat Pulldown Machine");
        gym.addEquipment("Cable Crossover Machine");
        gym.addEquipment("Rowing Machine");
        gym.addEquipment("Exercise Bike");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Squat Rack");
        gym.addEquipment("Kettlebells");
        gym.addEquipment("Ab Roller");
        gym.addEquipment("Pull-up Bar");
        gym.addEquipment("Battle Ropes");
        gym.addEquipment("Medicine Ball");
        
        gym.getEquipmentNames();
		System.out.println("-----------------------------------------------------");
		
		System.out.println(gym.getEquipmentByIndex(10));
		System.out.println("-----------------------------------------------------");
		
		System.out.println(gym.getIndexByEquipment("Squat Rack"));
		System.out.println("-----------------------------------------------------");
		
		gym.updateEquipmentName("Ab Roller" , "Roller");
		System.out.println("The updated equipments is as follows :");
		gym.getEquipmentNames();
		System.out.println("-----------------------------------------------------");
        
    }
}