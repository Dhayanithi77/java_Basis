package firststepjava.oops;

/**
 * 
 */
public class Fan {
	private String make;
	private double radius;
	private String colour;
	private boolean ison;
	private int speed;

	public Fan(String make, double radius, String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;
}

public void fanOn() {
	this.speed = 3;

}

public void fanoff() {
	this.speed = 0;

}
public void switchOn() {
	this.ison = true;
}

public void switchOff() {
	this.ison = false;
}
@Override
public String toString() {
	return String.format("make-%s, radius-%f, colour-%s ,ison-%b speed-%d", make, radius, colour, ison, speed);
}
}