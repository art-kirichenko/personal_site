import java.util.ArrayList;
import java.util.List;

class Food {
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

public class FoodLog {
    private static List<Food> foodLog = new ArrayList<>();

    public static void addFood(String name, int calories, double protein, double fat, double carbs) {
        Food food = new Food(name, calories, protein, fat, carbs);
        foodLog.add(food);
    }

    public static void printLog() {
        for (Food food : foodLog) {
            System.out.println(food);
        }
    }

    public static void main(String[] args) {
        addFood("Apple", 95, 0.5, 0.3, 25);
        addFood("Chicken Breast", 165, 31, 3.6, 0);

        printLog();
    }
}