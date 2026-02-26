class GiriasWashingMachine {

    static String brand;
    static String model;
    static String type;
    static String capacity;
    static String color;
    static String powerConsumption;
    static String washPrograms;
    static String spinSpeed;
    static String price;
    static String warranty;

    public static boolean getPropertiesInfo(String b, String m, String t, String c, String col, String power, String programs, String speed, String p, String w) {

        boolean isPropertiesValidate = false;

        boolean isBrandValidate = false;
        boolean isModelValidate = false;
        boolean isTypeValidate = false;
        boolean isCapacityValidate = false;
        boolean isColorValidate = false;
        boolean isPowerValidate = false;
        boolean isProgramsValidate = false;
        boolean isSpinSpeedValidate = false;
        boolean isPriceValidate = false;
        boolean isWarrantyValidate = false;

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

        if(t != null && !t.isEmpty()) { 
            System.out.println("Type validated"); 
            type = t; 
            isTypeValidate = true; 
        } else { 
            System.out.println("Type not validated"); 
        }

        if(c != null && !c.isEmpty()) { 
            System.out.println("Capacity validated"); 
            capacity = c; 
            isCapacityValidate = true; 
        } else { 
            System.out.println("Capacity not validated"); 
        }

        if(col != null && !col.isEmpty()) { 
            System.out.println("Color validated"); 
            color = col; 
            isColorValidate = true; 
        } else { 
            System.out.println("Color not validated"); 
        }

        if(power != null && !power.isEmpty()) { 
            System.out.println("Power Consumption validated"); 
            powerConsumption = power; 
            isPowerValidate = true; 
        } else { 
            System.out.println("Power Consumption not validated"); 
        }

        if(programs != null && !programs.isEmpty()) { 
            System.out.println("Wash Programs validated"); 
            washPrograms = programs; 
            isProgramsValidate = true; 
        } else { 
            System.out.println("Wash Programs not validated"); 
        }

        if(speed != null && !speed.isEmpty()) { 
            System.out.println("Spin Speed validated"); 
            spinSpeed = speed; 
            isSpinSpeedValidate = true; 
        } else { 
            System.out.println("Spin Speed not validated"); 
        }

        if(p != null && !p.isEmpty()) { 
            System.out.println("Price validated"); 
            price = p; 
            isPriceValidate = true; 
        } else { 
            System.out.println("Price not validated"); 
        }

        if(w != null && !w.isEmpty()) { 
            System.out.println("Warranty validated"); 
            warranty = w; 
            isWarrantyValidate = true; 
        } else { 
            System.out.println("Warranty not validated"); 
        }

        if(isBrandValidate && isModelValidate && isTypeValidate && isCapacityValidate &&isColorValidate && isPowerValidate && isProgramsValidate && isSpinSpeedValidate &&isPriceValidate && isWarrantyValidate) {isPropertiesValidate = true;
        }

        return isPropertiesValidate;
    }

    public static void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Type : " + type);
        System.out.println("Capacity : " + capacity);
        System.out.println("Color : " + color);
        System.out.println("Power Consumption : " + powerConsumption);
        System.out.println("Wash Programs : " + washPrograms);
        System.out.println("Spin Speed : " + spinSpeed);
        System.out.println("Price : " + price);
        System.out.println("Warranty : " + warranty);
    }

 
}