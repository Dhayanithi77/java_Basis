package firststepjava.oops;

public class book {

	private int noOfCopies;

	book() {
		this(5);
	}
	book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void decreaseBook(int howmuch) {
		this.noOfCopies = howmuch - noOfCopies;

	}

	public void increaseBook(int howmuch) {
		this.noOfCopies = noOfCopies + howmuch;
	}

	}

