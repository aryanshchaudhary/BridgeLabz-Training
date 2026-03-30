package meal_plan_generator;

public class MealPlanner {
    public static void main(String[] args) {

        Meal<VeganMeal> vegMeal =
                MealGenerator.generateMealPlan(new VeganMeal());

        Meal<VeganMeal> veganMeal =
                MealGenerator.generateMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealGenerator.generateMealPlan(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealGenerator.generateMealPlan(new HighProteinMeal());

        System.out.println(vegMeal.getMealDetails());
        System.out.println(veganMeal.getMealDetails());
        System.out.println(ketoMeal.getMealDetails());
        System.out.println(proteinMeal.getMealDetails());
    }
}

