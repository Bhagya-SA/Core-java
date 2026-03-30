class UniverseRunner {

	public static void main(String[] world) {
	
		Universe universe = new Universe();
		
		universe.addGalaxy("Andromeda");
		universe.addGalaxy("Triangulum");
		universe.addGalaxy("Whirlpool");
		universe.addGalaxy("Sombrero");
		universe.addGalaxy("Pinwheel");
		universe.addGalaxy("Black Eye");
		universe.addGalaxy("Cartwheel");
		universe.addGalaxy("Cigar");
		universe.addGalaxy("Sunflower");
		universe.addGalaxy("Tadpole");
		universe.addGalaxy("Hoag's Object");
		universe.addGalaxy("Large Magellanic Cloud");
		universe.addGalaxy("Small Magellanic Cloud");
		universe.addGalaxy("Centaurus A");
		universe.addGalaxy("Messier 87");
		universe.addGalaxy("NGC 1300");
		universe.addGalaxy("MikyWay");
		
		universe.getGalaxies();
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println(universe.getGalaxyByIndex(10));
		System.out.println("-------------------------------------------------------");
		
		System.out.println(universe.getIndexByGalaxy("Tadpole"));
		System.out.println("-------------------------------------------------------");
		
		universe.updateGalaxyName("MilkyWay" , "MilkWay");
		System.out.println("The updated galaxies is as follows");
		universe.getGalaxies();
		System.out.println("-------------------------------------------------------");
		
		
		
		
		
	
	}

}