class Food {

    static String foodName;
    static String cuisine;
    static String size;
    static String price;
    static String isVegetarian;

    public static boolean getPropertiesInfo(String name, String c, String s, String p, String veg) {
	
        boolean isPropertiesValidate = false;

        boolean isNameValidate = false;
        boolean isCuisineValidate = false;
        boolean isSizeValidate = false;
        boolean isPriceValidate = false;
        boolean isVegValidate = false;

        if(name != null && !name.isEmpty()) { 
            System.out.println("Food Name validated"); 
            foodName = name; 
            isNameValidate = true; 
        } else { 
            System.out.println("Food Name not validated"); 
        }

        if(c != null && !c.isEmpty()) { 
            System.out.println("Cuisine validated"); 
            cuisine = c; 
            isCuisineValidate = true; 
        } else { 
            System.out.println("Cuisine not validated"); 
        }

        if(s != null && !s.isEmpty()) { 
            System.out.println("Size validated"); 
            size = s; 
            isSizeValidate = true; 
        } else { 
            System.out.println("Size not validated"); 
        }

        if(p != null && !p.isEmpty()) { 
            System.out.println("Price validated"); 
            price = p; 
            isPriceValidate = true; 
        } else { 
            System.out.println("Price not validated"); 
        }

        if(veg != null && !veg.isEmpty()) { 
            System.out.println("Vegetarian status validated"); 
            isVegetarian = veg; 
            isVegValidate = true; 
        } else { 
            System.out.println("Vegetarian status not validated"); 
        }

        if(isNameValidate && isCuisineValidate && isSizeValidate && isPriceValidate && isVegValidate) {isPropertiesValidate = true;
        }

        return isPropertiesValidate;
    }

    public static void displayInfo() {
        System.out.println("Food Name : " + foodName);
        System.out.println("Cuisine : " + cuisine);
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
        System.out.println("Vegetarian : " + isVegetarian);
    }

    
}