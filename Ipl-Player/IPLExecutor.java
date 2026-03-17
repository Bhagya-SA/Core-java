class IPLExecutor {
    public static void main(String[] ipl) {
        
        /*Team team1 = new Team();
        team1.teamId = 1;
        team1.teamName = "Mumbai Indians";
        team1.location = "Mumbai";
        team1.totalMatches = 200;
        Player player1 = new Player();
        player1.playerId = 101;
        player1.playerName = "Rohit Sharma";
        player1.playerRole = "Batsman";
        team1.player = player1;
        team1.displayTeamInfo();

        
        Team team2 = new Team();
        team2.teamId = 2;
        team2.teamName = "Chennai Super Kings";
        team2.location = "Chennai";
        team2.totalMatches = 210;
        Player player2 = new Player();
        player2.playerId = 102;
        player2.playerName = "MS Dhoni";
        player2.playerRole = "Wicketkeeper-Batsman";
        team2.player = player2;
        team2.displayTeamInfo();

        
        Team team3 = new Team();
        team3.teamId = 3;
        team3.teamName = "Royal Challengers Bangalore";
        team3.location = "Bangalore";
        team3.totalMatches = 190;
        Player player3 = new Player();
        player3.playerId = 103;
        player3.playerName = "Virat Kohli";
        player3.playerRole = "Batsman";
        team3.player = player3;
        team3.displayTeamInfo();

        
        Team team4 = new Team();
        team4.teamId = 4;
        team4.teamName = "Delhi Capitals";
        team4.location = "Delhi";
        team4.totalMatches = 180;
        Player player4 = new Player();
        player4.playerId = 104;
        player4.playerName = "Rishabh Pant";
        player4.playerRole = "Wicketkeeper-Batsman";
        team4.player = player4;
        team4.displayTeamInfo();

        
        Team team5 = new Team();
        team5.teamId = 5;
        team5.teamName = "Kolkata Knight Riders";
        team5.location = "Kolkata";
        team5.totalMatches = 170;
        Player player5 = new Player();
        player5.playerId = 105;
        player5.playerName = "Shreyas Iyer";
        player5.playerRole = "Batsman";
        team5.player = player5;
        team5.displayTeamInfo();

        
        Team team6 = new Team();
        team6.teamId = 6;
        team6.teamName = "Sunrisers Hyderabad";
        team6.location = "Hyderabad";
        team6.totalMatches = 160;
        Player player6 = new Player();
        player6.playerId = 106;
        player6.playerName = "David Warner";
        player6.playerRole = "Batsman";
        team6.player = player6;
        team6.displayTeamInfo();

        
        Team team7 = new Team();
        team7.teamId = 7;
        team7.teamName = "Rajasthan Royals";
        team7.location = "Jaipur";
        team7.totalMatches = 150;
        Player player7 = new Player();
        player7.playerId = 107;
        player7.playerName = "Sanju Samson";
        player7.playerRole = "Wicketkeeper-Batsman";
        team7.player = player7;
        team7.displayTeamInfo();

        
        Team team8 = new Team();
        team8.teamId = 8;
        team8.teamName = "Punjab Kings";
        team8.location = "Mohali";
        team8.totalMatches = 140;
        Player player8 = new Player();
        player8.playerId = 108;
        player8.playerName = "Shikhar Dhawan";
        player8.playerRole = "Batsman";
        team8.player = player8;
        team8.displayTeamInfo();

        
        Team team9 = new Team();
        team9.teamId = 9;
        team9.teamName = "Gujarat Titans";
        team9.location = "Ahmedabad";
        team9.totalMatches = 20;
        Player player9 = new Player();
        player9.playerId = 109;
        player9.playerName = "Hardik Pandya";
        player9.playerRole = "All-Rounder";
        team9.player = player9;
        team9.displayTeamInfo();

        
        Team team10 = new Team();
        team10.teamId = 10;
        team10.teamName = "Lucknow Super Giants";
        team10.location = "Lucknow";
        team10.totalMatches = 10;
        Player player10 = new Player();
        player10.playerId = 110;
        player10.playerName = "KL Rahul";
        player10.playerRole = "Batsman";
        team10.player = player10;
        team10.displayTeamInfo();

        
        Team team11 = new Team();
        team11.teamId = 11;
        team11.teamName = "Mumbai Indians-2";
        team11.location = "Mumbai";
        team11.totalMatches = 200;
        Player player11 = new Player();
        player11.playerId = 111;
        player11.playerName = "Suryakumar Yadav";
        player11.playerRole = "Batsman";
        team11.player = player11;
        team11.displayTeamInfo();

        
        Team team12 = new Team();
        team12.teamId = 12;
        team12.teamName = "Chennai Super Kings-2";
        team12.location = "Chennai";
        team12.totalMatches = 210;
        Player player12 = new Player();
        player12.playerId = 112;
        player12.playerName = "Ravindra Jadeja";
        player12.playerRole = "All-Rounder";
        team12.player = player12;
        team12.displayTeamInfo();

        
        Team team13 = new Team();
        team13.teamId = 13;
        team13.teamName = "RCB-2";
        team13.location = "Bangalore";
        team13.totalMatches = 190;
        Player player13 = new Player();
        player13.playerId = 113;
        player13.playerName = "Faf du Plessis";
        player13.playerRole = "Batsman";
        team13.player = player13;
        team13.displayTeamInfo();

        
        Team team14 = new Team();
        team14.teamId = 14;
        team14.teamName = "Delhi Capitals-2";
        team14.location = "Delhi";
        team14.totalMatches = 180;
        Player player14 = new Player();
        player14.playerId = 114;
        player14.playerName = "Prithvi Shaw";
        player14.playerRole = "Batsman";
        team14.player = player14;
        team14.displayTeamInfo();

        
        Team team15 = new Team();
        team15.teamId = 15;
        team15.teamName = "KKR-2";
        team15.location = "Kolkata";
        team15.totalMatches = 170;
        Player player15 = new Player();
        player15.playerId = 115;
        player15.playerName = "Andre Russell";
        player15.playerRole = "All-Rounder";
        team15.player = player15;
        team15.displayTeamInfo();

        
        Team team16 = new Team();
        team16.teamId = 16;
        team16.teamName = "Sunrisers-2";
        team16.location = "Hyderabad";
        team16.totalMatches = 160;
        Player player16 = new Player();
        player16.playerId = 116;
        player16.playerName = "Bhuvneshwar Kumar";
        player16.playerRole = "Bowler";
        team16.player = player16;
        team16.displayTeamInfo();

        
        Team team17 = new Team();
        team17.teamId = 17;
        team17.teamName = "Rajasthan Royals-2";
        team17.location = "Jaipur";
        team17.totalMatches = 150;
        Player player17 = new Player();
        player17.playerId = 117;
        player17.playerName = "Jos Buttler";
        player17.playerRole = "Batsman";
        team17.player = player17;
        team17.displayTeamInfo();

       
        Team team18 = new Team();
        team18.teamId = 18;
        team18.teamName = "Punjab Kings-2";
        team18.location = "Mohali";
        team18.totalMatches = 140;
        Player player18 = new Player();
        player18.playerId = 118;
        player18.playerName = "Shreyas Gopal";
        player18.playerRole = "Bowler";
        team18.player = player18;
        team18.displayTeamInfo();

        Team team19 = new Team();
        team19.teamId = 19;
        team19.teamName = "Gujarat Titans-2";
        team19.location = "Ahmedabad";
        team19.totalMatches = 20;
        Player player19 = new Player();
        player19.playerId = 119;
        player19.playerName = "Rashid Khan";
        player19.playerRole = "Bowler";
        team19.player = player19;
        team19.displayTeamInfo();

        
        Team team20 = new Team();
        team20.teamId = 20;
        team20.teamName = "Lucknow Super Giants-2";
        team20.location = "Lucknow";
        team20.totalMatches = 10;
        Player player20 = new Player();
        player20.playerId = 120;
        player20.playerName = "Kane Williamson";
        player20.playerRole = "Batsman";
        team20.player = player20;
        team20.displayTeamInfo(); */

         Player p1 = new Player(101, "Rohit Sharma", "Batsman");
        Team t1 = new Team(1, "Mumbai Indians", "Mumbai", 200, p1);
        t1.displayTeamInfo();

        Player p2 = new Player(102, "MS Dhoni", "Wicketkeeper-Batsman");
        Team t2 = new Team(2, "Chennai Super Kings", "Chennai", 210, p2);
        t2.displayTeamInfo();

        Player p3 = new Player(103, "Virat Kohli", "Batsman");
        Team t3 = new Team(3, "Royal Challengers Bangalore", "Bangalore", 190, p3);
        t3.displayTeamInfo();

        Player p4 = new Player(104, "Rishabh Pant", "Wicketkeeper-Batsman");
        Team t4 = new Team(4, "Delhi Capitals", "Delhi", 180, p4);
        t4.displayTeamInfo();

        Player p5 = new Player(105, "Shreyas Iyer", "Batsman");
        Team t5 = new Team(5, "Kolkata Knight Riders", "Kolkata", 170, p5);
        t5.displayTeamInfo();

        Player p6 = new Player(106, "David Warner", "Batsman");
        Team t6 = new Team(6, "Sunrisers Hyderabad", "Hyderabad", 160, p6);
        t6.displayTeamInfo();

        Player p7 = new Player(107, "Sanju Samson", "Wicketkeeper-Batsman");
        Team t7 = new Team(7, "Rajasthan Royals", "Jaipur", 150, p7);
        t7.displayTeamInfo();

        Player p8 = new Player(108, "Shikhar Dhawan", "Batsman");
        Team t8 = new Team(8, "Punjab Kings", "Mohali", 140, p8);
        t8.displayTeamInfo();

        Player p9 = new Player(109, "Hardik Pandya", "All-Rounder");
        Team t9 = new Team(9, "Gujarat Titans", "Ahmedabad", 20, p9);
        t9.displayTeamInfo();

        Player p10 = new Player(110, "KL Rahul", "Batsman");
        Team t10 = new Team(10, "Lucknow Super Giants", "Lucknow", 10, p10);
        t10.displayTeamInfo();

        Player p11 = new Player(111, "Suryakumar Yadav", "Batsman");
        Team t11 = new Team(11, "Mumbai Indians-2", "Mumbai", 200, p11);
        t11.displayTeamInfo();

        Player p12 = new Player(112, "Ravindra Jadeja", "All-Rounder");
        Team t12 = new Team(12, "Chennai Super Kings-2", "Chennai", 210, p12);
        t12.displayTeamInfo();

        Player p13 = new Player(113, "Faf du Plessis", "Batsman");
        Team t13 = new Team(13, "RCB-2", "Bangalore", 190, p13);
        t13.displayTeamInfo();

        Player p14 = new Player(114, "Prithvi Shaw", "Batsman");
        Team t14 = new Team(14, "Delhi Capitals-2", "Delhi", 180, p14);
        t14.displayTeamInfo();

        Player p15 = new Player(115, "Andre Russell", "All-Rounder");
        Team t15 = new Team(15, "KKR-2", "Kolkata", 170, p15);
        t15.displayTeamInfo();

        Player p16 = new Player(116, "Bhuvneshwar Kumar", "Bowler");
        Team t16 = new Team(16, "Sunrisers-2", "Hyderabad", 160, p16);
        t16.displayTeamInfo();

        Player p17 = new Player(117, "Jos Buttler", "Batsman");
        Team t17 = new Team(17, "Rajasthan Royals-2", "Jaipur", 150, p17);
        t17.displayTeamInfo();

        Player p18 = new Player(118, "Shreyas Gopal", "Bowler");
        Team t18 = new Team(18, "Punjab Kings-2", "Mohali", 140, p18);
        t18.displayTeamInfo();

        Player p19 = new Player(119, "Rashid Khan", "Bowler");
        Team t19 = new Team(19, "Gujarat Titans-2", "Ahmedabad", 20, p19);
        t19.displayTeamInfo();

        Player p20 = new Player(120, "Kane Williamson", "Batsman");
        Team t20 = new Team(20, "Lucknow Super Giants-2", "Lucknow", 10, p20);
        t20.displayTeamInfo();
    }
}
