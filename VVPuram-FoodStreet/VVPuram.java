class VVPuram {

    int streetId;
    String visitorName;
    String city;
    FoodStreet foodStreet;

    public void displayStreetInfo() {
        System.out.println("Street Id : " + this.streetId);
        System.out.println("Visitor Name : " + this.visitorName);
        System.out.println("City : " + this.city);
        this.foodStreet.displayFoodInfo();
        System.out.println("--------------------------------------------------");
    }
}



