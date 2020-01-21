package d;

import java.util.Set;
import java.util.TreeSet;

public class TstTreeSet {

	public static void main(String[] args) {
		Set<Compteur> cpts = new TreeSet<Compteur>();
		for (int i = 0; i < 10; i++) {
			cpts.add(new Compteur(i));
		}
		for (Compteur compteur : cpts) {
			System.out.println(compteur);
		}
	}

}
