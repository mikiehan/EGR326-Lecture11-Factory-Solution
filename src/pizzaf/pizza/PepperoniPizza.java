package pizzaf.pizza;

import pizzaf.factory.IngredientFactory;

public class PepperoniPizza extends Pizza {
	IngredientFactory ingredientFactory;
 
	public PepperoniPizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
