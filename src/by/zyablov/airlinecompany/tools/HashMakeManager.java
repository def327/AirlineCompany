
package by.zyablov.airlinecompany.tools;

/**
 * Class {@code HashMakeManager} is used to generate an int hash value using a
 * String argument.
 *
 */
public class HashMakeManager {

	/**
	 * Returns a hash value of String type argument.
	 * 
	 * @param hashingString
	 *            - a String type argument for to get hash
	 * 
	 * @return an int type hash value
	 */
	public static int createHashValue(String hashingString) {

		char[] symbolsArray = hashingString.toCharArray();
		int hash = 0;

		for (char iter : symbolsArray) {
			hash += iter;
			hash += (hash << 10);
			hash ^= (hash >> 6);
		}
		hash += (hash << 3);
		hash ^= (hash >> 11);
		hash += (hash << 15);

		return hash;
	}
}
