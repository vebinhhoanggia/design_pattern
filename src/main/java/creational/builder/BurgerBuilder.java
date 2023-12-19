package creational.builder;

public class BurgerBuilder {

	private final Burger burger;

	public BurgerBuilder() {
		burger = new Burger();
	}

	public BurgerBuilder addBuns(String bunStyle) {
		burger.setBuns(bunStyle);
		return this;
	}

	public BurgerBuilder addPatty(String pattyStyle) {
		burger.setPatty(pattyStyle);
		return this;
	}

	public BurgerBuilder addCheese(String cheeseStyle) {
		burger.setCheese(cheeseStyle);
		return this;
	}

	public Burger build() {
		return burger;
	}

}
