// Tae Kim, 115331743, HW6
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
public class CookingRecipe {
    private String name;
    public String getName() {
        return name;
    }
    private ArrayList<RecipeIngredient> ingredients;

    public CookingRecipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }
    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getIngredient().equals(ingredient)) {
                ri.setQuantity(quantity);
                return;
            }
        }
        RecipeIngredient newIngredient = new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity);
        ingredients.add(newIngredient);
    }
    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getIngredient().equals(ingredient)) {
                return ri;
            }
        }
        return null;
    }
    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getIngredient().getName().equals(ingredientName)) {
                return ri;
            }
        }
        return null;
    }
    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        Iterator<RecipeIngredient> iterator = ingredients.iterator();
        while (iterator.hasNext()) {
            RecipeIngredient ri = iterator.next();
            if (ri.getIngredient().equals(ingredient)) {
                iterator.remove();
                return ri;
            }
        }
        return null;
    }
    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        Iterator<RecipeIngredient> iterator = ingredients.iterator();
        while (iterator.hasNext()) {
            RecipeIngredient ri = iterator.next();
            if (ri.getIngredient().getName().equals(ingredientName)) {
                iterator.remove();
                return ri;
            }
        }
        return null;
    }
    public float calculateCalories() {
        float totalCalories = 0.0f;
        for (RecipeIngredient ri : ingredients) {
            totalCalories += ri.getIngredient().getCaloriesPerUnit() * ri.getQuantity();
        }
        return totalCalories;
    }
    public int getNumberOfIngredients() {
        return ingredients.size();
    }
    @Override
    public String toString() {
        String ingredientStr = "";
        for (RecipeIngredient ingredient : ingredients) {
            ingredientStr += ingredient.toString() + "\n";
        }
        return "CookingRecipe\n" +
                "name=" + name + "\n" +
                "ingredients=" + ingredientStr;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        CookingRecipe other = (CookingRecipe) obj;
        return Objects.equals(name, other.name) && Objects.equals(ingredients, other.ingredients);
    }
    public RecipeIngredient[] getRecipeIngredients() {
        RecipeIngredient[] recipeIngredients = new RecipeIngredient[ingredients.size()];
        for (int i = 0; i < ingredients.size(); i++) {
            recipeIngredients[i] = ingredients.get(i);
        }
        return recipeIngredients;
    }
}