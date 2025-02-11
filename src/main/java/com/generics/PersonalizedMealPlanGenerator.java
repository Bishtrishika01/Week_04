/*4. Personalized Meal Plan Generator
Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.*/
package com.generics;

import java.util.ArrayList;
import java.util.List;

// MealPlan interface for different meal types
interface MealPlan {
    String getMealName();
    void displayMeal();
}

// Vegetarian Meal
class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: " + mealName);
    }
}

// Vegan Meal
class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: " + mealName);
    }
}

// Keto Meal
class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto Meal: " + mealName);
    }
}

// High-Protein Meal
class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("High-Protein Meal: " + mealName);
    }
}

// Generic Meal Plan Manager
class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    // Add a meal to the plan
    public void addMeal(T meal) {
        meals.add(meal);
    }

    // Display all meals
    public void displayMeals() {
        for (T meal : meals) {
            meal.displayMeal();
        }
    }
}

// Utility class for meal validation
class MealUtility {
    // Generic method to generate a meal plan
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated Meal: " + meal.getMealName());
        meal.displayMeal();
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        // Creating meal plans for different categories
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        vegetarianPlan.addMeal(new VegetarianMeal("Salad"));
        vegetarianPlan.addMeal(new VegetarianMeal("Rice & Vegetables"));

        Meal<VeganMeal> veganPlan = new Meal<>();
        veganPlan.addMeal(new VeganMeal("Fruit Bowl"));
        veganPlan.addMeal(new VeganMeal("Veggie Soup"));

        Meal<KetoMeal> ketoPlan = new Meal<>();
        ketoPlan.addMeal(new KetoMeal("Egg & Bacon"));
        ketoPlan.addMeal(new KetoMeal("Chicken Salad"));

        Meal<HighProteinMeal> highProteinPlan = new Meal<>();
        highProteinPlan.addMeal(new HighProteinMeal("Grilled Chicken"));
        highProteinPlan.addMeal(new HighProteinMeal("Omelet"));

        // Displaying meal plans
        System.out.println("=== Vegetarian Meal Plan ===");
        vegetarianPlan.displayMeals();

        System.out.println("\n=== Vegan Meal Plan ===");
        veganPlan.displayMeals();

        System.out.println("\n=== Keto Meal Plan ===");
        ketoPlan.displayMeals();

        System.out.println("\n=== High-Protein Meal Plan ===");
        highProteinPlan.displayMeals();

        // Generating personalized meals
        System.out.println("\n=== Generating Personalized Meals ===");
        MealUtility.generateMeal(new VegetarianMeal("Mixed Vegetables"));
        MealUtility.generateMeal(new KetoMeal("Steak"));
        MealUtility.generateMeal(new VeganMeal("Smoothie"));
        MealUtility.generateMeal(new HighProteinMeal("Fish & Rice"));
    }
}
