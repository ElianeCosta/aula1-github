package aplicacao;

import java.util.Locale;

public class Calcuco {

	public static void main(String[] args) {

		String product1 = "computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 52900;
		char gender = 'f';
		double price1 = 2100.0;
		double price2 = 650.00;
		double meansure = 53.234567;
		System.out.println("products:");
		System.out.printf("%s, which price is $,%.2f%n ", product1, price1);
		System.out.printf("%s, which price is $,%.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record:%d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue, with eight decimal places: %.6f%n", meansure);
		System.out.printf("Rouded ,(three decimal places):%.3f%n", meansure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point:%.3f%n", meansure);

	}



	}


