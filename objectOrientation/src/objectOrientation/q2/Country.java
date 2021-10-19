package objectOrientation.q2;
import java.util.*;

public class Country {
	private String name;
	private String capital;
	private double dimension;
	
	public Country(String name, String capital, double dimension) {
		this.name = name;
		this.capital = capital;
		this.dimension = dimension;
	}
	
	protected final List<Country> border = new ArrayList<Country>();

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getDimension() {
		return dimension;
	}
	
	public List<Country> getBorder() {
		return border;
	}

	public boolean equals(Country another) {
		if((this.getName().equalsIgnoreCase(another.getName()))&&
		   (this.getCapital().equalsIgnoreCase(another.getCapital()))) {
			return true;
		}else return false;
	}
	
	public void addCrountryBorder(Country country) {
		border.add(country);
	}
	
	public void addCrountryBorder(String name, String capital, double dimension) {
		border.add(new Country(name, capital, dimension));
	}
	
	public void presentCrountryBorders() {
		for (Country search : border) {
			System.out.print(search.getName() + " ");
		}
		System.out.println("\n");
	}
	
	public void borderBetween(Country country) {
		boolean find;
		for (Country search : border) {
			find = false;
			for (Country search2 : country.border) {
				if((this.name != search.getName())&&(search.getName().equalsIgnoreCase(search2.getName()))) find = true;
			}
			if(find) System.out.println(search.getName());
		}
	}
}
