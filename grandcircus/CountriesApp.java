package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Country> countryInfo = new ArrayList<Country>();

		System.out.println("Welcome to the Countries app!");
		System.out.println("\n1 list of countries \n2 - Add a country \n3 - Exit");
		System.out.println("Menu number: ");

		int userChoice = scan.nextInt();
		scan.nextLine();

		while (userChoice == 1 || userChoice == 2) {

			if (userChoice == 1) {

				System.out.println(countryInfo);

				userChoice = scan.nextInt();

			} else if (userChoice == 2) {

				System.out.println("Enter the name of your country:");

				String newCountry = scan.nextLine();

				System.out.println("Enter your country's population:");

				int countryPop = scan.nextInt();

				Country countryObject = new Country(newCountry, countryPop);

				countryInfo.add(countryObject);

				scan.nextLine();

				System.out.println("You entered: 1. Country: " + newCountry);
				System.out.println("Your country has a population of " + countryPop);
			}

			System.out.println(
					"Please choose your next menu option: \n1 - See the list of countries \n2 - Add a country \n3 - Exit");
			System.out.println("Enter menu number: ");
			userChoice = scan.nextInt();
			scan.nextLine();

		}

		System.out.println("Your results :");

		for (Country c : countryInfo) {
			System.out.println(c.toString());
		}
		
		text.writeToFile(countryInfo);
	}
}