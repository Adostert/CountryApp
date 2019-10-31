package co.grandcircus;

public class Country {

	private String countryName;
	private int population;

	public Country(String newCountry, int newPop) {
		super();
		countryName = newCountry;
		population = newPop;
	}

	public String getName() {
		return countryName;
	}

	public void setName(String name) {
		this.countryName = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country: " + countryName + ", Population: " + population;
	}
}
