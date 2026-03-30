package meal_plan_generator;

class Meal<T extends MealPlan> {
	private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getMealDetails() {
        return "Generated Meal Plan: " + mealPlan.getMealType();
    }
}
