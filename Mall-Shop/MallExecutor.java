class MallExecutor {

	public static void main(String[] malls) {

		/*Mall mall1 = new Mall();
		mall1.mallId = 1;
		mall1.mallName = "Orion";
		mall1.location = "Yeshwanthapura, Bangalore";
		mall1.totalFloors = 5;
		Shop shop1 = new Shop();
		shop1.shopId = 101;
		shop1.shopName = "Reliance";
		shop1.shopType = "Electronics";
		mall1.shop = shop1;
		mall1.displayMallInfo();


		Mall mall2 = new Mall();
		mall2.mallId = 2;
		mall2.mallName = "Garuda";
		mall2.location = "Magrath Road, Bangalore";
		mall2.totalFloors = 6;
		Shop shop2 = new Shop();
		shop2.shopId = 102;
		shop2.shopName = "Pantaloons";
		shop2.shopType = "Clothing";
		mall2.shop = shop2;
		mall2.displayMallInfo();


		Mall mall3 = new Mall();
		mall3.mallId = 3;
		mall3.mallName = "Forum";
		mall3.location = "Koramangala, Bangalore";
		mall3.totalFloors = 7;
		Shop shop3 = new Shop();
		shop3.shopId = 103;
		shop3.shopName = "Levis";
		shop3.shopType = "Clothing";
		mall3.shop = shop3;
		mall3.displayMallInfo();


		Mall mall4 = new Mall();
		mall4.mallId = 4;
		mall4.mallName = "UB City";
		mall4.location = "Vittal Mallya Road, Bangalore";
		mall4.totalFloors = 5;
		Shop shop4 = new Shop();
		shop4.shopId = 104;
		shop4.shopName = "Rolex";
		shop4.shopType = "Luxury Watches";
		mall4.shop = shop4;
		mall4.displayMallInfo();


		Mall mall5 = new Mall();
		mall5.mallId = 5;
		mall5.mallName = "Gopalan Mall";
		mall5.location = "Bannerghatta Road, Bangalore";
		mall5.totalFloors = 6;
		Shop shop5 = new Shop();
		shop5.shopId = 105;
		shop5.shopName = "Nike";
		shop5.shopType = "Sportswear";
		mall5.shop = shop5;
		mall5.displayMallInfo();


		Mall mall6 = new Mall();
		mall6.mallId = 6;
		mall6.mallName = "Esteem Mall";
		mall6.location = "Hebbal, Bangalore";
		mall6.totalFloors = 4;
		Shop shop6 = new Shop();
		shop6.shopId = 106;
		shop6.shopName = "Adidas";
		shop6.shopType = "Sportswear";
		mall6.shop = shop6;
		mall6.displayMallInfo();


		Mall mall7 = new Mall();
		mall7.mallId = 7;
		mall7.mallName = "Phoenix Marketcity";
		mall7.location = "Whitefield, Bangalore";
		mall7.totalFloors = 8;
		Shop shop7 = new Shop();
		shop7.shopId = 107;
		shop7.shopName = "Zara";
		shop7.shopType = "Clothing";
		mall7.shop = shop7;
		mall7.displayMallInfo();


		Mall mall8 = new Mall();
		mall8.mallId = 8;
		mall8.mallName = "VR Mall";
		mall8.location = "Whitefield, Bangalore";
		mall8.totalFloors = 7;
		Shop shop8 = new Shop();
		shop8.shopId = 108;
		shop8.shopName = "H&M";
		shop8.shopType = "Fashion";
		mall8.shop = shop8;
		mall8.displayMallInfo();


		Mall mall9 = new Mall();
		mall9.mallId = 9;
		mall9.mallName = "GT World Mall";
		mall9.location = "Magadi Road, Bangalore";
		mall9.totalFloors = 6;
		Shop shop9 = new Shop();
		shop9.shopId = 109;
		shop9.shopName = "Bata";
		shop9.shopType = "Footwear";
		mall9.shop = shop9;
		mall9.displayMallInfo();


		Mall mall10 = new Mall();
		mall10.mallId = 10;
		mall10.mallName = "Central Mall";
		mall10.location = "Bellandur, Bangalore";
		mall10.totalFloors = 5;
		Shop shop10 = new Shop();
		shop10.shopId = 110;
		shop10.shopName = "Apple Store";
		shop10.shopType = "Electronics";
		mall10.shop = shop10;
		mall10.displayMallInfo();


		Mall mall11 = new Mall();
		mall11.mallId = 11;
		mall11.mallName = "Mantri Square";
		mall11.location = "Malleshwaram, Bangalore";
		mall11.totalFloors = 7;
		Shop shop11 = new Shop();
		shop11.shopId = 111;
		shop11.shopName = "Samsung";
		shop11.shopType = "Electronics";
		mall11.shop = shop11;
		mall11.displayMallInfo();


		Mall mall12 = new Mall();
		mall12.mallId = 12;
		mall12.mallName = "Elements Mall";
		mall12.location = "Thanisandra, Bangalore";
		mall12.totalFloors = 5;
		Shop shop12 = new Shop();
		shop12.shopId = 112;
		shop12.shopName = "Puma";
		shop12.shopType = "Sportswear";
		mall12.shop = shop12;
		mall12.displayMallInfo();


		Mall mall13 = new Mall();
		mall13.mallId = 13;
		mall13.mallName = "Garuda Swagath";
		mall13.location = "Jayanagar, Bangalore";
		mall13.totalFloors = 4;
		Shop shop13 = new Shop();
		shop13.shopId = 113;
		shop13.shopName = "Woodland";
		shop13.shopType = "Footwear";
		mall13.shop = shop13;
		mall13.displayMallInfo();


		Mall mall14 = new Mall();
		mall14.mallId = 14;
		mall14.mallName = "Lulu Mall";
		mall14.location = "Rajajinagar, Bangalore";
		mall14.totalFloors = 8;
		Shop shop14 = new Shop();
		shop14.shopId = 114;
		shop14.shopName = "Marks & Spencer";
		shop14.shopType = "Clothing";
		mall14.shop = shop14;
		mall14.displayMallInfo();


		Mall mall15 = new Mall();
		mall15.mallId = 15;
		mall15.mallName = "Orion East";
		mall15.location = "Banaswadi, Bangalore";
		mall15.totalFloors = 6;
		Shop shop15 = new Shop();
		shop15.shopId = 115;
		shop15.shopName = "Reebok";
		shop15.shopType = "Sportswear";
		mall15.shop = shop15;
		mall15.displayMallInfo();


		Mall mall16 = new Mall();
		mall16.mallId = 16;
		mall16.mallName = "Soul Space Arena";
		mall16.location = "Mahadevapura, Bangalore";
		mall16.totalFloors = 5;
		Shop shop16 = new Shop();
		shop16.shopId = 116;
		shop16.shopName = "Titan";
		shop16.shopType = "Watches";
		mall16.shop = shop16;
		mall16.displayMallInfo();


		Mall mall17 = new Mall();
		mall17.mallId = 17;
		mall17.mallName = "Bhartiya Mall";
		mall17.location = "Thanisandra, Bangalore";
		mall17.totalFloors = 7;
		Shop shop17 = new Shop();
		shop17.shopId = 117;
		shop17.shopName = "FabIndia";
		shop17.shopType = "Clothing";
		mall17.shop = shop17;
		mall17.displayMallInfo();


		Mall mall18 = new Mall();
		mall18.mallId = 18;
		mall18.mallName = "Sigma Mall";
		mall18.location = "Cunningham Road, Bangalore";
		mall18.totalFloors = 5;
		Shop shop18 = new Shop();
		shop18.shopId = 118;
		shop18.shopName = "KFC";
		shop18.shopType = "Food";
		mall18.shop = shop18;
		mall18.displayMallInfo();


		Mall mall19 = new Mall();
		mall19.mallId = 19;
		mall19.mallName = "Royal Meenakshi Mall";
		mall19.location = "Bannerghatta Road, Bangalore";
		mall19.totalFloors = 6;
		Shop shop19 = new Shop();
		shop19.shopId = 119;
		shop19.shopName = "Dominos";
		shop19.shopType = "Food";
		mall19.shop = shop19;
		mall19.displayMallInfo();


		Mall mall20 = new Mall();
		mall20.mallId = 20;
		mall20.mallName = "ETA Mall";
		mall20.location = "Binny Pete, Bangalore";
		mall20.totalFloors = 5;
		Shop shop20 = new Shop();
		shop20.shopId = 120;
		shop20.shopName = "Croma";
		shop20.shopType = "Electronics";
		mall20.shop = shop20;
		mall20.displayMallInfo();*/

		 Shop shop1 = new Shop(101, "Reliance", "Electronics");
        Mall mall1 = new Mall(1, "Orion", "Yeshwanthapura, Bangalore", 5, shop1);
        mall1.displayMallInfo();

        Shop shop2 = new Shop(102, "Pantaloons", "Clothing");
        Mall mall2 = new Mall(2, "Garuda", "Magrath Road, Bangalore", 6, shop2);
        mall2.displayMallInfo();

        Shop shop3 = new Shop(103, "Levis", "Clothing");
        Mall mall3 = new Mall(3, "Forum", "Koramangala, Bangalore", 7, shop3);
        mall3.displayMallInfo();

        Shop shop4 = new Shop(104, "Rolex", "Luxury Watches");
        Mall mall4 = new Mall(4, "UB City", "Vittal Mallya Road, Bangalore", 5, shop4);
        mall4.displayMallInfo();

        Shop shop5 = new Shop(105, "Nike", "Sportswear");
        Mall mall5 = new Mall(5, "Gopalan Mall", "Bannerghatta Road, Bangalore", 6, shop5);
        mall5.displayMallInfo();

        Shop shop6 = new Shop(106, "Adidas", "Sportswear");
        Mall mall6 = new Mall(6, "Esteem Mall", "Hebbal, Bangalore", 4, shop6);
        mall6.displayMallInfo();

        Shop shop7 = new Shop(107, "Zara", "Clothing");
        Mall mall7 = new Mall(7, "Phoenix Marketcity", "Whitefield, Bangalore", 8, shop7);
        mall7.displayMallInfo();

        Shop shop8 = new Shop(108, "H&M", "Fashion");
        Mall mall8 = new Mall(8, "VR Mall", "Whitefield, Bangalore", 7, shop8);
        mall8.displayMallInfo();

        Shop shop9 = new Shop(109, "Bata", "Footwear");
        Mall mall9 = new Mall(9, "GT World Mall", "Magadi Road, Bangalore", 6, shop9);
        mall9.displayMallInfo();

        Shop shop10 = new Shop(110, "Apple Store", "Electronics");
        Mall mall10 = new Mall(10, "Central Mall", "Bellandur, Bangalore", 5, shop10);
        mall10.displayMallInfo();

        Shop shop11 = new Shop(111, "Samsung", "Electronics");
        Mall mall11 = new Mall(11, "Mantri Square", "Malleshwaram, Bangalore", 7, shop11);
        mall11.displayMallInfo();

        Shop shop12 = new Shop(112, "Puma", "Sportswear");
        Mall mall12 = new Mall(12, "Elements Mall", "Thanisandra, Bangalore", 5, shop12);
        mall12.displayMallInfo();

        Shop shop13 = new Shop(113, "Woodland", "Footwear");
        Mall mall13 = new Mall(13, "Garuda Swagath", "Jayanagar, Bangalore", 4, shop13);
        mall13.displayMallInfo();

        Shop shop14 = new Shop(114, "Marks & Spencer", "Clothing");
        Mall mall14 = new Mall(14, "Lulu Mall", "Rajajinagar, Bangalore", 8, shop14);
        mall14.displayMallInfo();

        Shop shop15 = new Shop(115, "Reebok", "Sportswear");
        Mall mall15 = new Mall(15, "Orion East", "Banaswadi, Bangalore", 6, shop15);
        mall15.displayMallInfo();

        Shop shop16 = new Shop(116, "Titan", "Watches");
        Mall mall16 = new Mall(16, "Soul Space Arena", "Mahadevapura, Bangalore", 5, shop16);
        mall16.displayMallInfo();

        Shop shop17 = new Shop(117, "FabIndia", "Clothing");
        Mall mall17 = new Mall(17, "Bhartiya Mall", "Thanisandra, Bangalore", 7, shop17);
        mall17.displayMallInfo();

        Shop shop18 = new Shop(118, "KFC", "Food");
        Mall mall18 = new Mall(18, "Sigma Mall", "Cunningham Road, Bangalore", 5, shop18);
        mall18.displayMallInfo();

        Shop shop19 = new Shop(119, "Dominos", "Food");
        Mall mall19 = new Mall(19, "Royal Meenakshi Mall", "Bannerghatta Road, Bangalore", 6, shop19);
        mall19.displayMallInfo();

        Shop shop20 = new Shop(120, "Croma", "Electronics");
        Mall mall20 = new Mall(20, "ETA Mall", "Binny Pete, Bangalore", 5, shop20);
        mall20.displayMallInfo();

	}
}
