package firststepjava.oops;

public class BookRead {

	public static void main(String[] args) {
		book artOfComputerProgramming = new book(10);
		book effectiveJava = new book(10);
		book cleanCode = new book(15);
		book bookssection = new book();


		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		System.out.println(bookssection.getNoOfCopies());

		artOfComputerProgramming.setNoOfCopies(2);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		effectiveJava.setNoOfCopies(23);
		System.out.println(effectiveJava.getNoOfCopies());

		cleanCode.setNoOfCopies(2);
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.decreaseBook(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());

		artOfComputerProgramming.increaseBook(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
	}

}
