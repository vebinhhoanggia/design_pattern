/**
 * 
 */
package creational.factory;

import java.util.List;

/**
 * 
 */
public class Burger {
	private List<String> ingredients;

    public Burger(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void printIngredients() {
        System.out.println(ingredients);
    }
}
