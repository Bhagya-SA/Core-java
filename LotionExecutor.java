class LotionExecutor {

    public static void main(String[] lotion) {

        Lotion l1 = new Lotion(1,"Nivea","Soft Moisturizer",200,300,"White","Mild",true,true,"All","Beiersdorf","Germany","2026-12-31","L001","Water, Glycerin, Paraffin",5.5,"Daily",4.5,true,"Available");
        Lotion l2 = new Lotion(2,"Himalaya","Herbal Body Lotion",250,280,"Light Green","Herbal",true,true,"All","Himalaya","India","2025-11-30","L002","Water, Aloe Vera, Almond Oil",5.6,"Daily",4.6,true,"Available");
        Lotion l3 = new Lotion(3,"Vaseline","Intensive Care",200,270,"White","Neutral",true,true,"Dry","Unilever","USA","2026-10-31","L003","Water, Glycerin, Petroleum Jelly",5.7,"Daily",4.5,true,"Available");
        Lotion l4 = new Lotion(4,"Pond's","Light Moisturizer",180,250,"White","Floral",true,true,"Normal","HUL","India","2025-09-30","L004","Water, Glycerin, Mineral Oil",5.5,"Daily",4.4,true,"Available");
        Lotion l5 = new Lotion(5,"Natura","Herbal Lotion",200,310,"Light Brown","Herbal",true,true,"All","Natura","Brazil","2026-08-31","L005","Water, Shea Butter, Aloe Vera",5.6,"Daily",4.6,true,"Available");
        Lotion l6 = new Lotion(6,"Biotique","Bio Lotion",220,320,"Light Green","Herbal",true,true,"Dry","Biotique","India","2025-07-31","L006","Water, Aloe Vera, Vitamin E",5.5,"Daily",4.5,true,"Available");
        Lotion l7 = new Lotion(7,"Lotus Herbals","NutraSkin",200,290,"White","Mild",true,true,"Normal","Lotus Herbals","India","2026-06-30","L007","Water, Almond Oil, Aloe Vera",5.6,"Daily",4.4,true,"Available");
        Lotion l8 = new Lotion(8,"The Body Shop","Shea Body Lotion",250,350,"Beige","Shea",true,true,"Dry","The Body Shop","UK","2025-05-31","L008","Water, Shea Butter, Almond Oil",5.7,"Daily",4.7,true,"Available");
        Lotion l9 = new Lotion(9,"Aveeno","Daily Moisturizer",200,300,"White","Oatmeal",true,true,"Sensitive","Aveeno","USA","2026-04-30","L009","Water, Colloidal Oatmeal, Glycerin",5.5,"Daily",4.6,true,"Available");
        Lotion l10 = new Lotion(10,"Mamaearth","Body Lotion",180,280,"White","Mild",true,true,"All","Mamaearth","India","2025-03-31","L010","Water, Aloe Vera, Shea Butter",5.6,"Daily",4.5,true,"Available");

        l1.toDisplayDetails();
        l2.toDisplayDetails();
        l3.toDisplayDetails();
        l4.toDisplayDetails();
        l5.toDisplayDetails();
        l6.toDisplayDetails();
        l7.toDisplayDetails();
        l8.toDisplayDetails();
        l9.toDisplayDetails();
        l10.toDisplayDetails();
    }
}