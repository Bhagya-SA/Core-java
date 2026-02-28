class HeadChef {

    public static void cook(String dishName) {
        System.out.println("HeadChef: Cooking '" + dishName + "'");
        RecipeBook.getStep(dishName);
    }
}