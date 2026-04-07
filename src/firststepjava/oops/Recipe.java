package firststepjava.oops;

public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get Ready Dish");

	}

	@Override
	void doTheDish() {
		
			System.out.println("Prepare The Dish");
		


	}

	@Override
	void cleanUp() {
		System.out.println("Clean The Desk");

	}

}
