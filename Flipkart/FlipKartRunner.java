class FlipKartRunner {

    public static void main(String[] args) {

        FlipKart flipkart = new FlipKart();

        FlipkartListCreation itemOne = new FlipkartListCreation();
        itemOne.setItemId(1);
        itemOne.setItemName("Smartphone");
        itemOne.setPrice(15999.99);
        itemOne.setBrand("Samsung");
        itemOne.setDiscount(10);
        itemOne.setSeller("Flipkart Seller 1");
        itemOne.setRating(5);

        boolean isItemAdded = flipkart.addItem(itemOne);
        System.out.println(isItemAdded);

        FlipkartListCreation itemTwo = new FlipkartListCreation();
        itemTwo.setItemId(2);
        itemTwo.setItemName("Laptop");
        itemTwo.setPrice(45999.50);
        itemTwo.setBrand("HP");
        itemTwo.setDiscount(15);
        itemTwo.setSeller("Flipkart Seller 2");
        itemTwo.setRating(4);

        isItemAdded = flipkart.addItem(itemTwo);
        System.out.println(isItemAdded);

        FlipkartListCreation itemThree = new FlipkartListCreation();
        itemThree.setItemId(3);
        itemThree.setItemName("Headphones");
        itemThree.setPrice(2999.99);
        itemThree.setBrand("Boat");
        itemThree.setDiscount(20);
        itemThree.setSeller("Flipkart Seller 3");
        itemThree.setRating(4);

        isItemAdded = flipkart.addItem(itemThree);
        System.out.println(isItemAdded);

        FlipkartListCreation itemFour = new FlipkartListCreation();
        itemFour.setItemId(4);
        itemFour.setItemName("Smartwatch");
        itemFour.setPrice(5999.00);
        itemFour.setBrand("Noise");
        itemFour.setDiscount(12);
        itemFour.setSeller("Flipkart Seller 4");
        itemFour.setRating(5);

        isItemAdded = flipkart.addItem(itemFour);
        System.out.println(isItemAdded);

        FlipkartListCreation itemFive = new FlipkartListCreation();
        itemFive.setItemId(5);
        itemFive.setItemName("Camera");
        itemFive.setPrice(25999.75);
        itemFive.setBrand("Canon");
        itemFive.setDiscount(8);
        itemFive.setSeller("Flipkart Seller 5");
        itemFive.setRating(5);

        isItemAdded = flipkart.addItem(itemFive);
        System.out.println(isItemAdded);

        flipkart.getItemDetails();
    }
}