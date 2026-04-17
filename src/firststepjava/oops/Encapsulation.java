package firststepjava.oops;

class Account {
	private String name;
	private int age;
	private long balance;
	private long acc_type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(long acc_type) {
		this.acc_type = acc_type;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account person1 = new Account();
		person1.setName("dhaya");
		person1.setAge(20);
		person1.setBalance(50000L);
		person1.setAcc_type(2901L);
		System.out.println("Name : " + person1.getName() + "AGE : " + person1.getAge() + "/n BAlance :  "
				+ person1.getBalance() + "/n ACC_Type :  "
				+ person1.getAcc_type());

	}

}
