package ch.fhnw.mas.wettingen;

/**
 * This class includes several mathematical functions.
 * @author Alessandro Mascaro and Thomas Schaffhauser
 */
public class MathUtil {
	/**
	 * This method calculates the faculty of the input.
	 * @param n input
	 * @return faculty of input
	 */
	public static long faculty(int n) {
		long resultat = 1;
		for(int i = 2; i <= n ; i = i + 1 ) {
			resultat = resultat * i;
		}
		return resultat;
	}
}