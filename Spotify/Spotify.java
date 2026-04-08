class Spotify {

    SongSelection songSelections[] = new SongSelection[5];
	int index;
    
    public boolean addSong(SongSelection songSelection) {
        
        boolean isSongAdded = false;
        
        boolean isSongIdValid = false;
        boolean isTitleValid = false;
        boolean isDurationValid = false;
        boolean isArtistValid = false;
        boolean isPlaysValid = false;
        boolean isGenreValid = false;
        boolean isLikesValid = false;
        
        int songId = songSelection.getSongId();
        if(songId > 0) {
            isSongIdValid = true;
        }
        
        String title = songSelection.getTitle();
        if(title != null && !title.isEmpty()) {
            isTitleValid = true;
        }
        
        int duration = songSelection.getDuration();
        if(duration > 0) {
            isDurationValid = true;
        }
        
        String artist = songSelection.getArtist();
        if(artist != null && !artist.isEmpty()) {
            isArtistValid = true;
        }
        
        int plays = songSelection.getPlays();
        if(plays >= 0) {
            isPlaysValid = true;
        }
        
        String genre = songSelection.getGenre();
        if(genre != null && !genre.isEmpty()) {
            isGenreValid = true;
        }
        
        int likes = songSelection.getLikes();
        if(likes >= 0) {
            isLikesValid = true;
        }
        
        if(isSongIdValid && isTitleValid && isDurationValid && isArtistValid  && isPlaysValid && isGenreValid && isLikesValid) {
            
            isSongAdded = true;
            songSelections[index++] = songSelection;
        }
        
        return isSongAdded;
    }
    
    public void getSongDetails() {
        
        System.out.println("The song details are as follows :");
        
        for(SongSelection songSelection : songSelections) {
            
			System.out.println("--------------------------------------------");
            System.out.println("Song Id is : " + songSelection.getSongId());
            System.out.println("Title is : " + songSelection.getTitle());
            System.out.println("Duration is : " + songSelection.getDuration());
            System.out.println("Artist is : " + songSelection.getArtist());
            System.out.println("Plays are : " + songSelection.getPlays());
            System.out.println("Genre is : " + songSelection.getGenre());
            System.out.println("Likes are : " + songSelection.getLikes());
			System.out.println("--------------------------------------------");
        }
    }
}