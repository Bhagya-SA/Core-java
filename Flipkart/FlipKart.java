class FlipKart {

    FlipkartListCreation items[] = new FlipkartListCreation[5];
    int index;

    public boolean addItem(FlipkartListCreation item) {

        boolean isItemAdded = false;

        boolean isItemIdValid = false;
        boolean isItemNameValid = false;
        boolean isPriceValid = false;
        boolean isBrandValid = false;
        boolean isDiscountValid = false;
        boolean isSellerValid = false;
        boolean isRatingValid = false;

        int itemId = item.getItemId();
        if (itemId > 0) {
            isItemIdValid = true;
        }

        String itemName = item.getItemName();
        if (itemName != null && !itemName.isEmpty()) {
            isItemNameValid = true;
        }

        double price = item.getPrice();
        if (price > 0) {
            isPriceValid = true;
        }

        String brand = item.getBrand();
        if (brand != null && !brand.isEmpty()) {
            isBrandValid = true;
        }

        int discount = item.getDiscount();
        if (discount >= 0) {
            isDiscountValid = true;
        }

        String seller = item.getSeller();
        if (seller != null && !seller.isEmpty()) {
            isSellerValid = true;
        }

        int rating = item.getRating();
        if (rating >= 0 && rating <= 5) {
            isRatingValid = true;
        }

        if (isItemIdValid && isItemNameValid && isPriceValid &&
            isBrandValid && isDiscountValid && isSellerValid &&
            isRatingValid) {

            isItemAdded = true;
            items[index++] = item;
        }

        return isItemAdded;
    }

    public void getItemDetails() {

        System.out.println("The FlipKart item details are as follows :");

        for (FlipkartListCreation item : items) {

            if (item != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Item Id : " + item.getItemId());
                System.out.println("Item Name : " + item.getItemName());
                System.out.println("Price : ₹" + item.getPrice());
                System.out.println("Brand : " + item.getBrand());
                System.out.println("Discount : " + item.getDiscount() + "%");
                System.out.println("Seller : " + item.getSeller());
                System.out.println("Rating : " + item.getRating() + "/5");
                System.out.println("--------------------------------------------");
            }
        }
    }
}