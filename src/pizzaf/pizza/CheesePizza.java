package pizzaf.pizza;

import pizzaf.factory.IngredientFactory;

public class CheesePizza extends Pizza {
	IngredientFactory ingredientFactory;
 
	public CheesePizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
