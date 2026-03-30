class RCBRunner {

    public static void main(String[] playerName) {
    
        Team rcb = new Team();
        
        rcb.addPlayerName("Virat Kohli");
        rcb.addPlayerName("Faf du Plessis");
        rcb.addPlayerName("Glenn Maxwell");
        rcb.addPlayerName("Rajat Patidar");
        rcb.addPlayerName("Dinesh Karthik");
        rcb.addPlayerName("Mohammed Siraj");
        rcb.addPlayerName("Reece Topley");
        rcb.addPlayerName("Wanindu Hasaranga");
        rcb.addPlayerName("Harshal Patel");
        rcb.addPlayerName("Mahipal Lomror");
        rcb.addPlayerName("Shahbaz Ahmed");
        rcb.addPlayerName("Anuj Rawat");
        rcb.addPlayerName("Karn Sharma");
        rcb.addPlayerName("Josh Hazlewood");
        rcb.addPlayerName("Suyash Prabhudessai");
        
        rcb.getPlayerNames();
		System.out.println("--------------------------------------------------------");
		
		System.out.println(rcb.getNameByIndex(10));
		System.out.println("--------------------------------------------------------");
		System.out.println(rcb.getIndexByName("Virat Kohli"));
		System.out.println("--------------------------------------------------------");
		
		rcb.updatePlayerName("Dinesh Karthik" , "Karthik");
        System.out.println("The updated player names is as follows :");
		System.out.println("--------------------------------------------------------");
		
    }
}