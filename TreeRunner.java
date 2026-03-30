class TreeRunner {

	public static void main(String[] plant) {
	
		Tree tree = new Tree();
		
		tree.addTreeName("Neem");
		tree.addTreeName("Banyan");
		tree.addTreeName("Peepal");
		tree.addTreeName("Mango");
		tree.addTreeName("Coconut");
		tree.addTreeName("Teak");
		tree.addTreeName("Pine");
		tree.addTreeName("Oak");
		tree.addTreeName("Maple");
		tree.addTreeName("Eucalyptus");
		
		tree.getTreeNames();
		System.out.println("----------------------------------------------");
		
		System.out.println(tree.getTreeNameByIndex(2));
		System.out.println("----------------------------------------------");
		
		System.out.println(tree.getIndexByTreeName("Peepal"));
		System.out.println("----------------------------------------------");
		
		tree.updateTreeName("Pine" , "Pine tree");
		System.out.println("The updated tree names is as follows :");
		tree.getTreeNames();
		System.out.println("----------------------------------------------");
	
	}

}