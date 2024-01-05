// Tae Kim, 115331743, HW6
import java.util.ArrayList;
import java.util.Objects;
public class RecipeBook {
    private String bookName;
    private ArrayList<CookingRecipe> recipes;

    public RecipeBook(String bookName) {
        this.bookName = bookName;
        recipes = new ArrayList<>();
    }
    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        // Check if recipe with the same name already exists
        for (CookingRecipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return null; // Recipe with the same name already exists, return null
            }
        }
        // Create a new CookingRecipe object and add it to the recipes list
        CookingRecipe newRecipe = new CookingRecipe(name);
        for (RecipeIngredient ingredient : ingredients) {
            newRecipe.addOrUpdateRecipeIngredient(ingredient.getIngredient(), ingredient.getQuantity());
        }
        recipes.add(newRecipe);
        return newRecipe;
    }
    public CookingRecipe removeRecipe(String name) {
        // Search for the recipe with the specified name
        for (CookingRecipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                recipes.remove(recipe);
                return recipe; // Recipe found and removed, return it
            }
        }
        return null; // Recipe with the specified name not found, return null
    }
    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        ArrayList<CookingRecipe> foundRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            boolean containsAllIngredients = true;
            RecipeIngredient[] recipeIngredients = recipe.getRecipeIngredients();
            if (recipeIngredients.length < ingredients.length) {
                continue; // Recipe doesn't have enough ingredients, skip it
            }
            for (RecipeIngredient ingredient : ingredients) {
                boolean containsIngredient = false;
                for (RecipeIngredient recipeIngredient : recipeIngredients) {
                    if (ingredient.getIngredient().equals(recipeIngredient.getIngredient())) {
                        containsIngredient = true;
                        break;
                    }
                }
                if (!containsIngredient) {
                    containsAllIngredients = false;
                    break;
                }
            }
            if (containsAllIngredients) {
                foundRecipes.add(recipe);
            }
        }
        if (foundRecipes.size() == 0) {
            return null; // No recipes found with the specified ingredients, return null
        }
        return foundRecipes.toArray(new CookingRecipe[foundRecipes.size()]);
    }
    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        ArrayList<CookingRecipe> foundRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.getNumberOfIngredients() <= numberOfIngredients) {
                foundRecipes.add(recipe);
            }
        }
        if (foundRecipes.size() == 0) {
            return null; // No recipes found with the specified number of ingredients, return null
        }
        return foundRecipes.toArray(new CookingRecipe[foundRecipes.size()]);
    }
    public CookingRecipe[] findRecipesLowCalories() {
        ArrayList<CookingRecipe> foundRecipes = new ArrayList<>();
        float lowestCalories = Float.MAX_VALUE;
        for (CookingRecipe recipe : recipes) {
            float calories = recipe.calculateCalories();
            if (calories < lowestCalories) {
                lowestCalories = calories;
                foundRecipes.clear();
                foundRecipes.add(recipe);
            } else if (calories == lowestCalories) {
                foundRecipes.add(recipe);
            }
        }
        if (foundRecipes.size() == 0) {
            return null; // No recipes found with the lowest number of calories, return null
        }
        return foundRecipes.toArray(new CookingRecipe[foundRecipes.size()]);
    }
    @Override
    public String toString() {
        String recipeStr = "";
        for (CookingRecipe recipe : recipes) {
            recipeStr += recipe.toString() + "\n";
        }
        return "RecipeBook\n" +
                "bookName=" + bookName + "\n" +
                "recipes=" + recipeStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        RecipeBook other = (RecipeBook) obj;
        return Objects.equals(bookName, other.bookName) &&
                Objects.equals(recipes, other.recipes);
    }
}