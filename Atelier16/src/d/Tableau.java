package d;

import util.Compteur;

public class Tableau {

	public static void main(String[] args) {
		int twoPowers[] = new int[20];
		for (int i = 0; i < twoPowers.length; i++) {
			twoPowers[i] = (int) Math.pow(2, i);
		}
		for (int i = 0; i < twoPowers.length; i++) {
			System.out.println(twoPowers[i]);
		}

		Compteur tc[] = new Compteur[20];
		for (int i = 0; i < tc.length; i++) {
			tc[i] = new Compteur((int) Math.pow(2, i));
		}
		for (int i = 0; i < tc.length; i++) {
			System.out.println(tc[i]);
		}
	}

}
