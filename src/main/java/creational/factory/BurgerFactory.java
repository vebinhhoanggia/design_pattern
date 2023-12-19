/**
 *
 */
package creational.factory;

import java.util.List;

/**
 *
 */
public class BurgerFactory {
	public Burger createCheeseBurger() {
		final List<String> ingredients = List.of("bun", "cheese", "beef-patty");
		return new Burger(ingredients);
	}

	public Burger createDeluxeCheeseBurger() {
		final List<String> ingredients = List.of("bun", "tomato", "lettuce", "cheese", "beef-patty");
		return new Burger(ingredients);
	}

	public Burger createVeganBurger() {
		final List<String> ingredients = List.of("bun", "special-sauce", "veggie-patty");
		return new Burger(ingredients);
	}
}
