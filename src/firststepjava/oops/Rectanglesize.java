package firststepjava.oops;

public class Rectanglesize {
	private int length;
	private int width;

	public Rectanglesize(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int premeter() {
		return 2 * (length * width);
	}
	@Override
	public String toString() {
		return String.format("length-%d ,breath-%d -area-%d premeter-%d", length, width, area(), premeter());
	}

}
