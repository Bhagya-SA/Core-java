class WonderlaRunner {

    public static void main(String[] games) {
    
        Wonderla game = new Wonderla();
        
        game.addGame("Recoil Roller Coaster");
        game.addGame("Maverick");
        game.addGame("Flash Tower Drop");
        game.addGame("Space Jam");
        game.addGame("Wonder Splash");
        game.addGame("Equinox 360");
        game.addGame("Turbo Ride");
        game.addGame("Wind Mill Coaster");
        game.addGame("Sky Wheel");
        game.addGame("Lazy River");
        game.addGame("Rain Disco");
        game.addGame("Harakiri");
        game.addGame("Pirate Ship");
        game.addGame("Drop Zone");
        game.addGame("Twister");
        game.addGame("Wave Pool");
        game.addGame("Bumper Cars");
        game.addGame("Mini Venice Ride");
        game.addGame("Adventure Train");
        game.addGame("Water Tunnel Slide");
        game.addGame("Boomerang Coaster");
        
        game.getGames();
		System.out.println("-----------------------------------------------------");
		
		System.out.println(game.getGameByIndex(1));
		System.out.println("-----------------------------------------------------");
		
		System.out.println(game.getIndexByGame("Boomerang Coaster"));
		System.out.println("-----------------------------------------------------");
		
		game.updateGameName("Sky Wheel" , "Wheel Sky");
		game.getGames();
		System.out.println("-----------------------------------------------------");
        
    }
}