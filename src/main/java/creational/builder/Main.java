/**
 *
 */
package creational.builder;

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
		final Burger burger = new BurgerBuilder().addBuns("sesame").addPatty("fish-patty").addCheese("swiss cheese")
				.build();
	}

}
