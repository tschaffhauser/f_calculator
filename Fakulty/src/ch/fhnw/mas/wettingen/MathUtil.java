package ch.fhnw.mas.wettingen;

public class MathUtil {
	
	MathUtil() {
	}
	
	public static long faculty(int n) {
		long resultat = 1;
		for(int i = 2; i <= n ; i = i + 1 ) {
			resultat = resultat * i;
		}
		return resultat;
	}
}
