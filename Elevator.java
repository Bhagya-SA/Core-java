class Elevator {

    static String brand;
    static String model;
    static String capacity;
    static String type;
    static String speed;
    static String floorsServed;
    static String safetyFeatures;

    public static boolean getPropertiesInfo(String b, String m, String cap, String t, String spd, String floors, String safety) {

        boolean isPropertiesValidate = false;

        boolean isBrandValidate = false;
        boolean isModelValidate = false;
        boolean isCapacityValidate = false;
        boolean isTypeValidate = false;
        boolean isSpeedValidate = false;
        boolean isFloorsValidate = false;
        boolean isSafetyValidate = false;

        if(b != null && !b.isEmpty()) { 
            System.out.println("Brand validated"); 
            brand = b; 
            isBrandValidate = true; 
        } else { 
            System.out.println("Brand not validated"); 
        }

        if(m != null && !m.isEmpty()) { 
            System.out.println("Model validated"); 
            model = m; 
            isModelValidate = true; 
        } else { 
            System.out.println("Model not validated"); 
        }

        if(cap != null && !cap.isEmpty()) { 
            System.out.println("Capacity validated"); 
            capacity = cap; 
            isCapacityValidate = true; 
        } else { 
            System.out.println("Capacity not validated"); 
        }

        if(t != null && !t.isEmpty()) { 
            System.out.println("Type validated"); 
            type = t; 
            isTypeValidate = true; 
        } else { 
            System.out.println("Type not validated"); 
        }

        if(spd != null && !spd.isEmpty()) { 
            System.out.println("Speed validated"); 
            speed = spd; 
            isSpeedValidate = true; 
        } else { 
            System.out.println("Speed not validated"); 
        }

        if(floors != null && !floors.isEmpty()) { 
            System.out.println("Floors Served validated"); 
            floorsServed = floors; 
            isFloorsValidate = true; 
        } else { 
            System.out.println("Floors Served not validated"); 
        }

        if(safety != null && !safety.isEmpty()) { 
            System.out.println("Safety Features validated"); 
            safetyFeatures = safety; 
            isSafetyValidate = true; 
        } else { 
            System.out.println("Safety Features not validated"); 
        }

        if(isBrandValidate && isModelValidate && isCapacityValidate && isTypeValidate &&isSpeedValidate && isFloorsValidate && isSafetyValidate) {
           isPropertiesValidate = true;
		   System.out.println("All Properties validated successfully");
        }

        return isPropertiesValidate;
    }

    public static void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Capacity : " + capacity);
        System.out.println("Type : " + type);
        System.out.println("Speed : " + speed);
        System.out.println("Floors Served : " + floorsServed);
        System.out.println("Safety Features : " + safetyFeatures);
    }

    
}