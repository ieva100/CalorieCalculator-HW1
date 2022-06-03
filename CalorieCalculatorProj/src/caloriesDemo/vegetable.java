/**
 * 
 */
package caloriesDemo;

/**
 * @author Ieva Orth
 * Homework 1 for Menuo su IT project
 * Class for creating vegetable objects.  Adds extra parameter (time of the year) to the main class.
 *
 */
public class vegetable extends foodProductClass {
	String timeOfYear;	

	public vegetable(String foodProduct, int weight, int calories, String timeOfYear) {
		this.foodProduct = foodProduct;
		this.weight = weight;
		this.calories = calories;
		this.timeOfYear = timeOfYear;
		
	}

	public vegetable() {
		// TODO Auto-generated constructor stub
	}

	public String getTimeOfYear() {
		return timeOfYear;
	}

	public void setTimeOfYear(String timeOfYear) {
		this.timeOfYear = timeOfYear;
	}

	@Override
	public String toString() {
		return super.toString() + timeOfYear + ";";
	}

	

	



	
	

		
	}

	

	

