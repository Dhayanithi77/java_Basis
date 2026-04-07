package firststepjava.oops;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacture 1", 1, "red");
		fan.switchOn();
		fan.fanOn();
		System.out.println(fan);
		fan.switchOff();
		fan.fanoff();
		System.out.println(fan);

	}

}
