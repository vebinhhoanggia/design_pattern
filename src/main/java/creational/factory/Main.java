/**
 *
 */
package creational.factory;

/**
 *
 */
public class Main {

	/**
	 *
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final BurgerFactory burgerFactory = new BurgerFactory();
		burgerFactory.createCheeseBurger().printIngredients();
		burgerFactory.createDeluxeCheeseBurger().printIngredients();
		burgerFactory.createVeganBurger().printIngredients();
	}

}
