package clases;

public class Matematicas {

	public static int absoluto (int a) {
		if (a < 0) {
			a=-a;
		}
		return a;
	}
		
	public static double absoluto (double a) {
		if (a < 0) {
			a=-a;
				}
		return a;
	}
	public static int maximo (int a, int b ) {
		if (a > b) {
			return a;
	}
	return b;

	}
	public static double maximo (double a, double b) {
		if (a >= b) {
		return a;	
		}
		return b;
	}
	public static int minimo (int a, int b ) {
		if (a > b) {
			return b;
	}
	return a;

	}
	public static double minimo (double a, double b ) {
		if (a > b) {
			return b;
	}
	return a;

	}
	public static int redondear (double a) {
		if (a -(int) a >= 0.5) {
			return (int) a + 1 ;
	}
	return (int) a;

	}
	public static int redondearalza (double a) {
		if (a != (int) a ) {
			return (int) a + 1 ;
	}
	return (int) a;
	

	}
}
