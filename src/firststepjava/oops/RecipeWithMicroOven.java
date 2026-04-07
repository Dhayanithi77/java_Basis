package firststepjava.oops;

public class RecipeWithMicroOven extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("new Recipe With MicroWave");

	}

	@Override
	void doTheDish() {

		System.out.println("Prepare Dish");

	}

	@Override
	void cleanUp() {
		System.out.println("serve the dish");

	}

}
