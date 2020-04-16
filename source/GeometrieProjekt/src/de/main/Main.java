package de.main;

import de.geo.Kreis;
import de.geo.Punkt;

public class Main {

	public static void main(String[] args) {

		Punkt p;
		Kreis k;
		
		k = new Kreis();
		
		p = k;
		
		System.out.println(p.toString());
		
	}

}
