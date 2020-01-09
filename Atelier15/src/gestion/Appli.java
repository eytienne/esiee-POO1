package gestion;

import util.Compteur;

public class Appli {

	public static void main(String[] args) {
		Compteur c1 = new Compteur();
		c1.increment();
		System.out.println(c1);

		int n = c1.get();
		System.out.println("n: " + n);

		c1.init();
		System.out.println(c1);

		Compteur c2 = new Compteur(3);
		c2.init(15);
		System.out.println(c2);

		c1.init(c2);
		System.out.println(c1);

		Compteur c3 = new Compteur(c2);
		System.out.println(c3);
		
		if (c1.equals(c2)) {
			System.out.println("c1 et c2 ont le meme etat");
		} else {
			System.out.println("c1 et c2 ont des etats differents");
		}
	}

}
