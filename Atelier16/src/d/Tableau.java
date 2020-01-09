package d;

import util.Compteur;

public class Tableau {

	public static void main(String[] args) {
		int twoPowers[] = new int[20];
		twoPowers[0] = 1;
		for (int i = 1; i < twoPowers.length; i++)
			twoPowers[i] = twoPowers[i - 1] * 2;
		for (int i = 0; i < twoPowers.length; i++)
			System.out.println(twoPowers[i]);

		Compteur tc[] = new Compteur[20];
		tc[0] = new Compteur(1);
		for (int i = 1; i < tc.length; i++)
			tc[i] = new Compteur(tc[i - 1].get() * 2);
		for (int i = 0; i < tc.length; i++)
			System.out.println(tc[i]);
	}

}
