class Tree {

	private String treeNames[] = new String[10];
	int index;
	
	public boolean addTreeName(String treeName) {
	
		boolean isTreeNameAdded = false;
		if(treeName != null && !treeName.isEmpty()) {
			treeNames[index++] = treeName;
			isTreeNameAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isTreeNameAdded;
	
	}
	
	public void getTreeNames() {
		for(String treeName : treeNames) System.out.println(treeName);
	
	}
	
	public String getTreeNameByIndex(int index) {
		
		String treeName = null;
		if(index < treeNames.length) treeName = treeNames[index];
		return treeName;
	
	}
	
	public int getIndexByTreeName(String treeName) {
	
		int index = 0;
		for(String name : treeNames) {
			if(name != null && !name.isEmpty()) {
				if(name != treeName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;
	
	}
	
	public boolean updateTreeName(String existingTreeName , String updatedTreeName) {
	
		boolean isTreelNameUpdated = false;
		for(int index = 0; index < treeNames.length; index++) {
			if(treeNames[index] == existingTreeName) {
				treeNames[index] = updatedTreeName;
				isTreelNameUpdated = true;
			}
		}
		return isTreelNameUpdated;
	}
}