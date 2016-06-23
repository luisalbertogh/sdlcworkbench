/**
 * 
 */
package net.luisalbertogh.sdlc;

/**
 * @author garcluia
 *
 */
public final class FooClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("I am calling from Submodule 01 - FO");
		System.exit(0);
	}
	
	/**
	 * Sum two ints.
	 * @param a - An int
	 * @param b - Another int
	 * @return The sum
	 */
	public int sum(int a, int b){
		return a + b;
	}

}
