package d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TstList {

	public static void main(String[] args) {
		List<Compteur> cpts = new ArrayList<Compteur>();
		for (int i = 0; i < 10; i++) {
			cpts.add(new Compteur(i));
		}
		Iterator<Compteur> ii = cpts.iterator();
		while(ii.hasNext())
			System.out.println(ii.next());
	}

}
