class Camera {
 
	static String brand;
	static String price;
	static String model;
	static String modelName;
	static String itemModelNo;
	static String memoryStorageCapacity;
	static String displayType;
	static String audioOutputType;
	static String material;
	static String mountingType;
	
	public static boolean ValidatePropertiesInfo(String bName , String cost , String mod , String mName , String  modNo , String memStorage , String disType , String audioType , String matUsed , String mountType) {
	
		boolean isPropertiesValidate = false;
		
		boolean isbNameValidate = false;
		boolean isCostValidate = false;
		boolean isModValidate = false;
		boolean ismNameValidate = false;
		boolean isModNoValidate = false;
		boolean isMemStorageValidate = false;
		boolean isDisTypeValidate = false;
		boolean isAudioTypeValidate = false;
		boolean isMatUsedvalidate = false;
		boolean isMountTypevalidate = false;
		
		if(bName != null && !bName.isEmpty()) {
			System.out.println("Brand name is validated");
			brand = bName;
			isbNameValidate = true;
		}
		else {
			System.out.println("Brand name is not validated");
		}
		
		if(cost!= null && !cost.isEmpty()) {
			System.out.println("Price is validated");
			price = cost;
			isCostValidate = true;
		}
		else {
			System.out.println("Price is not validated");
		}
	

		if(mod != null && !mod.isEmpty()) {
			System.out.println("Model is validated");
			model = mod;
			isModValidate = true;
		} 
		else {
			System.out.println("Model is not validated");
		}

		if(mName != null && !mName.isEmpty()) {
			System.out.println("Model name is validated");
			modelName = mName;
			ismNameValidate = true;
		} 
		else {
			System.out.println("Model name is not validated");
		}

		if(modNo != null && !modNo.isEmpty()) {
			System.out.println("Model number is validated");
			itemModelNo = String.valueOf(modNo);
			isModNoValidate = true;
		} 
		else {
			System.out.println("Model number is not validated");
		}

		if(memStorage != null && !memStorage.isEmpty()) {
			System.out.println("Memory storage is validated");
			memoryStorageCapacity = memStorage;
			isMemStorageValidate = true;
		} 
		else {
			System.out.println("Memory storage is not validated");
		}

		if(disType != null && !disType.isEmpty()) {
			System.out.println("Display type is validated");
			displayType = disType;
			isDisTypeValidate = true;
		} 
		else {
			System.out.println("Display type is not validated");
		}

		if(audioType != null && !audioType.isEmpty()) {
			System.out.println("Audio type is validated");
			audioOutputType = audioType;
			isAudioTypeValidate = true;
		} 
		else {
			System.out.println("Audio type is not validated");
		}

		if(matUsed != null && !matUsed.isEmpty()) {
			System.out.println("Material used is validated");
			material = matUsed;
			isMatUsedvalidate = true;
		} 
		else {
			System.out.println("Material used is not validated");
		}

		if(mountType != null && !mountType.isEmpty()) {
			System.out.println("Mount type is validated");
			mountingType = mountType;
			isMountTypevalidate = true;
		} 
		else {
			System.out.println("Mount type is not validated");
		}

		if(isbNameValidate && isCostValidate && isModValidate && ismNameValidate && isModNoValidate && isMemStorageValidate && isDisTypeValidate &&isAudioTypeValidate && isMatUsedvalidate && isMountTypevalidate) {

			isPropertiesValidate = true;
		}

		return isPropertiesValidate;
				
	
	}
	
	public static void getInfoOfCamera() {
	
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Model : " + model);
		System.out.println("Model Name : " + modelName);
		System.out.println("Item model no : " + itemModelNo);
		System.out.println("Memory Storage capacity : "+ memoryStorageCapacity);
		System.out.println("Display Type : " + displayType);
		System.out.println("Audio Output type : "+ audioOutputType);
		System.out.println("Material used : " + material);
		System.out.println("Mounting type : " + mountingType);
	
	

    }
	
}	
	

