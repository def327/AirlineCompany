
package by.zyablov.airlinecompany.interfaces;

/**
 * Interface {@code BuilderBehavior} is used to create objects of different
 * classes with many fields.
 * 
 * @author Дмитрий
 *
 */
public interface BuilderBehavior {

	/**
	 * Returns a created object.
	 * 
	 * @return a created object with initialized fields.
	 */
	Object getResult();
}
