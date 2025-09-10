public class Food {
    String name;
    int calories;
    double protein;
    double fat;
    double carbs;

    public Food(String name, int calories, double protein, double fat, double carbs) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    @Override
    public String toString() {
        return name + " | " + calories + " kcal | P:" + protein + " F:" + fat + " C:" + carbs;
    }
}
