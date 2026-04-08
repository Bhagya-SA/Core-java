class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        AmazonProductPage productOne = new AmazonProductPage();
        productOne.setProductId(1);
        productOne.setProductName("Smartphone");
        productOne.setBrand("OnePlus");
        productOne.setPrice(34999.99);
        productOne.setStock(50);
        productOne.setCategory("Electronics");
        productOne.setRating(5);

        boolean isProductAdded = amazon.addProduct(productOne);
        System.out.println(isProductAdded);

        AmazonProductPage productTwo = new AmazonProductPage();
        productTwo.setProductId(2);
        productTwo.setProductName("Laptop");
        productTwo.setBrand("Dell");
        productTwo.setPrice(55999.50);
        productTwo.setStock(30);
        productTwo.setCategory("Computers");
        productTwo.setRating(4);

        isProductAdded = amazon.addProduct(productTwo);
        System.out.println(isProductAdded);

        AmazonProductPage productThree = new AmazonProductPage();
        productThree.setProductId(3);
        productThree.setProductName("Bluetooth Headphones");
        productThree.setBrand("Sony");
        productThree.setPrice(4999.99);
        productThree.setStock(100);
        productThree.setCategory("Audio");
        productThree.setRating(5);

        isProductAdded = amazon.addProduct(productThree);
        System.out.println(isProductAdded);

        AmazonProductPage productFour = new AmazonProductPage();
        productFour.setProductId(4);
        productFour.setProductName("Smartwatch");
        productFour.setBrand("Apple");
        productFour.setPrice(25999.00);
        productFour.setStock(20);
        productFour.setCategory("Wearables");
        productFour.setRating(5);

        isProductAdded = amazon.addProduct(productFour);
        System.out.println(isProductAdded);

        AmazonProductPage productFive = new AmazonProductPage();
        productFive.setProductId(5);
        productFive.setProductName("DSLR Camera");
        productFive.setBrand("Canon");
        productFive.setPrice(45999.75);
        productFive.setStock(15);
        productFive.setCategory("Photography");
        productFive.setRating(5);

        isProductAdded = amazon.addProduct(productFive);
        System.out.println(isProductAdded);

        amazon.getProductDetails();
    }
}