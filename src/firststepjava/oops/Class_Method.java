package firststepjava.oops;

public class Class_Method {

	String name;
	String breed;
	int age;
	String color;

	public Class_Method(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Name is: " + name + "\nBreed age and color are: " + breed + " " + age + " " + color;
	}

	public static void main(String[] args) {
		Class_Method tuffy = new Class_Method("tuffy", "papillon", 5, "white");
		Class_Method Bello = new Class_Method("bello", "pekachu", 10, "Brown");
		System.out.println(Bello);
	}
}
/*
 * class Student { String name; int age;
 * 
 * public Student(String name, int age) { this.name = name; this.age = age; } }
 * 
 * public class Class_Method { public static void main(String[] args) { Student
 * s1 = new Student("Dhaya", 20); Student s2 = new Student("Dhanush", 40);
 * Student s3 = new Student("Vijay", 56); System.out.println(s1.name + s1.age);
 * System.out.println(s2.name + s2.age); System.out.println(s3.name + s3.age); }
 * 
 * }
 */