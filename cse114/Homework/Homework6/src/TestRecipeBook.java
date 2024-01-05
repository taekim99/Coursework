// Tae Kim, 115331743, HW6
public class TestRecipeBook {
    public static void main(String[] args) {
        // Create a RecipeBook
        RecipeBook recipeBook = new RecipeBook("My Recipe Book");

        // Add ingredients
        RecipeIngredient ingredient1 = new RecipeIngredient("Ingredient1", "Unit1", 100, 10);
        RecipeIngredient ingredient2 = new RecipeIngredient("Ingredient2", "Unit2", 200, 20);
        RecipeIngredient ingredient3 = new RecipeIngredient("Ingredient3", "Unit3", 300, 30);

        // Add recipes to the RecipeBook
        CookingRecipe recipe1 = recipeBook.addRecipe("Recipe1", new RecipeIngredient[] { ingredient1, ingredient2 });
        CookingRecipe recipe2 = recipeBook.addRecipe("Recipe2", new RecipeIngredient[] { ingredient2, ingredient3 });
        CookingRecipe recipe3 = recipeBook.addRecipe("Recipe3", new RecipeIngredient[] { ingredient1, ingredient3 });

        // Test findRecipes()
        RecipeIngredient[] searchIngredients1 = new RecipeIngredient[] { ingredient1, ingredient2 };
        CookingRecipe[] recipesWithIngredients1 = recipeBook.findRecipes(searchIngredients1);
        System.out.println("Recipes with ingredients 1 and 2:");
        if (recipesWithIngredients1 != null) {
            for (CookingRecipe recipe : recipesWithIngredients1) {
                System.out.println(recipe);
            }
        } else {
            System.out.println("No recipes found.");
        }

        RecipeIngredient[] searchIngredients2 = new RecipeIngredient[] { ingredient2, ingredient3 };
        CookingRecipe[] recipesWithIngredients2 = recipeBook.findRecipes(searchIngredients2);
        System.out.println("Recipes with ingredients 2 and 3:");
        if (recipesWithIngredients2 != null) {
            for (CookingRecipe recipe : recipesWithIngredients2) {
                System.out.println(recipe);
            }
        } else {
            System.out.println("No recipes found.");
        }

        // Test findRecipesWithFewIngredients()
        int numberOfIngredients = 2;
        CookingRecipe[] recipesWithFewIngredients = recipeBook.findRecipesWithFewIngredients(numberOfIngredients);
        System.out.println("Recipes with " + numberOfIngredients + " or fewer ingredients:");
        if (recipesWithFewIngredients != null) {
            for (CookingRecipe recipe : recipesWithFewIngredients) {
                System.out.println(recipe);
            }
        } else {
            System.out.println("No recipes found.");
        }

        // Test findRecipesLowCalories()
        CookingRecipe[] recipesLowCalories = recipeBook.findRecipesLowCalories();
        System.out.println("Recipes with lowest calories:");
        if (recipesLowCalories != null) {
            for (CookingRecipe recipe : recipesLowCalories) {
                System.out.println(recipe);
            }
        } else {
            System.out.println("No recipes found.");
        }

        // Test removeRecipe()
        CookingRecipe removedRecipe = recipeBook.removeRecipe("Recipe2");
        System.out.println("Removed Recipe2: " + removedRecipe);

        // Test toString() and equals()
        System.out.println("RecipeBook toString(): " + recipeBook);
        RecipeBook recipeBook2 = new RecipeBook("My Recipe Book");
        recipeBook2.addRecipe("Recipe1", new RecipeIngredient[] { ingredient1, ingredient2 });
        recipeBook2.addRecipe("Recipe3", new RecipeIngredient[] { ingredient1, ingredient3 });
        System.out.println("RecipeBook2 toString(): " + recipeBook2);
        System.out.println("RecipeBook equals(): " + recipeBook.equals(recipeBook2));
    }
}