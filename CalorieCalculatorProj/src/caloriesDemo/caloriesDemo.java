/**
 * 
 */
package caloriesDemo;

import java.util.Scanner;

/**Homework 1 for Menuo su IT project
 * @author Ieva Orth
 * 
 * 
 */
public class caloriesDemo extends calculator {

	public static void main(String[] args) {

		String greetingText = "Sveiki!  Si programa pades planuoti ir ruosti maista vegetariskai mitybai.\n"
				+ "Pradekime nuo pagrindiniu maisto produktu kiekio paskaiciavimo dienai.";

		String foodProductText = "Pilnaverte mityba uztikrina subalansuotas visu reikiamu maistiniu medziagu kiekis.\n"
				+ "Toliau pateiksime ivairiu kasdieniu maisto produktu idejas ir kCal / 100 g pagal metu laika.";
		System.out.println();
		String timeOfYearText = "Prasom ivesti metu laika (pavasaris / vasara / ruduo / ziema):";
		
		String columnNames = "DARZOVE\t\t" + "SVORIS\t\t" + "KALORIJOS\t" + "METU LAIKAS";

		String springVegetables = "pavasaris";
		String foodProductZirniai = "zirniai";
		String foodProductSpinatai = "spinatai";
		String foodProductRidikai = "ridikai";
		String foodProductArtisokai = "artisokai";

		vegetable zirniai = new vegetable(foodProductZirniai, 100, 85, springVegetables);
		vegetable spinatai = new vegetable(foodProductSpinatai, 100, 19, springVegetables);
		vegetable ridikai = new vegetable(foodProductRidikai, 100, 25, springVegetables);
		vegetable artisokai = new vegetable(foodProductArtisokai, 100, 45, springVegetables);

		String allYear = "visus metus";
		String foodProductMorkos = "morkos ";
		String foodProductBulves = "bulves ";
		String foodProductBurokeliai = "burokeliai";
		String foodProductSalotos = "salotos";
		String foodProductSparagai = "sparagai";

		vegetable morkos = new vegetable(foodProductMorkos, 100, 40, allYear);
		vegetable bulves = new vegetable(foodProductBulves, 100, 80, allYear);
		vegetable burokeliai = new vegetable(foodProductBurokeliai, 100, 40, allYear);
		vegetable salotos = new vegetable(foodProductSalotos, 100, 14, allYear);
		vegetable sparagai = new vegetable(foodProductSparagai, 100, 20, allYear);

		String summerVegetables = "vasara";
		String foodProductReziukai = "reziukai";
		String foodProductPupos = "pupeles";
		String foodProductSvogunai = "svogunai";
		String foodProductCukinija = "cukinija";
		String foodProductGarzgarstes = "garzgarstes";

		vegetable reziukai = new vegetable(foodProductReziukai, 100, 11, summerVegetables);
		vegetable pupos = new vegetable(foodProductPupos, 100, 333, summerVegetables);
		vegetable burokeliuLapai = new vegetable(foodProductSvogunai, 100, 22, summerVegetables);
		vegetable cukinija = new vegetable(foodProductCukinija, 100, 16, summerVegetables);
		vegetable garzgarstes = new vegetable(foodProductGarzgarstes, 100, 25, summerVegetables);

		String fallVegetables = "ruduo";
		String foodProductPastarnokas = "pastarnokai";
		String foodProductRope = "ropes  ";
		String foodProductKopustas = "kopustai";
		String foodProductMoliugas = "moliugai";

		vegetable pastarnokai = new vegetable(foodProductPastarnokas, 100, 75, fallVegetables);
		vegetable ropes = new vegetable(foodProductRope, 100, 27, fallVegetables);
		vegetable kopustai = new vegetable(foodProductKopustas, 100, 22, fallVegetables);
		vegetable moliugai = new vegetable(foodProductMoliugas, 100, 26, fallVegetables);
		
		String winterVegetables = "ziema";
		String foodProductAvokadas = "avokadai";
		String foodProductGrieztis = "griezciai";
		String foodProductPetrazole = "petrazoles";
		String foodProductCesnakas = "cesnakai";

		vegetable avokadai = new vegetable(foodProductAvokadas, 100, 41, winterVegetables);
		vegetable griezciai = new vegetable(foodProductGrieztis, 100, 37, winterVegetables);
		vegetable petrazoles = new vegetable(foodProductPetrazole, 100, 35, winterVegetables);
		vegetable cesnakai = new vegetable(foodProductCesnakas, 100, 108, winterVegetables);
		
		System.out.println(greetingText);
		System.out.println();
		System.out.println("Prasom ivesti kaloriju skaiciu per diena:");
		System.out.println();

		Scanner keyboard = new Scanner(System.in);
		double calories = keyboard.nextInt();

		System.out.println();
		System.out.println("Angliavandeniai:" + (int) calculateCarbohydrates(calories) + " kcal per diena.");
		System.out.println("Baltymai:\t" + (int) calculateProtein(calories) + " kcal per diena.");
		System.out.println("Riebalai:\t" + (int) calculateFat(calories) + " kcal per diena.");
		System.out.println();

		System.out.println("Angliavandeniai:" + (int) calculateCarbsInGrams(calories) + " gramu per diena.");
		System.out.println("Baltymai\t" + (int) calculateProteinInGrams(calories) + " gramu per diena.");
		System.out.println("Riebalai\t" + (int) calculateFatInGrams(calories) + " gramu per diena.");
		System.out.println();

		System.out.println(foodProductText);
		System.out.println();
		System.out.println(timeOfYearText);
		System.out.println();

		String timeOfYear = keyboard.next();

		if (timeOfYear.equalsIgnoreCase("pavasaris")) {
			System.out.println(columnNames);
			System.out.println(zirniai);
			System.out.println(spinatai);
			System.out.println(ridikai);
			System.out.println(artisokai);

			System.out.println(morkos);
			System.out.println(bulves);
			System.out.println(burokeliai);
			System.out.println(salotos);
			System.out.println(sparagai);

		} else if (timeOfYear.equalsIgnoreCase("vasara")) {

			System.out.println(columnNames);
			System.out.println(reziukai);
			System.out.println(pupos);
			System.out.println(burokeliuLapai);
			System.out.println(cukinija);
			System.out.println(garzgarstes);

			System.out.println(morkos);
			System.out.println(bulves);
			System.out.println(burokeliai);
			System.out.println(salotos);
			System.out.println(sparagai);
		}

		else if (timeOfYear.equalsIgnoreCase("ruduo")) {

			System.out.println(columnNames);
			System.out.println(pastarnokai);
			System.out.println(ropes);
			System.out.println(kopustai);
			System.out.println(moliugai);

			System.out.println(morkos);
			System.out.println(bulves);
			System.out.println(burokeliai);
			System.out.println(salotos);
			System.out.println(sparagai);
		}

		else if (timeOfYear.equalsIgnoreCase("ziema")) {

			System.out.println(columnNames);
			System.out.println(avokadai);
			System.out.println(griezciai);
			System.out.println(petrazoles);
			System.out.println(cesnakai);

			System.out.println(morkos);
			System.out.println(bulves);
			System.out.println(burokeliai);
			System.out.println(salotos);
			System.out.println(sparagai);
		}
		
		else {
			
			System.out.println("Neteisingai ivestas metu laiko pavadinimas.");
		}
		
		System.out.println();
		System.out.println("Aciu, kad naudojates mano programele!");
		
		keyboard.close();
		}
	
	}


