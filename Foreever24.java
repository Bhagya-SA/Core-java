class Foreever24 {

    
    static String shopName;
    static String location;
    static String owner;
    static String contactNumber;
    static String email;
    static String openingTime;
    static String closingTime;
    static String typeOfClothes;
    static String discountOffers;
    static String popularBrand;
    static String onlinePresence;
    static String paymentOptions;

    
    public static boolean getPropertiesInfo(String sName, String loc, String own, String contact, String mail,String open, String close, String type, String discount,String brand, String online, String payment) {
        boolean isPropertiesValidate = false;

        boolean isShopNameValidate = false;
        boolean isLocationValidate = false;
        boolean isOwnerValidate = false;
        boolean isContactValidate = false;
        boolean isEmailValidate = false;
        boolean isOpeningTimeValidate = false;
        boolean isClosingTimeValidate = false;
        boolean isTypeValidate = false;
        boolean isDiscountValidate = false;
        boolean isBrandValidate = false;
        boolean isOnlineValidate = false;
        boolean isPaymentValidate = false;

        if(sName != null && !sName.isEmpty()) { 
            System.out.println("Shop Name validated"); 
            shopName = sName; 
            isShopNameValidate = true; 
        } else { System.out.println("Shop Name not validated"); }

        if(loc != null && !loc.isEmpty()) { 
            System.out.println("Location validated"); 
            location = loc; 
            isLocationValidate = true; 
        } else { System.out.println("Location not validated"); }

        if(own != null && !own.isEmpty()) { 
            System.out.println("Owner validated"); 
            owner = own; 
            isOwnerValidate = true; 
        } else { System.out.println("Owner not validated"); }

        if(contact != null && !contact.isEmpty()) { 
            System.out.println("Contact Number validated"); 
            contactNumber = contact; 
            isContactValidate = true; 
        } else { System.out.println("Contact Number not validated"); }

        if(mail != null && !mail.isEmpty()) { 
            System.out.println("Email validated"); 
            email = mail; 
            isEmailValidate = true; 
        } else { System.out.println("Email not validated"); }

        if(open != null && !open.isEmpty()) { 
            System.out.println("Opening Time validated"); 
            openingTime = open; 
            isOpeningTimeValidate = true; 
        } else { System.out.println("Opening Time not validated"); }

        if(close != null && !close.isEmpty()) { 
            System.out.println("Closing Time validated"); 
            closingTime = close; 
            isClosingTimeValidate = true; 
        } else { System.out.println("Closing Time not validated"); }

        if(type != null && !type.isEmpty()) { 
            System.out.println("Type of Clothes validated"); 
            typeOfClothes = type; 
            isTypeValidate = true; 
        } else { System.out.println("Type of Clothes not validated"); }

        if(discount != null && !discount.isEmpty()) { 
            System.out.println("Discount Offers validated"); 
            discountOffers = discount; 
            isDiscountValidate = true; 
        } else { System.out.println("Discount Offers not validated"); }

        if(brand != null && !brand.isEmpty()) { 
            System.out.println("Popular Brand validated"); 
            popularBrand = brand; 
            isBrandValidate = true; 
        } else { System.out.println("Popular Brand not validated"); }

        if(online != null && !online.isEmpty()) { 
            System.out.println("Online Presence validated"); 
            onlinePresence = online; 
            isOnlineValidate = true; 
        } else { System.out.println("Online Presence not validated"); }

        if(payment != null && !payment.isEmpty()) { 
            System.out.println("Payment Options validated"); 
            paymentOptions = payment; 
            isPaymentValidate = true; 
        } else { System.out.println("Payment Options not validated"); }

        if(isShopNameValidate && isLocationValidate && isOwnerValidate && isContactValidate && isEmailValidate &&isOpeningTimeValidate && isClosingTimeValidate && isTypeValidate && isDiscountValidate &&isBrandValidate && isOnlineValidate && isPaymentValidate) { isPropertiesValidate = true;
            System.out.println("All Properties validated successfully");
        }

        return isPropertiesValidate;
    }

    
    public static void displayInfo() {
        System.out.println("Shop Name : " + shopName);
        System.out.println("Location : " + location);
        System.out.println("Owner : " + owner);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Email : " + email);
        System.out.println("Opening Time : " + openingTime);
        System.out.println("Closing Time : " + closingTime);
        System.out.println("Type of Clothes : " + typeOfClothes);
        System.out.println("Discount Offers : " + discountOffers);
        System.out.println("Popular Brand : " + popularBrand);
        System.out.println("Online Presence : " + onlinePresence);
        System.out.println("Payment Options : " + paymentOptions);
    }

}

