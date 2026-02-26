class LgRefrigerator {

    static String brand;
    static String model;
    static String type;
    static String capacity;
    static String color;
    static String energyRating;
    static String price;
    static String warranty;
    static String dimensions;
    static String features;

    public static boolean getPropertiesInfo(String b, String m, String t, String c, String col, String energy, String p, String w, String dim, String feat
    ) {

        boolean isPropertiesValidate = false;

        boolean isBrandValidate = false;
        boolean isModelValidate = false;
        boolean isTypeValidate = false;
        boolean isCapacityValidate = false;
        boolean isColorValidate = false;
        boolean isEnergyValidate = false;
        boolean isPriceValidate = false;
        boolean isWarrantyValidate = false;
        boolean isDimensionsValidate = false;
        boolean isFeaturesValidate = false;

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

        if(energy != null && !energy.isEmpty()) { 
            System.out.println("Energy Rating validated"); 
            energyRating = energy; 
            isEnergyValidate = true; 
        } else { 
            System.out.println("Energy Rating not validated"); 
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

        if(dim != null && !dim.isEmpty()) { 
            System.out.println("Dimensions validated"); 
            dimensions = dim; 
            isDimensionsValidate = true; 
        } else { 
            System.out.println("Dimensions not validated"); 
        }

        if(feat != null && !feat.isEmpty()) { 
            System.out.println("Features validated"); 
            features = feat; 
            isFeaturesValidate = true; 
        } else { 
            System.out.println("Features not validated"); 
        }

        if(isBrandValidate && isModelValidate && isTypeValidate && isCapacityValidate &&isColorValidate && isEnergyValidate && isPriceValidate && isWarrantyValidate &&isDimensionsValidate && isFeaturesValidate) {isPropertiesValidate = true;
        }

        return isPropertiesValidate;
    }

    public static void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Type : " + type);
        System.out.println("Capacity : " + capacity);
        System.out.println("Color : " + color);
        System.out.println("Energy Rating : " + energyRating);
        System.out.println("Price : " + price);
        System.out.println("Warranty : " + warranty);
        System.out.println("Dimensions : " + dimensions);
        System.out.println("Features : " + features);
    }

    
}