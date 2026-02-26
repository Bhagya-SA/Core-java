class InshortsAppExecutor {

	public static void main(String[] app) {
	
		boolean isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "" , "" , "" , "" , "" , "" , "");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo(null , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , null , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , null , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , null , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , null , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , null , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , null , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , null);
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "" , "" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "" , "" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "" , "");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , null , "10,000,000 + downlaods" , "25.42 MB" , null , "Inshorts" , null , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "" , null , "25.42 MB" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "" , "3 Sept 2013" , "");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "13 Feb 2026" , "10,000,000 + downlaods" , "25.42 MB" , "Android 7.0 and up" , "" , "3 Sept 2013" , "");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "" , "10,000,000 + downlaods" , null , "Android 7.0 and up" , null , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo(null , null , "10,000,000 + downlaods" , null , "Android 7.0 and up" , "Inshorts" , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , null , "10,000,000 + downlaods" , null , "Android 7.0 and up" , null , "3 Sept 2013" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo(null , "13 Feb 2026" , "10,000,000 + downlaods" , null , "Android 7.0 and up" , null , "3 Sept 2013" , null);
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "" , "" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "13 Feb 2026" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "Inshorts" , "" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "13 Feb 2026" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "Inshorts" , "" , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("6.12.4" , "13 Feb 2026" , "10,000,000 + downlaods" , "" , "Android 7.0 and up" , "Inshorts" , "" , "");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , "13 Feb 2026" , "" , "25.42 MB" , "" , "Inshorts" , "3 Sept 2013" , "");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = InshortsApp.getPropertiesInfo("" , null , "10,000,000 + downlaods" , "25.42 MB" , null , "Inshorts" , null , "Works on every device");
		if(isPropertiesValidate)
			InshortsApp.displayAppInfo();
		else
			System.out.println("Vlidations failed , Cannot display");
		System.out.println("****************************************************************");
		
	}


}