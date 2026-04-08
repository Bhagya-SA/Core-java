class SpotifyRunner {

    public static void main(String[] selectSong) {
        
        Spotify spotify = new Spotify();
        
        SongSelection songOne = new SongSelection();
        songOne.setSongId(1);
        songOne.setTitle("Blinding Lights");
        songOne.setDuration(200);
        songOne.setArtist("The Weeknd");
        songOne.setPlays(5000);
        songOne.setGenre("Pop");
        songOne.setLikes(450);
        
        boolean isSongAdded = spotify.addSong(songOne);
        System.out.println(isSongAdded);
        
        SongSelection songTwo = new SongSelection();
        songTwo.setSongId(2);
        songTwo.setTitle("Shape of You");
        songTwo.setDuration(210);
        songTwo.setArtist("Ed Sheeran");
        songTwo.setPlays(6000);
        songTwo.setGenre("Pop");
        songTwo.setLikes(500);
        
        isSongAdded = spotify.addSong(songTwo);
        System.out.println(isSongAdded);
        
        SongSelection songThree = new SongSelection();
        songThree.setSongId(3);
        songThree.setTitle("Levitating");
        songThree.setDuration(203);
        songThree.setArtist("Dua Lipa");
        songThree.setPlays(4500);
        songThree.setGenre("Pop");
        songThree.setLikes(420);
        
        isSongAdded = spotify.addSong(songThree);
        System.out.println(isSongAdded);
        
        SongSelection songFour = new SongSelection();
        songFour.setSongId(4);
        songFour.setTitle("Bad Habits");
        songFour.setDuration(230);
        songFour.setArtist("Ed Sheeran");
        songFour.setPlays(4800);
        songFour.setGenre("Pop");
        songFour.setLikes(430);
        
        isSongAdded = spotify.addSong(songFour);
        System.out.println(isSongAdded);
        
        SongSelection songFive = new SongSelection();
        songFive.setSongId(5);
        songFive.setTitle("Save Your Tears");
        songFive.setDuration(215);
        songFive.setArtist("The Weeknd");
        songFive.setPlays(5200);
        songFive.setGenre("Pop");
        songFive.setLikes(460);
        
        isSongAdded = spotify.addSong(songFive);
		System.out.println(isSongAdded);
		
        spotify.getSongDetails();
        
    }
}