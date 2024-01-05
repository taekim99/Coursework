// Tae Kim, 115331743, HW6
public class Ingredient {
    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;
    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }
    public String getName() {
        return name;
    }
    public String getMeasuringUnit() {
        return measuringUnit;
    }
    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }
    public Ingredient getIngredient() {
        return this;
    }
    @Override
    public String toString() {
        return "Ingredient\n" +
                "name=" + name + "\n" +
                "measuringUnit=" + measuringUnit + "\n" +
                "caloriesPerUnit=" + caloriesPerUnit;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ingredient)) {
            return false;
        }
        Ingredient other = (Ingredient) obj;
        return this.name.equals(other.name) && this.measuringUnit.equals(other.measuringUnit) && this.caloriesPerUnit == other.caloriesPerUnit;
    }
}