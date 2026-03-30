class PetAccessoriesRunner {

    public static void main(String[] pet) {
        
        PetAccessories petAccessories = new PetAccessories();
        
        petAccessories.addpetAccessoriesName("Dog Collar");
        petAccessories.addpetAccessoriesName("Leash");
        petAccessories.addpetAccessoriesName("Pet Bed");
        petAccessories.addpetAccessoriesName("Food Bowl");
        petAccessories.addpetAccessoriesName("Water Dispenser");
        petAccessories.addpetAccessoriesName("Cat Litter Box");
        petAccessories.addpetAccessoriesName("Scratching Post");
        petAccessories.addpetAccessoriesName("Pet Carrier");
        petAccessories.addpetAccessoriesName("Chew Toys");
        petAccessories.addpetAccessoriesName("Pet Shampoo");
        petAccessories.addpetAccessoriesName("Grooming Brush");
        petAccessories.addpetAccessoriesName("Nail Clipper");
        petAccessories.addpetAccessoriesName("Pet Clothes");
        petAccessories.addpetAccessoriesName("Training Pads");
        petAccessories.addpetAccessoriesName("Aquarium Tank");
        petAccessories.addpetAccessoriesName("Bird Cage");
        petAccessories.addpetAccessoriesName("Hamster Wheel");
        petAccessories.addpetAccessoriesName("Pet Blanket");
        petAccessories.addpetAccessoriesName("Tick Remover");
        petAccessories.addpetAccessoriesName("Pet Backpack");
        
        petAccessories.getpetAccessoriesNames();
		System.out.println("------------------------------------------------------");
		
		System.out.println(petAccessories.getAccessoryByIndex(10));
		System.out.println("------------------------------------------------------");
		
		System.out.println(petAccessories.getIndexByAccessory("Pet Shampoo"));
		System.out.println("------------------------------------------------------");
		
		
		petAccessories.updatePetAccessory("Grooming Brush" , "Groom Brush");
		System.out.println("The updated pet accessories is as follows : ");
		petAccessories.getpetAccessoriesNames();
		System.out.println("------------------------------------------------------");
		
		
		
        
    }
}