class Amazon {

    AmazonProductPage products[] = new AmazonProductPage[5];
    int index;

    public boolean addProduct(AmazonProductPage product) {

        boolean isProductAdded = false;

        boolean isProductIdValid = false;
        boolean isProductNameValid = false;
        boolean isBrandValid = false;
        boolean isPriceValid = false;
        boolean isStockValid = false;
        boolean isCategoryValid = false;
        boolean isRatingValid = false;

        int productId = product.getProductId();
        if (productId > 0) {
            isProductIdValid = true;
        }

        String productName = product.getProductName();
        if (productName != null && !productName.isEmpty()) {
            isProductNameValid = true;
        }

        String brand = product.getBrand();
        if (brand != null && !brand.isEmpty()) {
            isBrandValid = true;
        }

        double price = product.getPrice();
        if (price > 0) {
            isPriceValid = true;
        }

        int stock = product.getStock();
        if (stock >= 0) {
            isStockValid = true;
        }

        String category = product.getCategory();
        if (category != null && !category.isEmpty()) {
            isCategoryValid = true;
        }

        int rating = product.getRating();
        if (rating >= 0 && rating <= 5) {
            isRatingValid = true;
        }

        if (isProductIdValid && isProductNameValid && isBrandValid &&
            isPriceValid && isStockValid && isCategoryValid && isRatingValid) {

            isProductAdded = true;
            products[index++] = product;
        }

        return isProductAdded;
    }

    public void getProductDetails() {

        System.out.println("The Amazon product details are as follows :");

        for (AmazonProductPage product : products) {

            if (product != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Product Id : " + product.getProductId());
                System.out.println("Product Name : " + product.getProductName());
                System.out.println("Brand : " + product.getBrand());
                System.out.println("Price : ₹" + product.getPrice());
                System.out.println("Stock : " + product.getStock());
                System.out.println("Category : " + product.getCategory());
                System.out.println("Rating : " + product.getRating() + "/5");
                System.out.println("--------------------------------------------");
            }
        }
    }
}