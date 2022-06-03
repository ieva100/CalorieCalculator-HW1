/**
 * 
 */
package caloriesDemo;

/**
 * @author Ieva Orth
 * Homework 1 for Menuo su IT project
 * Calculator for counting the calories and weight for carbohydrate, protein and fat per day.  
 *
 *         1 gram of carbohydrate = 4 calories 
 *         1 gram of protein = 4 calories 
 *         1 gram of fat = 9 calories
 *
 *         Nutrition per day: Carbohydrate - 40% Protein - 30% Fat - 30%
 *
 */

public class calculator {

	
	double calories = 0;
	double caloriesCarbs = 0;
	

	public static double calculateCarbohydrates(double calories) {
		
		double percentCarbs = 40;
		double caloriesCarbs = calories / 100 * percentCarbs;
		return caloriesCarbs;

	}

	public static double calculateProtein(double calories) {
		double percentProtein = 30;
		double caloriesProtein = calories / 100 * percentProtein;
		return caloriesProtein;

	}
	
	public static double calculateFat(double calories) {
		double percentFat = 30;
		double caloriesFat = calories / 100 * percentFat;
		return caloriesFat;

	}
	
	public static double calculateCarbsInGrams (double calories) {
		double carbsInGrams = calculateCarbohydrates(calories) / 4;
		return carbsInGrams;
		
	}
	
	public static double calculateProteinInGrams (double calories) {
		double proteinInGrams = calculateProtein(calories) / 4;
		return proteinInGrams;
		
	}
	
	public static double calculateFatInGrams (double calories) {
		double fatInGrams = calculateFat(calories) / 9;
		return fatInGrams;
		
	}
	
	}

