/**
 * 
 */
package caloriesDemo;

/**Homework 1 for Menuo su IT project
 * This is the Main Product Class
 * @author Ieva Orth
 *
 */
public class foodProductClass {
	
	public String foodProduct;
	public int weight;
	public int calories;
	


	public foodProductClass() {
		
	}

	public foodProductClass(String foodProduct, int weight, int calories) {
		this.foodProduct = foodProduct;
		this.weight = weight;
		this.calories = calories;
	}
	

	public String getFoodProduct() {
		return foodProduct;
	}

	public void setFoodProduct(String foodProduct) {
		this.foodProduct = foodProduct;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return  foodProduct+ ";\t" + weight + " " + "gramu" + ";\t" + calories+ " kCal;\t";
	}
	
	
	

}
