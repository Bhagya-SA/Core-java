class NetflixRunner {

    public static void main(String[] series) {
    
        Netflix netflix = new Netflix();
        
        netflix.addWebSeries("Stranger Things");
        netflix.addWebSeries("Money Heist");
        netflix.addWebSeries("Wednesday");
        netflix.addWebSeries("Dark");
        netflix.addWebSeries("Breaking Bad");
        netflix.addWebSeries("Better Call Saul");
        netflix.addWebSeries("The Witcher");
        netflix.addWebSeries("Narcos");
        netflix.addWebSeries("Sacred Games");
        netflix.addWebSeries("Delhi Crime");
        netflix.addWebSeries("The Crown");
        netflix.addWebSeries("Ozark");
        netflix.addWebSeries("Peaky Blinders");
        netflix.addWebSeries("Lucifer");
        netflix.addWebSeries("Squid Game");
        netflix.addWebSeries("The Umbrella Academy");
        netflix.addWebSeries("13 Reasons Why");
        netflix.addWebSeries("Black Mirror");
        
        netflix.getWebSeriesNames();
		System.out.println("----------------------------------------------");
		
		System.out.println(netflix.getSeriesByIndex(5));
		System.out.println("----------------------------------------------");
		
		System.out.println(netflix.getIndexBySeries("Narcos"));
		System.out.println("----------------------------------------------");
		
		netflix.updateWebSeriesName("Money Heist" , "Money");
		System.out.println("The updated webseries names is as follows :");
		netflix.getWebSeriesNames();
		System.out.println("----------------------------------------------");
        
    }
}