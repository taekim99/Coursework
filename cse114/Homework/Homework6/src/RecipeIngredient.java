// Tae Kim, 115331743, HW6
public class RecipeIngredient extends Ingredient {
    private float quantity;
    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }
    public float getQuantity() {
        return quantity;
    }
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "quantity=" + quantity;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RecipeIngredient)) {
            return false;
        }
        RecipeIngredient other = (RecipeIngredient)obj;
        return super.equals(other) && this.quantity == other.quantity;
    }
}