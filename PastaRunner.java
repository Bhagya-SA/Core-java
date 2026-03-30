class PastaRunner {

	public static void main(String[] spicy) {
	
		Pasta pasta = new Pasta();
	
		pasta.addPastaName("Spaghetti");
		pasta.addPastaName("Penne");
		pasta.addPastaName("Fusilli");
		pasta.addPastaName("Macaroni");
		pasta.addPastaName("Lasagna");
		pasta.addPastaName("Ravioli");
		pasta.addPastaName("Fettuccine");
		pasta.addPastaName("Tagliatelle");
		pasta.addPastaName("Rigatoni");
		pasta.addPastaName("Tortellini");
		
		pasta.getPastaNames();
		System.out.println("-----------------------------------------------");
		
		System.out.println(pasta.getPastaNameByIndex(8));
		System.out.println("-----------------------------------------------");
		
		System.out.println(pasta.getIndexByPastaName("Fusilli"));
		System.out.println("-----------------------------------------------");
		
		pasta.updatePastaName("Macaroni" , "Macaroni Pasta");
		System.out.println("The updated pasta names are as follows:");
		pasta.getPastaNames();
		System.out.println("-----------------------------------------------");
	
	
	
	}


}