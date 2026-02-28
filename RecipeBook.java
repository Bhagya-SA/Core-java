class RecipeBook {

    public static void getStep(String dishName) {
        System.out.println("RecipeBook: Getting recipe steps for '" + dishName + "'");
        IngredientList.checkStock(dishName);
    }
}