class Player {
    int playerId;
    String playerName;
    String playerRole;

    public Player(int playerId, String playerName, String playerRole) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerRole = playerRole;
    }

    public void displayPlayerInfo() {
        System.out.println("Player Id : " + this.playerId);
        System.out.println("Player Name : " + this.playerName);
        System.out.println("Player Role : " + this.playerRole);
    }
}
