package meal_plan_generator;

class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        System.out.println("Validating " + plan.getMealType() + " meal plan");
        return new Meal<>(plan);
    }
}

