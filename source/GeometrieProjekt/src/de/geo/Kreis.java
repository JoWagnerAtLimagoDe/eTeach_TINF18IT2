package de.geo;

public class Kreis extends Punkt{
	
	private double radius;
	
	public Kreis() {
		super(3,4);
		System.out.println("Kreis");
		radius = 0;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", Radius = " + radius;
	}

}
