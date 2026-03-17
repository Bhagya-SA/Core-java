class Team {
    int teamId;
    String teamName;
    String location;
    int totalMatches;
    Player player;

     public Team(int teamId, String teamName, String location, int totalMatches, Player player) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.location = location;
        this.totalMatches = totalMatches;
        this.player = player;
    }

    public void displayTeamInfo() {
        System.out.println("Team Id : " + this.teamId);
        System.out.println("Team Name : " + this.teamName);
        System.out.println("Team Location : " + this.location);
        System.out.println("Total Matches : " + this.totalMatches);
        this.player.displayPlayerInfo();
        System.out.println("----------------------------------------");
    }
}


