package pizzaf.pizza;

import pizzaf.factory.IngredientFactory;

public class ClamPizza extends Pizza {
	IngredientFactory ingredientFactory;
 
	public ClamPizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
