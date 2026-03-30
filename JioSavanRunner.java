class JioSavanRunner {

    public static void main(String[] music) {
    
        JioSavan jioMusic = new JioSavan();
        
        
        jioMusic.addSongName("Belageddu - Kirik Party");
        jioMusic.addSongName("Singara Siriye - Kantara");
        jioMusic.addSongName("Karabuu - Pogaru");
        jioMusic.addSongName("Naguva Nayana - Pallavi Anu Pallavi");
        jioMusic.addSongName("Kadalanu - Sapta Sagaradaache Ello");
        jioMusic.addSongName("Kesariya - Brahmastra");
        jioMusic.addSongName("Tum Hi Ho - Aashiqui 2");
        jioMusic.addSongName("Shayad - Love Aaj Kal");
        jioMusic.addSongName("Apna Bana Le - Bhediya");
        jioMusic.addSongName("Channa Mereya - Ae Dil Hai Mushkil");
        jioMusic.addSongName("Butta Bomma - Ala Vaikunthapurramuloo");
        jioMusic.addSongName("Samajavaragamana - Ala Vaikunthapurramuloo");
        jioMusic.addSongName("Inkem Inkem Inkem Kaavaale - Geetha Govindam");
        jioMusic.addSongName("Naatu Naatu - RRR");
        jioMusic.addSongName("Srivalli - Pushpa");

        jioMusic.getSongNames();
		System.out.println("----------------------------------------------------");
		
		System.out.println(jioMusic.getSongNameByIndex(13));
		System.out.println("----------------------------------------------------");
		
		System.out.println(jioMusic.getIndexBySongName("Naguva Nayana - Pallavi Anu Pallavi"));
		System.out.println("----------------------------------------------------");
		
		jioMusic.updateSongName("Naguva Nayana - Pallavi Anu Pallavi" , "Naguva Nayana");
		System.out.println("The updated songs is as follows :");
		jioMusic.getSongNames();
		System.out.println("----------------------------------------------------");
        
    }
}