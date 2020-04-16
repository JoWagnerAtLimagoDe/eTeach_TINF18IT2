package de.geo;

public class Punkt {
	
	private double x,y;
	
	public Punkt() {
		x = y = 0;
		System.out.println("Punkt");
	}
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
		System.out.println("Punkt 2");
	}
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void rechts() {
		x ++;
	}
	
	public void rechts(double offset) {
		x += offset;
	}
	
	public void links() {
		x --;
	}
	
	public void oben() {
		y ++;
	}
	public void unten() {
		this.y --;
		
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Punkt [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	protected void finalize() throws Throwable {
		
	}

}
