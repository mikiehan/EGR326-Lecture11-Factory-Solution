package pizzaf.pizza;

import pizzaf.factory.IngredientFactory;

public class VeggiePizza extends Pizza {
	IngredientFactory ingredientFactory;
 
	public VeggiePizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
