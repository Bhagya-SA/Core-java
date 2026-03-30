class SingerRunner {

	public static void main(String[] song) {
	
		Singer singer = new Singer();
		
		singer.addSingerName("Arijit Singh");
		singer.addSingerName("Shreya Ghoshal");
		singer.addSingerName("Sonu Nigam");
		singer.addSingerName("Lata Mangeshkar");
		singer.addSingerName("Kishore Kumar");
		singer.addSingerName("A.R. Rahman");
		singer.addSingerName("Neha Kakkar");
		singer.addSingerName("KK");
		singer.addSingerName("Udit Narayan");
		singer.addSingerName("Sunidhi Chauhan");
		
		singer.getSingerNames();
		System.out.println("-------------------------------------------------");
		
		System.out.println(singer.getSingerNameByIndex(1));
		System.out.println("-------------------------------------------------");
		
		System.out.println(singer.getIndexBySingerName("Sonu Nigam"));
		System.out.println("-------------------------------------------------");
		
		singer.updateSingerName("A.R. Rahman" , "Rahman");
		System.out.println("The updated singer names is as follows :");
		singer.getSingerNames();
		System.out.println("-------------------------------------------------");
		
		
	
	}

}